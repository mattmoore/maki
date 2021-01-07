# Compiler Overview

## Structure

Maki is broken down into phases.

### `SyntacticAnalysis`

Accepts source code (as a string) and creates an `AST`.

### `SemanticAnalysis`

Performs analysis on an AST, including type inference, type checking, and call expressions resolution. Generates a `SymbolTable`.

### `IR`

Generates an intermediate representation from the `AST`. This is to prepare for lowering the program for specific targets (native/JVM/etc...).

### `CodeGen`

Converts the IR tree from the `IR` phase to platform-specific targets. This is where JVM bytecode and/or LLVM codegen happens.