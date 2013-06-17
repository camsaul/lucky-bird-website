(ns website.shared
  (:use hiccup.core
        hiccup.page)
  (:require [clojure.string :as str]))

(defn container-and-row
  [& forms]
  `[:div.container
    [:div.row
     ~@forms]])

(defmacro image [src & kvs]
  [:img `(assoc {:src ~src} ~@kvs)])

(defn ul [& items]
  [:ul
   (map #(vector :li %) items)])

(defn with-links
  "utility to write a string with a lot of links in it. replaces things in brackets like this: [http://camsaul.com my link] with proper <a> links."
  [& s]
  (str/replace (apply str s) #"\[([^\s]+)\s([^\]]+)]" "<a href=\"$1\">$2</a>"))

(defn header [title]
  [:header
   (container-and-row
    [:div.span4
     [:span.cvhelper]
     [:a {:href "/"}
     [:img#logo {:src "images/LB_logo.png" :alt "Luckybird"}]]]
    
    [:div.span8
     [:span.cvhelper]
     [:ul#topnav
     
     [:li [:a {:href "http://www.getluckybird.com/blog/" } [:b "Blog"]]]
     [:li [:a {:href "about.html" } [:b "About"]]]
     [:li [:a {:href "mailto:founders@getluckybird.com" } [:b "Contact"]]]
     ]]
     
     
    )])



(defn footer-nav
  "links is a collection of [text link] pairs"
  [name links]
  [:div.nav.span3
   `[:ul
     [:li [:b ~name]]
     ~@(mapv (fn [[text link]]
               (vector :li [:a {:href link} text]))
             links)]])

(defn footer []
  [:div#footer
   (container-and-row
    (footer-nav "All Apps" [		["MobileMuni" "mobile_muni_sf.html"]
    								["MobileMBTA" "mobile_mbta.html"]
									["MobileCTA" "mobile_cta.html"]
									["MobileMetro DC" "mobile_metro_dc.html"]
									["Mobile AC Transit" "mobile_ac_transit.html"]
									["MobileTTC" "mobile_ttc.html"]
    								["BandFunk" "bandfunk.html"]
                                    ["Gymspired" "gymspired.html"]])
    (footer-nav "More Info" [["About" "about.html"]
                             ["Mozilla Ignite" "mozilla.html"]
                             ["Blog" "http://www.getluckybird.com/blog/"]
                             ["Contact Us" "mailto:founders@getluckybird.com"]
                             ])
    [:div#copyright.span6
     [:br]
     "Copyright 2013 LuckyBird Inc."])])

(defn include-less [less]
  [:link {:rel "stylesheet/less" :type "text/css" :href less}])

(defn make-page [title & contents]
  (html5
   [:head
    [:title (if title
              (str title " | LuckyBird, Inc.")
              "LuckyBird, Inc.")]
    (map include-css ["http://fonts.googleapis.com/css?family=Source+Sans+Pro%7CArvo%7CDroid+Serif%7CDroid+Sans%7CUbuntu%7COpen+Sans%7CPT+Serif:700italic"
                      "css/bootstrap.min.css"])
    (include-less "css/luckybird.less")
    (map include-js ["http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"
                     "http://platform.twitter.com/widgets.js"
                     "js/bootstrap.min.js"
                     "js/less-1.3.3.min.js"])]
   `[:body
     ~(header title)
     ~@contents
     ~(footer)]))
