(defproject website "1.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "LATEST"]
                 [compojure "LATEST"]
                 [hiccup "LATEST"]]
  :plugins [[lein-ring "LATEST"]]
  :ring {:handler website.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "LATEST"]]}})
