(ns fogo.core-test
  (:require [clojure.test :refer :all]
            [midje.sweet :refer :all]
            [fogo.core :refer :all]))


(facts "on simulate"
       (->> (simulate {:cash 300.0 :income -100 :interest 0.1})
            (take 3))
       => [{:cash 300.0 :income -100 :interest 0.1 :iteration 0}
           {:cash 230.0 :income -100 :interest 0.1 :iteration 1}
           {:cash 153.0 :income -100 :interest 0.1 :iteration 2}])
