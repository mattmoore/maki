module LibSpec where

import Test.Hspec
import Lib

import Text.ParserCombinators.Parsec
import Control.Applicative hiding ((<|>), optional, many)

alwaysTrue :: Parser Bool
alwaysTrue = pure True

anyString :: Parser String
anyString = many anyChar

anyDigit :: (Integral a, Read a) => Parser a
anyDigit = read <$> many1 digit
-- Same as:
-- int = fmap read $ many1 digit

-- main = print $ parse alwaysTrue "I'm just a description string ignore me" "I will be parsed"

spec :: Spec
spec = do
  describe "alwaysTrue" $ do
    it "returns true" $ do
      (parse alwaysTrue "hello" "hello world") `shouldBe` (Right True)

  describe "anyString" $ do
    it "returns same string passed in" $ do
      (parse anyString "String parser" "hello world") `shouldBe` (Right "hello world")

  describe "int" $ do
    it "returns an integer" $ do
      (parse anyDigit "Int parser" "5") `shouldBe` (Right 5)

    -- (parse anyChar "val x = 5") `shouldBe` "val x = 5"
