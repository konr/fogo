(ns fogo.core)


(defn simulate
  [{:keys [cash income interest] :as simulation-data}]
  (iterate (fn [{:keys [cash income interest iteration]}]
             {:iteration (inc iteration)
              :cash (+ cash income (* interest cash))
              :income income
              :interest interest})
           (assoc simulation-data :iteration 0)))
