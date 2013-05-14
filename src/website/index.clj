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
      [:h1 "We make simple, useful mobile apps. We also kinda have a thing for birds."]])]
     
   [:div#features
    [:div.container
     [:h2 ""]
     (app-links
      ["BandFunk" "images/bandfunk_icon_small.png" "bandfunk.html"]
      ["MobileMuni" "images/mobilemuni_icon.png" "mobile_muni_sf.html"]
      ["Mozilla Ignite" "images/mozilla.png" "mozilla.html"])]]
   
   [:div#team
    [:div.container
     [:h1 "Team"]
     (bios [["Cam Saul" " Bird master, 1337 hacker, known to many as DJ Ael1as" "images/campic.jpg"]
            ["Noah Sidman-Gale" "Bay Area Sherpa, pigeon whisperer, hustler" "images/noahpic.jpg"]
            ["Lucky" "Maker of nests, destroyer of pigs" "images/luckpic.jpg"]
            ["Rasta" "Loves blueberries and reggae" "images/sunny_toucan.jpg"]])]]))
