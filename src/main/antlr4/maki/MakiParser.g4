parser grammar MakiParser;

options { tokenVocab=MakiLexer; }

expr: NUMBER operation NUMBER;

operation: (ADD | SUB | MUL | DIV);