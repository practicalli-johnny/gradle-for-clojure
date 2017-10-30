(ns hello-gradle.core-test
  (:require [clojure.test :refer :all]
            [hello-gradle.core :refer :all]))

(deftest a-test
  (testing "I am a very simple passing test to see if the test framework is working"
    (is (= 1 1))))

(deftest simple-test
  (testing "I am another simple test to see what test results look like in TeamCity"
    (is (= '(1 2 3 4) [1 2 3 4]))))

(deftest fixed-failing-test
  (testing "Fixed failing test - add more tests and see the results in TeamCity"
    (is (= "I am not a keyword" "I am not a keyword"))))

(deftest
  (testing "More tests to evaluate my clojure skills"
    (is (not (= [1 2 3] {:a 1 :b 2 :c 3})))))

(deftest
  (testing "What else can I test today - a function that does not exist, thats bad, so here is one that passes"
    (clojure.string/includes? "radar" "ada")
    (clojure.string/includes? "constituent" "con")))

;; Note: commenting out a test with #_ causes the TeamCity build to fail.  Test with a local Gradle run on your pc.
