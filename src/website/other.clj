(ns website.other
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
				
				[:p "In early 2013 LuckyBird competed in the Mozilla Ignite challenge to, 'design and build apps for the faster, smarter Internet of the future.'  Specifically a future where:"]
				
				[:ul 
				[:li "There are no limits on how fast information can travel."]
				[:li "Processor speed is never a bottleneck."]
				[:li "Your network adapts to your app, instead of the other way around."]
				[:li "You can place processing and data transport wherever you want on the network."]
				[:li "You can dynamically provision and program routers along the way, as if the network itself were one giant LAN."]]
				
				[:p "We immediately thought to ourselves ‘ with unlimited computing power and gigabit Internet, how could we make public transit better?’"]
	
				
				[:img {:src "images/transittraffic.jpg" :name "traffic" :border 0}]
				
				[:p "Our first proposal for the challenge was a huge vision of an overarching network that connected transit users, planners, and operators.  We saw how users interacted with MobileMuni, and imagined a world where location data would be streamed between the user and the transit operator in order to create optimal bus routes in real-time."]
				
				[:p "This was a sexy, futuristic vision, but it quickly became apparent that building a prototype would require extensive involvement with all the local transit agencies (a bureaucratic nightmare) and would take years to be implemented in any shape or form.  We wanted to build something that could provide value now, but could also scale for a future when unrestricted networks and gigabit Internet is the norm.  So we took a step back and did the most important thing anyone building a product can do, we talked to users."]
				
				[:p "In this case ‘talking to users’ meant getting in touch with transit agencies and other transit professionals.  We talked with lots of transit professionals, but the most helpful was Chris Pangilinan of the SFMTA.  Chris told us that the two biggest questions transit planners face is where and why vehicles are slowed down on their route, and how do they ensure that their system is providing service to the places people need to go.  With these questions in mind, we got to work."]
				
				[:p "We knew that we had to develop tools that could assist the SFMTA in analyzing the massive amounts of data that they collected everyday to get closer to answering the questions of where and why vehicles are slowed down on their route, and how do they ensure that their system is providing service to the places people need to go.  While we were able to get vehicle location data from NextBus, we had no idea how to get the passenger data about when and where people got on and off of stops.  Luckily, Chris let us know about an international urban data challenge that the SFMTA supplied a weeks worth or passenger data for.  We immediately downloaded the file (it had over 6,000,000 data points, which is pretty insane for only a week of data)."]
				
				[:p "While I was talking to users, Cam was learning Clojure; a modern dialect of Lisp built for functional programming.  We wanted to build our project in Clojure, as it is designed from the ground up to be highly parallel, meaning that the framework we built would be able to work not only now, but would also scale for a future where there is no limit to how fast information can travel and processing speed is never a bottle neck."]
				
				[:p "After weeks of development, our end product was a platform that analyzes transit and urban data to uncover usage and traffic trends that can help transit authorities make smarter decisions around scheduling and route planning.  We are not data scientists, but we modeled the data to reflect route usage and efficiency, specifically showing the on and off boarding at different stops along a route and also where on the route buses were getting ahead of or behind schedule."]
				
				[:img {:src "images/ignitedata.png" :name "wobble" :border 0}]
				
				[:p "With only a week of user data (and only for certain routes) this analysis platform is far from complete.  While we are continuing to add to the project, we decided to open source all of our code on Github so that other developers and transit professionals can create their own analysis tools and models on top of our platform."]
				
				[:P "Our platform enables people to model all types of data that effect public transit in their cities.  Questions like how local events and weather impact route times, or how much money an agency can save annually by removing buses from underused routes, can finally be answered by plugging the appropriate data and data modeling techniques into our framework.  One day when gigabit Internet is the norm and processing speeds are fast enough, millions (if not billions) of data points can be analyzed and modeled in real-time, enabling transit planners to optimize and better understand the massive systems they control."]
				
				[:p "LuckyBird would like to give special thanks to Mozilla Ignite’s Will Barkis for all of his time, guidance, and encouragement in making our project come to life.  We would also like to thank Chris Pangilinan of the SFMTA for giving us a big picture view of the problems that transit planners are faced with when it comes to data and understanding their system.  Lastly, we would like to thank Rich Hickey, the creator of Clojure, for inventing such an incredibly dynamic language to write our project in."]
				
				[:p "If you would like to use the framework we built for this challenge it has all been open sourced here on Github."]
				
					
				

				])]))
						
(defroutes other-page-routes
  (GET "/mozilla.html" [] (Mozilla)))