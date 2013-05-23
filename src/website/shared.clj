(ns website.shared
  (:use hiccup.core
        hiccup.page))

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



(defn header [title]
  [:header
   (container-and-row
    [:div.span4
     [:span.cvhelper]
     [:img#logo {:src "images/LB_logo.png" :alt "Luckybird"}]]
    [:div.span4
     [:span.cvhelper]
     
     ]
    [:div.span4
     [:span.cvhelper]
     [:iframe#facebook {:src "http://www.facebook.com/plugins/like.php?href=http%3A%2F%2Fwww.facebook.com%2Fluckybirdinc%3Ffref%3Dts&send=false&layout=standard&width=300&show_faces=false&font&colorscheme=light&action=like&height=35" :scrolling "no" :frameborder 0 :allowTransparency "true"}
     ]])])



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
    (footer-nav "LuckyBird Apps" [["BandFunk" "bandfunk.html"]
                                  ["MobileMuni" "mobile_muni_sf.html"]
                                  ["Gymspired" "gymspired.html"]])
    (footer-nav "More Info" [["Press" "http://www.getluckybird.com/blog/category/press/"]
                             ["Contact Us" "mailto:founders@getluckybird.com"]
                             ["Blog" "http://www.getluckybird.com/blog/"]])
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
    (map include-css ["http://fonts.googleapis.com/css?family=PT+Serif:700italic"
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
