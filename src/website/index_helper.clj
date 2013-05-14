(ns website.index-helper
  (:use hiccup.page
        hiccup.core)
  (:require [website.shared :as shared]))

(defn app-links
  "Takes info vecs in the form [name image link]"
  [& info-vecs]
  [:div#apps
   (map (fn [[name image link]]
          [:div.app
           [:div.icon
            [:a {:href link}
             [:img {:src image :name name :border 0}]]]
           name])
        info-vecs)])

(defn bios
  "Takes a seq of [name bio image] for bios."
  [info-vecs]
  [:div.row
   (map (fn [[name bio image]]
          [:div.bio.span3
           [:b name]
            [:br]
           [:img {:src image}]
           [:div.bio_text      
            
            
            bio]])
        info-vecs)])

(defn twitter-timeline []
  [:div.span7
   [:a.twitter-timeline {:href "https://twitter.com/LuckyBirdInc" :data-widget-id "299354296816898048"}
    "Tweets by @LuckyBirdInc"]
   [:script "!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0];if(!d.getElementById(id))
             {js=d.createElement(s);js.id=id;js.src='//platform.twitter.com/widgets.js';
             fjs.parentNode.insertBefore(js,fjs);}}(document,'script','twitter-wjs');"]])
