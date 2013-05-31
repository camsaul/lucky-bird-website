(ns website.apps
  (:use hiccup.page
        hiccup.core
        compojure.core
        website.shared
        website.apps-helper))

(defpage BandFunk
  (app-image "images/bandfunk_main_page.png" "BandFunk App Image")
  (bullet-points
   [["All Your Favorite Artists, Bands, and DJs"
     "Keep tabs on your favorite DJs, bands, and superstars all in one app!  From Skrillex, to Lady Gaga, to Bad Religion - you will always have the latest news on your favorite artists and will know when they are playing near you!"]
    ["Be the First to Know About Shows"
     "With the tap of a finger, BandFunk lets you follow as many artists, bands, and DJs as your hart desires. When musicians you follow schedule a show in your city it will automatically be added to the event calendar in BandFunk.  Never miss a show again!"]
    ["The Most In-Depth Biographies"
     "BandFunk offers the most in-depth biographies of your favorite artists.   Look at cool photos, learn where they came from, who their biggest influence was, and how they make such awesome music."]
    ["Discover New Artists and Music"
     "Whenever you follow a new artist in BandFunk, you can see a list of artists that are similar to them.  Be sure to check out the Related Artists page to discover awesome new music and musicians that you would have never known about!"]])
  (app-store-links
   [:ios "https://itunes.apple.com/us/app/bandfunk/id590465611?mt=8"
    "MobileMuni for iOS"]
   [:wp  "http://www.windowsphone.com/en-us/store/app/bandfunk/6a46fbb2-b4ac-44de-bd5b-e1a0e67846fa"
    "MobileMuni for Windows Phone"]))

