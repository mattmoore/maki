module LibSpec where

import Test.Hspec

spec :: Spec
spec = do
  describe "parse" $ do
    it "parses" $ do
      1 `shouldBe` 1
