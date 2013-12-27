(defproject stemmers "0.2.1"
  :description "A collection of stemmers for use in search engines and the like."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2127"]]
  :plugins [[lein-cljsbuild "1.0.1"]]
  :cljsbuild {:builds [{:builds []
                        :source-paths ["target/cljsbuild-crossover"]}]
              :crossovers [stemmers.core stemmers.porter stemmers.soundex]
              :source-paths ["target/cljsbuild-crossover"]}
  :dev-dependencies [[marginalia "0.3.2"]
                     [swank-clojure "1.3.0-SNAPSHOT"]])
