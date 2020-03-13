module Lib where

import Text.Parsec
import Text.Parsec.String
import Text.Parsec.Expr
import Text.Parsec.Token
import Text.Parsec.Language

import Text.ParserCombinators.Parsec
import Text.ParserCombinators.Parsec.Expr

parse :: String -> String
parse source = source
