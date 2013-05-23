(ns website.handler
  (:use compojure.core
        hiccup.page
        hiccup.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [website.apps :as apps]
            [website.index :as index]
            [website.about :as about]
            [website.mozilla :as mozilla]))

(defroutes app-routes
  (GET "/" [] (index/page))
  (context nil [] apps/app-page-routes)
  (context nil [] mozilla/mozilla-routes)
  (GET "/about.html" [] (about/about))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