(defpage Gymspired
  (app-image "images/iphone_gym.png" "Gymspired App Image")
  (bullet-points
   [["Simply Awesome Fitness Calculators"
     (ul
      "One Rep Max"
      "Body Mass Index (BMI)"
      "Body Fat"
      "Basal Metabolic Rate"
      "Ideal Weight"
      "Lean Body Weight"
      "Macronutrients")]
    ["Weight Loss and Workout Tips"
     "Stay inspired with tips from the very best fitness bloggers on the Internet!  Learn tips to lose weight fast, gain muscle, and maximize your workouts.  If you love a tip or a blogger you can go right to their site from the app!"]
    ["Easily snap Before & After Photos"
     "Before and after pictures let you can visually track your progress towards achieving your fitness goals.
      Getting in great shape isn't easy, but when you see how good you you're starting to look, you won't be
      able to help but stay motivated."]
    ["Stay Gymspired on Twitter"
     "Connect with other people dedicated to healthy living through the live #Gymspired twitter stream."]])
  (app-store-links
   [:ios "https://itunes.apple.com/ke/app/gymspired/id497281207?mt=8" "Gymspired for iOS"]))

(defpage MobileMuni
  (app-image "images/iphone_lb_muni.png" "MobileMuni Transit App San Francisco Map")
  (bullet-points
   
   [["Beautiful Map of San Francisco"
     "All transit directions and times are displayed on a beautiful map- so you always know where you are, and where you're going."
     "images/feat_icon1.png"]
    ["Real-time Transit Tracker"
     "We work with cities to use open data so that you have the best, most up-to-date information.  Never miss your bus again with this app!"
     "images/feat_icon2.png"]
    ["Bus, Light Rail, and Subway"
     "Whether you're taking the bus, subway, or light rail, MobileMuni provides the best routes and fastest public transit times for the San Francisco MUNI.  No matter if you have an iPhone, Android, or Windows Phone; the app is on all three!"
     "images/feat_icon3.png"]
    ["Localized Schedule Alerts"
     "Cancelled lines, backed-up busses, late trains?  We are the only transit app with real-time alerts so that you are always in the loop with whats going on in San Francisco."
     "images/feat_icon4.png"]])
  (app-store-links
   [:ios "https://itunes.apple.com/us/app/mobilemuni-the-sf-muni-app/id526969058?mt=8"
    "MobileMuni for iOS"]
   [:wp  "http://www.windowsphone.com/en-us/store/app/mobilemuni/e15da5a7-6efa-454b-a4e3-bdad0ebc711f"
    "MobileMuni for Windows Phone"]
   [:android "https://play.google.com/store/apps/details?id=com.notoriousapps.MobileMuni"
    "MobileMuni for Android"]))

(defpage MobileCTA
  (app-image "images/iphone_lb_cta.png" "MobileCTA Transit App Chicago Map")
  (bullet-points
   [["Beautiful Map of Chicago"
     "All transit directions and times are displayed on a beautiful map- so you always know where you are, and where you're going."
     "images/feat_icon1.png"]
    ["Real-time Transit Tracker"
     "We work with cities to use open data so that you have the best, most up-to-date information.  Never miss your bus again with this app!"
     "images/feat_icon2.png"]
    ["Bus, Light Rail, and Subway"
     "Whether you're taking the bus, subway, or light rail, MobileCTA provides the best routes and fastest public transit times for the Chicago CTA."
     "images/feat_icon3.png"]
    ["Localized Schedule Alerts"
     "Cancelled lines, backed-up busses, late trains?  We are the only transit app with real-time alerts so that you are always in the loop with whats going on in Chicago."
     "images/feat_icon4.png"]])
  (app-store-links
   [:ios "https://itunes.apple.com/us/app/mobilecta-the-chicago-cta-app/id580283583?mt=8"
    "MobileCTA for iOS"]))

(defpage MobileMBTA
  (app-image "images/iphone_lb_mbta.png" "MobileMBTA Transit App Boston Map")
  (bullet-points
   [["Beautiful Map of Boston"
     "All transit directions and times are displayed on a beautiful map- so you always know where you are, and where you're going."
     "images/feat_icon1.png"]
    ["Real-time Transit Tracker"
     "We work with cities to use open data so that you have the best, most up-to-date information.  Never miss your bus again with this app!"
     "images/feat_icon2.png"]
    ["Bus, Light Rail, and Subway"
     "Whether you're taking the bus, subway, or light rail, MobileMBTA provides the best routes and fastest public transit times for the Boston MBTA."
     "images/feat_icon3.png"]
    ["Localized Schedule Alerts"
     "Cancelled lines, backed-up busses, late trains?  We are the only transit app with real-time alerts so that you are always in the loop with whats going on in Boston."
     "images/feat_icon4.png"]])
  (app-store-links
   [:ios "https://itunes.apple.com/us/app/mobilembta-boston-mbta-app/id536372346?mt=8"
    "MobileMBTA for iOS"]
   [:wp  "http://www.windowsphone.com/en-us/store/app/mobilembta/8b3f7522-441e-411c-8609-a8e916852ca3"
    "MobileMBTA for Windows Phone"]))

(defpage MobileMetroDC
  (app-image "images/iphone_lb_metrodc.png" "MobileMetro Transit App Washington DC Map")
  (bullet-points
   [["Beautiful Map of Washington DC"
     "All transit directions and times are displayed on a beautiful map- so you always know where you are, and where you're going."
     "images/feat_icon1.png"]
    ["Real-time Transit Tracker"
     "We work with cities to use open data so that you have the best, most up-to-date information.  Never miss your bus again with this app!"
     "images/feat_icon2.png"]
    ["Bus, Light Rail, and Subway"
     "Whether you're taking the bus, subway, or light rail, MobileMetro DC provides the best routes and fastest public transit times for the Washington DC Metro."
     "images/feat_icon3.png"]
    ["Localized Schedule Alerts"
     "Cancelled lines, backed-up busses, late trains?  We are the only transit app with real-time alerts so that you are always in the loop with whats going on in Washington DC."
     "images/feat_icon4.png"]])
  (app-store-links
   [:ios "https://itunes.apple.com/us/app/mobilemetro-dc-dc-metro-app/id578428630?mt=8"
    "MobileMetro DC for iOS"]))

(defpage MobileTTC
  (app-image "images/iphone_lb_ttc.png" "MobileTTC Transit App Toronto Map")
  (bullet-points
   [["Beautiful Map of Toronto"
     "All transit directions and times are displayed on a beautiful map- so you always know where you are, and where you're going."
     "images/feat_icon1.png"]
    ["Real-time Transit Tracker"
     "We work with cities to use open data so that you have the best, most up-to-date information.  Never miss your bus again with this app!"
     "images/feat_icon2.png"]
    ["Bus, Light Rail, and Subway"
     "Whether you're taking the bus, subway, or light rail, MobileTTC provides the best routes and fastest public transit times for the Toronto TTC."
     "images/feat_icon3.png"]
    ["Localized Schedule Alerts"
     "Cancelled lines, backed-up busses, late trains?  We are the only transit app with real-time alerts so that you are always in the loop with whats going on in Toronto."
     "images/feat_icon4.png"]])
  (app-store-links
   [:ios "https://itunes.apple.com/us/app/mobilettc-the-toronto-ttc-app/id575815093?mt=8"
    "MobileTTC for iOS"]
   [:wp  "http://www.windowsphone.com/en-us/store/app/mobilettc/386c3b82-14ff-48a9-8653-f417136c58f0"
    "MobileTTC for Windows Phone"]))

(defpage MobileMetro
  (app-image "images/iphone_lb_metrola.png" "MobileMetro Transit App Los Angeles Map")
  (bullet-points
   [["Beautiful Map of Los Angeles"
     "All transit directions and times are displayed on a beautiful map- so you always know where you are, and where you're going."
     "images/feat_icon1.png"]
    ["Real-time Transit Tracker"
     "We work with cities to use open data so that you have the best, most up-to-date information.  Never miss your bus again with this app!"
     "images/feat_icon2.png"]
    ["Bus, Light Rail, and Subway"
     "Whether you're taking the bus, subway, or light rail, MobileMetro provides the best routes and fastest public transit times for the Los Angeles Metro."
     "images/feat_icon3.png"]
    ["Localized Schedule Alerts"
     "Cancelled lines, backed-up busses, late trains?  We are the only transit app with real-time alerts so that you are always in the loop with whats going on in LA."
     "images/feat_icon4.png"]])
  (app-store-links
   [:ios "https://itunes.apple.com/us/app/mobilemetro-the-la-metro-app/id534503123?mt=8"
    "MobileMetro for iOS"]
   [:wp  "http://www.windowsphone.com/en-us/store/app/mobilemetro-la/e94080b8-0d37-4de8-9199-c8b2faea144d"
    "MobileMetro for Windows Phone"]))
    
(defpage MobileACTransit
  (app-image "images/iphone_lb_actransit.png" "Mobile AC Transit App Bay Area Map")
  (bullet-points
   [["Beautiful Map of the Bay Area"
     "All transit directions and times are displayed on a beautiful map- so you always know where you are, and where you're going."
     "images/feat_icon1.png"]
    ["Real-time Transit Tracker"
     "We work with cities to use open data so that you have the best, most up-to-date information.  Never miss your bus again with this app!"
     "images/feat_icon2.png"]
    ["Bus, Light Rail, and Subway"
     "Whether you're taking the bus, subway, or light rail, Mobile AC Transit provides the best routes and fastest public transit times for the Bay Area's AC Transit."
     "images/feat_icon3.png"]
    ["Localized Schedule Alerts"
     "Cancelled lines, backed-up busses, late trains?  We are the only transit app with real-time alerts so that you are always in the loop with whats going on in the Bay Area."
     "images/feat_icon4.png"]])
  (app-store-links
   [:ios "https://itunes.apple.com/us/app/mobile-ac-transit/id535014166?mt=8"
    "Mobile AC Transit for iOS"]
   [:wp  "http://www.windowsphone.com/en-us/store/app/mobile-ac-transit/c12c39c6-13a0-4027-bca6-d8adde8f1956"
    "Mobile AC Transit for Windows Phone"]))

(defroutes app-page-routes
  (GET "/bandfunk.html" [] (BandFunk))
  (GET "/mobile_muni_sf.html" [] (MobileMuni))
  (GET "/mobile_cta.html" [] (MobileCTA))
  (GET "/mobile_mbta.html" [] (MobileMBTA))
  (GET "/mobile_metro_dc.html" [] (MobileMetroDC))
  (GET "/mobile_ttc.html" [] (MobileTTC))
  (GET "/mobile_metro_la.html" [] (MobileMetro))
  (GET "/mobile_ac_transit.html" [] (MobileACTransit))
  (GET "/gymspired.html" [] (Gymspired)))

(def cams-computer
  {:number-of-screens 6
   :number-of-touch-screens 1
   :has-keyboard true
   :fat-speakers true})

(def tv-computer
  {:number-of-screens 1})
