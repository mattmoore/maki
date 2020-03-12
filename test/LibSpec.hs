module LibSpec where

import Test.Hspec
import Lib

spec :: Spec
spec = do
  describe "parse" $ do
    it "parses" $ do
      (parse "x = 5") `shouldBe` "x = 5"
