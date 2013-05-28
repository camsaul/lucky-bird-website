(ns website.about
  (:use hiccup.page
        hiccup.core
        compojure.core
        website.shared))
        
(defn about []
  (make-page ""
             [:div#about
              (container-and-row
               [:body
                
                [:div#intro 
                
                
                
                [:p#intro "Useful apps that make life more awesome.  Come fly with us."]]
                
                [:hr]
                
                [:div#indi
                	[:h1 "Cameron Saul"]
                	[:h2 [:i "Bird master, 1337 hacker, known to many as DJ Ael1as"]]
                [:A	[:p
                	[:a.img {:href "https://twitter.com/ael1as"}[:img {:src "images/campic.jpg" :name "Cam Saul"}]]
                	"Noah attended UC Davis where he studied International Relations and Psychology. After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo. When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups. After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee. Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]]
                
                
                
                [:div#indi
                	[:h1 "Noah Sidman-Gale"]
                	[:h2 [:i "Pigeon whisperer, Bay Area sherpa, part-time poet"]]
                	[:p
                	[:a.img {:href "https://twitter.com/Noahtorious"}[:img {:src "images/noahpic.jpg" :name "Noah Sidman-Gale"}]]
                	 "Noah has been a lover of mobile since 2010 when he and Cam made their first iOS app together at UC Davis.  He earned his stripes going through" [:a {:href "http://500.co/"} " 500 Startups "]  "with" [:a {:href "http://make.switchcam.com/?ref=noah"} " Switchcam "] ", and then joining" [:a {:href "https://www.safeshepherd.com/?ref=noah"} " Safe Shepherd "] "as employee #1.  He has mad skills at Super Smash Bros. (N64 version of course) and claims that if he were a ninja turtle he’d be Leonardo."]
                ]
                
                
                [:div#indi
                	[:h1 "Lucky"]
                	[:h2 [:i "Maker of nests, destroyer of pigs"]]
                	[:p
                	[:a.img {:href "http://www.deterapigeon.com/21-amazing-facts-about-pigeons.htm"}[:img {:src "images/luckypicnice.png" :name "Lucky the pigeon"}]] 
                	"Before Luckybird, Lucky lived in China Town awaiting her fate of being turned into a pigeon soup.  As Luck would have it, Cam was walking around the area and decided it was a good day to buy a fluffy little pigeon.  Thus Lucky was named Lucky, as she is Lucky to be alive today.  Lucky is quite the socialite - when shes not in the office she can be found jet setting with " [:a {:href "https://twitter.com/Skrillex/status/317356876687896576"} "Skrillex, "] [:a {:href "http://www.youtube.com/watch?v=OveIXobFCTI"} "Mike Tyson, "] "and" [:a {:href "http://raysroadreview.com/nikola-teslas-white-pigeon-by-kate-ladew/"} "  Nikola Tesla."]]
                ]
                
                
                [:div#indi
                	[:h1 "Rasta"]
                	[:h2 [:i "Loves blueberries and reggae, also Lucky's nemesis"]]
                	[:p
                	[:img {:src "images/rasta.png" :name "Cam Saul"}]
                	"Noah has been a lover of mobile since 2010 when he and Cam made their first iOS app together at UC Davis.  He earned his stripes going through 500 Startups with Switchcam, and then joining Safe Shepherd as employee #1.  He has mad skills at Super Smash Bros. (N64 version of course) and claims that if he were a ninja turtle he’d be Leonardo."]
                ]
                
                
                
                ])]))
                
                