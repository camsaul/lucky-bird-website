(ns website.apps-helper
  (:use hiccup.page
        hiccup.core
        website.shared))

(defn bullet-points
  "Takes a seq of [title subtitle image?] vectors and creates the app
  bullet points section" [bullet-points] [:div.span8
                                          (->> bullet-points
                                               (map (fn [[title subtitle & img]]
                                                      [:div.span4.app-bullet-point
                                                       (when img
                                                         (image (first img) :width 100 :height 100))
                                                       [:h2 title]
                                                       [:p subtitle]]))
                                               (partition 2)
                                               (map #(apply vector :div.row %)))])

(defn app-store-links
  "takes [:ios/:wp/:android link alt-text] info vectors" [& links]
  [:div#appstore-links
   (map (fn [[app-type link alt-text]]
          [:a {:href link :title "shitty link"}           
           [:img (case app-type
                   :ios {:src "images/appstore_mm.gif" :alt alt-text :width 200 :height 71}
                   :wp {:src "images/WindowsPhone_208x67_blk.png" :alt alt-text :width 208 :height 69}
                   :android {:src "images/googleplay.png" :alt alt-text :width 200 :height 71})]])
        links)])

(defn app-boxes
  "Takes [name image link] vectors of app box info" [& boxes]
  [:div#ourapps.row [:h2.gray "See what else LuckyBird is up to!"]
   (map (fn [[name image link]]         
          [:div.appbox
           [:a {:href link}
            [:img {:src image}]]
           [:p
            name]])
        boxes)])

(defn app-image
  "Creates an image inside div.span4 for an app."
  [img alt]
  [:div.span4
   (image img :width 337 :height 618 :alt alt)])

(defmacro defpage
  [pagename app-image bullet-points app-store-links]
  `(def ~pagename
     (fn []
       (make-page
        '~pagename
        [:div#home
         [:div.container
          [:div.row
           ~app-image
           ~bullet-points]
          ~app-store-links
          (app-boxes
           ["BandFunk" "images/bandfunk_icon_small.png" "bandfunk.html"]
           ["MobileMuni" "images/mobilemuni_icon.png" "mobile_muni_sf.html"]
           ["Gymspired" "images/gymspired_icon.png" "gymspired.html"]
           ["Mozilla Challenge" "images/mozilla.png" "mozilla.html"]
           ["Transportation Apps +" "images/trans_icon1.png" "#"])]]))))
