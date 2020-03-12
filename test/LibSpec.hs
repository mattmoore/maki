module LibSpec where

import Test.Hspec
import Lib

spec :: Spec
spec = do
  describe "parse" $ do
    it "parses" $ do
      (parse "val x = 5") `shouldBe` "val x = 5"
