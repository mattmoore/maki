# MAKI

**Meta-Advanced Kotlin Implementation - _An alternative Kotlin compiler and runtime with advanced metaprogramming capabilities._**

## Why?

Functional programming and metaprogramming. I really like the Kotlin language. Compared to languages like Ruby, however, Kotlin's metaprogramming capabilities are fairly limited.

There are three main goals for my implementation:

1. Better FP support than what exists baked-in to Kotlin currently.
1. A first-class metaprogramming model for use during compilation. There is another project, Arrow-Meta, which does a similar thing. However, the second goal...
1. ...is a new Kotlin runtime that enables metaprogramming after the program is compiled and *while it is running*.

## Meta Features

### Compiler

Note: The compiler features are pretty useful in their own right, but be sure to read through the runtime features as those are really where MAKI shines!

#### Meta-Reflective API

MAKI exposes the parsing system via an API, so the Abstract Syntax Tree (AST) can be accessed and modified when the parser runs. There are some additional features the API will provide:

1. AST Rendering: The parser can render the AST to an image file for easy visual inspection of the program logic. This will help unravel the mystery of how the compiler is interpreting the source.
1. Comparative Inspection: MAKI provides the ability to specify two different Kotlin source versions and diff them. You can either render the diff as a picture, or dump it as a diff file. This is a useful tool for discovering what the compiler is doing with your source, and help trace down bugs or improve performance.
1. Code Generation API: See what the final machine code will look like. You can feed either Kotlin source to the API to get the machine code directly, or you can feed an AST dump to it.

#### Macro System

MAKI contains a macro system that can rewrite source at compile time.

### Runtime Features

#### Meta-Adaptive Runtime

Most programming languages allow you to write your code, compile and execute. Simple enough! MAKI does the same thing but with a twist.

##### Traditional Compilers Lose Data

During the compilation of your program, lots of meta information is lost when generating the binary. While traditional compilers provide a way to go from Kotlin source code to a binary, MAKI provides the ability to go from a binary back to the original Kotlin source code.

The official Kotlin/Java environments provide reflection APIs, but they require the engineer to explicitly program out meta functionality. MAKI provides these capabilities out of the box and for every binary it produces. This means that all the engineer has to do is write their code the way they normally would, and MAKI generates a built-in meta model providing reflection capabilities.

##### The MAKI Runtime Preserves Meta Information From The Compiler

The runtime provides an in-memory AST that can be queried and modified while the program is running. Whenever modifications are made to the runtime AST, the corresponding machine code is updated in-memory, without the need for the program to be recompiled or restarted.

##### Meta Information/Capabilities Requires MAKI-Compiled Binaries

Of course, the ability to go from a binary back to source is only possible with a binary compiled with MAKI. This is because the official Kotlin compilers, like most compilers, do not maintain enough meta data to reconstruct the original source.

I may plan future research to determine if it's possible to have MAKI produce Kotlin source via inference, so that binaries produced by the official compilers can be converted back to Kotlin source. However, it's important to understand that inference would only produce an approximation of what the Kotlin source might have looked like. This is far less useful and is a "maybe" feature at this time.

##### MAKI Provides Runtime "Monkey-Patching"

MAKI will not only provide the ability to "decompile" code back to source from a binary file, but will actually have the ability to dump the AST and subsequent generated Kotlin source from a running program compiled with MAKI. This will be possible without requiring the MAKI compiler to be installed as the meta-capabilities of MAKI are built into every binary it produces.

Since the AST is accessible at runtime, it becomes possible to take snapshots of the runtime AST at any point in time. This is useful if you want to track the changes to the program while it runs. Effectively, you can save the state of the program at any point in time and reload that same state.

## Contributing

This project is open-source and contributions are more than welcome! Feel free to open a pull request! You can also reach out to me at matt@mattmoore.io if you have any questions or want to know how to get started.
