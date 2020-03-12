module LibSpec where

import Test.Hspec
import Lib

spec :: Spec
spec = do
  describe "parse" $ do
    it "parses" $ do
      someFunc `shouldBe` "someFunc"
