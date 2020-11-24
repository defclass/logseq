(ns frontend.util-test
  (:require [cljs.test :refer [deftest is testing run-tests]]
            [frontend.util :refer [find-first]]))

(deftest test-find-first
  (testing "find-first"
    (is (= 1 (find-first identity [1]))))

  (testing "false demo"
    (is (= 1 "abc"))))
