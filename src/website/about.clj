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
                	[:a {:href "https://twitter.com/ael1as"}[:img {:src "images/campic.jpg" :name "Cam Saul"}]]
                	"Noah attended UC Davis where he studied International Relations and Psychology. After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo. When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups. After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee. Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]]
                
                
                
                [:div#indi
                	[:h1 "Noah Sidman-Gale"]
                	[:h2 [:i "Pigeon whisperer, "]]
                	[:p
                	[:a {:href "https://twitter.com/Noahtorious"}[:img {:src "images/noahpic.jpg" :name "Noah Sidman-Gale"}]]
                	 "Noah attended UC Davis where he studied International Relations and Psychology.  After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo.  When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups.  After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee.  Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]
                
                
                [:div#indi
                	[:h1 "Lucky"]
                	[:h2 [:i "Maker of nests, destroyer of pigs"]]
                	[:p
                	[:a {:href "http://www.deterapigeon.com/21-amazing-facts-about-pigeons.htm"}[:img {:src "images/luckypicnice.png" :name "Lucky the pigeon"}]] 
                	"Noah attended UC Davis where he studied International Relations and Psychology. After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo. When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups. After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee. Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]
                
                
                [:div#indi
                	[:h1 "Rasta"]
                	[:h2 [:i "Loves blueberries and reggae, also Lucky's nemesis"]]
                	[:p
                	[:img {:src "images/rasta.png" :name "Cam Saul"}]
                	"Noah attended UC Davis where he studied International Relations and Psychology. After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo. When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups. After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee. Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]
                
                
                
                ])]))
                
                