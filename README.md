# MAKI (Metaprogramming + Arrow Kotlin Implementation)

Alternative Kotlin compiler built with Flex, Bison and LLVM with a first-class metaprogramming model.

## Why?

In two words? Arrow & (better) Metaprogramming - wrapped together into a compiler! I really like the Kotlin language. Compared to languages like Ruby, however, Kotlin's metaprogramming capabilities are fairly limiting and frustrating.

There are two goals for my implementation:

1. Provide a first-class metaprogramming model. Reflection and modification of the program structure is inherently core to the compiler as well as the runtime. This project is primarily intended as a proof of concept to demonstrate the model I'm thinking of.
1. Bake in many of the functional features from arrow-kt. While arrow works great on the JVM, it doesn't yet (at the time of writing this) support Kotlin Native. Maki is starting out as a native compiler. At some point, I will attempt JVM support, but since the current major goals are to demonstrate a better metaprogramming model, I'm not worrying about JVM at this time.

Assuming my proof of concept works out, as I see it there are a couple of outcomes with the results of this project:

1. Attempt to incorporate my model here into the official Kotlin implementations.
1. Just continue working on this implementation, attempt to get more support, and perhaps folks who need better Kotlin metaprogramming models might find use for my compiler.

## Why the name?

Because the name encapsulates two areas I think a Kotlin implementation should have, and "maki" is a sushi roll. I really like sushi.

## Design

The compiler is broken down into 3 main components:

1. Lexer: Takes the text of the language we're creating and converts it into tokens. This project uses flex. That may change in the future if necessary, but it's sufficient for now.
1. Parser: Converts the tokens into an abstract syntax tree (AST). I'm currently using Bison for this. An AST is the in-memory representation of the program structure.
1. Code Generation: Converts the AST into machine code, making it "runnable" or "executable" on the machine. I'm using LLVM for this project.
