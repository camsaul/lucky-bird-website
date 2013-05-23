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
                
                
                
                [:p#intro "Luckybird was founded in the fall of 2012 to create useful apps that make life more awesome.  Come fly with us."]]
                
                [:div#indi
                	[:h2 "Cameron Saul"]
                [:A	[:p
                	[:a {:href "https://twitter.com/ael1as"}[:img {:src "images/campic.jpg" :name "Cam Saul"}]]
                	"Noah attended UC Davis where he studied International Relations and Psychology. After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo. When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups. After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee. Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]]
                
                
                
                [:div#indi
                	[:h2 "Noah Sidman-Gale"]
                	[:p
                	[:a {:href "https://twitter.com/Noahtorious"}[:img {:src "images/noahpic.jpg" :name "Noah Sidman-Gale"}]]
                	 "Noah attended UC Davis where he studied International Relations and Psychology.  After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo.  When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups.  After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee.  Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]
                
                
                [:div#indi
                	[:h2 "Lucky"]
                	[:p
                	[:a {:href "http://www.deterapigeon.com/21-amazing-facts-about-pigeons.htm"}[:img {:src "images/luckpic.jpg" :name "Lucky the pigeon"}]] 
                	"Noah attended UC Davis where he studied International Relations and Psychology. After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo. When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups. After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee. Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]
                
                
                [:div#indi
                	[:h2 "Rasta"]
                	[:p
                	[:img {:src "images/sunny_toucan.jpg" :name "Cam Saul"}]
                	"Noah attended UC Davis where he studied International Relations and Psychology. After graduating, he moved to Argentina where he worked as a journalist, ate steak, and assimilated himself as a true blue boludo. When he returned to the states Noah got a job as the marketing intern for Switchcam while they went through 500 Startups. After the program, Noah joined another 500 Startups company, Safe Shepherd, as their first employee. Eventually the call to become a founder was too strong and Noah left to start LuckyBird."]
                ]
                
                
                
                ])]))
                
                