(ns website.mozilla
  (:use hiccup.page
        hiccup.core
        compojure.core
        website.shared))
        
(defn Mozilla []
  (make-page ""
             [:div#mozilla
              (container-and-row
               [:body
                [:h1 "Mozilla Ignite Challenge"]
				
                [:p "In early 2013 LuckyBird competed in the " [:a {:href "https://mozillaignite.org/"} "Mozilla Ignite challenge"] " to design and build apps for the faster, smarter Internet of the future.  Specifically a future where:"]
				
                [:ul 
                 [:li "There are no limits on how fast information can travel."]
                 [:li "Processor speed is never a bottleneck."]
                 [:li "Your network adapts to your app, instead of the other way around."]
                 [:li "You can place processing and data transport wherever you want on the network."]
                 [:li "You can dynamically provision and program routers along the way, as if the network itself were one giant LAN."]]
				
				
                [:img {:src "images/transittraffic.jpg" :name "traffic" :border 0}]
				
                [:p "Our first proposal for the challenge was a huge vision of an overarching network that connected transit users, planners, and operators.  We saw how users interacted with" [:a {:href"http://getluckybird.com/mobile_muni_sf.html"} " MobileMuni" ] " and imagined a world where location data would be streamed between the user and the transit operator in order to create optimal bus routes in real-time."]
				
                [:p "This was a sexy and futuristic vision, but it quickly became apparent that building a prototype of it would be a bureaucratic nightmare and would also probably take years to implement.  We wanted to build something that could provide value now, but could also scale for a future when unrestricted networks and gigabit Internet is the norm.  So we took a step back and did the most important thing anyone building a product can do, we talked to users."]
				
                [:p "In this case talking to users meant getting in touch with transit agencies and other transit professionals.  We talked with lots of transit professionals, but the most helpful was Chris Pangilinan of the SFMTA.  Chris told us that the two biggest questions transit planners face is where and why vehicles are slowed down on their route, and how do they ensure that their system is providing service to the places people need to go.  With these questions in mind, we got to work."]
				
                [:p "We knew that we had to develop tools that could assist the SFMTA in analyzing the massive amounts of data that they collected everyday to get closer to answering the questions of where and why vehicles are slowed down on their route, and how do they ensure that their system is providing service to the places people need to go.  While we were able to get vehicle location data from NextBus, we had no idea how to get the passenger data about when and where people got on and off of stops.  Luckily, Chris let us know about an international urban data challenge that the SFMTA supplied a weeks worth or passenger data for.  We immediately downloaded the file (it had over 6,000,000 data points, which is pretty insane for only a week of data)."]
				
                [:p "While I was talking to users, Cam was learning"
 [:a {:href "http://en.wikipedia.org/wiki/Clojure"} " Clojure"]
 " ; a modern dialect of Lisp built for functional programming.  Cam wanted to build our project in Clojure because it is designed to be highly parallel.  This meant our framework scaled for a gigabit future where there is no limit to how fast information can travel and processing speed is never a bottle neck."]
				
                [:p "After weeks of development, " [:a {:href "http://luckybird-ignite-demo.herokuapp.com/"} "our end project was a platform that analyzes transit and urban data to uncover usage and traffic trends that can help transit authorities make smarter decisions around scheduling and route planning."]  "  We are not data scientists, but we modeled the data to reflect route usage and efficiency, specifically showing the on and off boarding at different stops along a route and also where on the route buses were getting ahead of or behind schedule."]
				
                
                 [:a {:href "http://luckybird-ignite-demo.herokuapp.com/"}[:img {:src "images/ignitedata.png" :name "wobble" :border 0}]]
				
                
                [:p "With only a week of user data (and only for certain routes) this analysis platform is far from complete.  While we are continuing to add to the project, " [:a {:href "https://github.com/CAMMSAUL/MOZILLA-IGNITE-DEMO"} "we decided to open source all of our code on Github"] " so that other developers and transit professionals can create their own analysis tools and models on top of our platform."]
				
                
				
                [:p "LuckyBird would like to give special thanks to Mozilla Ignite’s Will Barkis for all of his time, guidance, and encouragement in making our project come to life.  We would also like to thank Chris Pangilinan of the SFMTA for giving us a big picture view of the problems that transit planners face.   Lastly, we would like to thank Rich Hickey, the creator of Clojure, for inventing such an incredibly dynamic language to write our project in."]
				
                [:p [:h4 "If you would like to use the framework we built for this challenge it has all been open sourced"
                 [:a {:href "https://github.com/CAMMSAUL/MOZILLA-IGNITE-DEMO"} " here on Github."]]]
				
					
				

                ])]))
						
(defroutes mozilla-routes
  (GET "/mozilla.html" [] (Mozilla)))
