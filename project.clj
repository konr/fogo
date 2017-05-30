(defproject fogo "0.1.0-SNAPSHOT"
  :description "FIRE calculator"
  :url "https://github.com/konr/fogo"
  :license {:name "GNU General Public License v3.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]]

  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [midje "1.9.0-alpha6"]]}})
