(ns website.index
  (:use hiccup.page
        hiccup.core
        website.index-helper
        website.shared))

(defn page []
  (make-page
   nil
   [:div#home.green-gradient-background
    (container-and-row
     [:div.span12
      [:h1 "Thanks for helping us make MobileMuni the #1 Transit app in San Francisco!"]
      
      [:img {:src "images/mobilemuni_icon.png" :name "MobileMuni" :border 0}]
      [:a {:href "https://itunes.apple.com/us/app/mobilemuni-the-sf-muni-app/id526969058?mt=8"}[:img#store {:src "images/appstore_mm.gif" :width 200 :height 71}]]
      [:a {:href "http://www.windowsphone.com/en-us/store/app/mobilemuni/e15da5a7-6efa-454b-a4e3-bdad0ebc711f"}[:img#store    {:src "images/WindowsPhone_208x67_blk.png" :width 208 :height 69}]]
      [:a {:href "https://play.google.com/store/apps/details?id=com.notoriousapps.MobileMuni"}[:img#store  {:src "images/googleplay.png" :width 200 :height 71}]]
      
      ])]
   
     
   [:div#features
    [:div.container
     [:h2 "Are we in your city?"]
     (app-links
      ["Boston" "images/bostonlogo.png" "mobile_mbta.html"]
      ["Chicago" "images/chicagologo.png" "mobile_cta.html"]
      ["DC" "images/dclogo.png" "mobile_metro_dc.html"]
      ["East Bay" "images/eastbaylogo.png" "mobile_ac_transit.html"]
      ["Toronto" "images/torontologo.png" "mobile_ttc.html"])]]
         
  
   [:div#awards
    [:div.container
     [:h2  "Award Winners"]
     (app-links
      
      ["" "images/mozilla.png" "mozilla.html"]
      ["" "images/logo_apptothefuture.png" "http://apptothefuture.core77.com/"])]]))
