all: compiler

lexer:
	flex lex.l

parser: lexer
	bison -d grammar.y

compiler: lexer parser
	clang++ -std=c++14 \
		-o parser \
		$(shell llvm-config --cxxflags --libs) \
		grammar.tab.c \
		lex.yy.c \
		main.cpp

clean:
	rm -rf \
		node \
		lex.yy.c \
		grammar.tab.* \
		parser
