module Lib where

import Control.Monad
import Text.Parsec
import Text.Parsec.String
import Text.Parsec.Expr
import Text.Parsec.Token
import Text.Parsec.Language

import Text.ParserCombinators.Parsec
import Text.ParserCombinators.Parsec.Expr

-- parseChar :: String -> Either ParseError String
-- parseChar = parse Lib.anyChar

-- anyChar :: Parser String
-- anyChar = string "correct"

-- parseNumber :: GenParser Char st String
-- parseNumber = many1 digit
