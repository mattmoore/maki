# Maki Compiler

Maki is a research project to build a compiler that supports multiple languages. The first two languages under development will be Kotlin and Scala.

## Setup

You'll need `sbt 1.3.10`.

To run the tests:

```shell
sbt test
```

To build and run a standalone compiler jar file:

```shell
sbt clean compile assembly
java -jar target/scala-2.13/maki-assembly-0.1.0-SNAPSHOT.jar "val x = 5"
```

## Why?

Having tinkered with a few compilers, I've noticed that many compilers can be difficult to work with and integrate with (compiler plugins, easy access to internals).

The first goal of this compiler is to provide a multi-lingual and multi-target compiler that provides easy integration with its internals via a first-class API.

The second major goal is to make integration of new language grammars as easy as possible:

1. Define a language grammar via ANTLR.
1. Define a parse tree.
1. Define a translation between the parse tree and Maki's built-in abstract syntax tree. From there Maki will do the rest.

## Supported Languages

To start, I'm implementing the current [Kotlin language spec](https://github.com/Kotlin/kotlin-spec). Next on the docket will be Scala. From there, I'll see what catches my fancy.

## Meta Features

### Compiler

Note: The compiler features are pretty useful in their own right, but be sure to read through the runtime features as those are really where Maki shines!

#### APIs

The compiler is structured into phases, and all phases are exposed via a first-class API. This means that all tree structures can be accessed and modified at compile-time via plugins.

#### Multiple Targets

The compiler supports building native targets via LLVM as well as JVM bytecode.

## Contributing

This project is open-source and contributions are more than welcome! Feel free to open a pull request! You can also reach out to me at matt@mattmoore.io if you have any questions or want to know how to get started.

Check out the [compiler docs](docs/README.md)&mdash;a good place to get started if you want to contribute to the compiler itself.