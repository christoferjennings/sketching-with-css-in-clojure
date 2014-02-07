(defproject fioritto "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [hiccup "1.0.4"]
                 [garden "1.1.4"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler fioritto.sketch/ring-handler
         :auto-reload? true
         :auto-refresh? true}
  :main ^:skip-aot fioritto.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
