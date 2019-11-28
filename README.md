# MAKI

**Metaprogramming Advanced Kotlin Implementation - _An alternative Kotlin compiler and runtime with advanced metaprogramming capabilities._**

## Why?

In one word? Metaprogramming! I really like the Kotlin language. Compared to languages like Ruby, however, Kotlin's metaprogramming capabilities are fairly limited.

There are two goals for my implementation:

1. A first-class metaprogramming model for use during compilation. There is another project, Arrow-Meta, which does a similar thing. However, the second goal...
1. ...is a new Kotlin runtime that enables metaprogramming after the program is compiled and *while it is running*.

## Compiler Design

The compiler is broken down into 3 main components:

1. Lexer: Converts the Kotlin source code into tokens.
1. Parser: Converts the tokens into an abstract syntax tree (AST). An AST represents the program structure, giving meaning to the tokens via a grammar.
1. Code Generation: Converts the AST into machine code, making it "runnable" or "executable" on the machine.

## Runtime Design

The runtime provides an in-memory AST that can be queried and modified while the program is running. Whenever modifications are made to the runtime AST, the corresponding machine code is updated in-memory, without the need for the program to be recompiled or restarted.

Since the AST is accessible at runtime, it becomes possible to take snapshots of the AST at any point in time. This is useful if you want to track the changes to the program while it runs. Effectively, you can save the state of the program at any point in time and reload that same state. There are numerous benefits from this capability limited only by one's imagination.

## Does This Run on The JVM?

No. MAKI is a native compiler. The final build is a native binary. However, it will be capable of using the JVM.

Originally, the thought was to build two versions of the compiler - one for the JVM and one for native. However, I realized that for the purposes of this project, due to limitations in the JVM, I would need to build a separate runtime rather than rely on the JVM. That being said, I realize having access to the JVM would be very useful, so this project will eventually support interoperability with the JVM. The goal is to provide this in such a way that you can reference any JVM library into the project, and the compiler will automatically build the necessary interop code to use that library. This feature will come further in the future, as building the compiler and runtime metaprogramming capabilities is my first goal.
