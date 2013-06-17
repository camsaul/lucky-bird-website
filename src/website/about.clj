(ns website.about
  (:use hiccup.page
        hiccup.core
        compojure.core
        website.shared))

(defn about-item
  "Helper fn to make the individual bio items"
  [name link img subtitle & bio]
  [:div#about-item
   [:h1 name]
   [:h2
    [:a.img {:href link} [:img {:src img :name name}]]
    [:i subtitle]]
   [:p (apply with-links bio)]])

(defn about []
  (make-page
   "About"
   [:div#about
    (container-and-row
     [:body
      [:p#intro "Mobile apps that make life more awesome.  Come fly with us."]
      [:hr]
      (about-item
       "Cam Saul"
       "https://twitter.com/ael1as"
       "images/Cambossiest.png"
       "1337 hacker, award-winning designer, amateur handyman, toucan enthusiast, known to many as DJ Ael1as."
       "Cam Saul was born and raised amongst cactii and coyotes in the Mojave desert right outside of LA. Cam hustled his way through college as a mountain bike instructor and waiter, and still managed
       to get fratty, contribute to a few research papers, and join the boxing team along the way.  After one of his [https://itunes.apple.com/us/app/mobilemuni-the-sf-muni-app/id526969058?mt=8
       weekend projects] took off, Cam left his position as an iPhone and Android developer at [http://www.zoosk.com Zoosk] and started LuckyBird. These days, when he's not
       [http://www.core77.com/blog/windows_phone/app_to_the_future_design_challenge_winners_24487.asp winning design awards] and writing l33t Clojure backends in Emacs, Cam can be found backpacking,
       [http://soundcloud.com/ael1as producing tech house beats], doing Crossfit, snowboarding, and volunteering at the [http://www.yelp.com/biz/martin-de-porres-house-of-hospitality-san-francisco
       local soup kitchen].")
      (about-item
       "Noah Sidman-Gale"
       "https://twitter.com/Noahtorious"
       "images/noahpic.jpg"
       "Pigeon whisperer, Bay Area sherpa, community creator"
       "Noah has been a lover of mobile since 2009 when he and Cam made their first iOS app together at UC Davis.  He earned his stripes in user acquisition, community building, and business
       development going through [http://500.co/ 500 Startups] with [http://make.switchcam.com/?ref=noah Switchcam], and then at [https://www.safeshepherd.com/?ref=noah Safe Shepherd] as employee #1.
       He has mad skills at Super Smash Bros. (N64 version of course) and claims that if he were a ninja turtle hed be Leonardo.")
      (about-item
       "Lucky"
       "http://www.deterapigeon.com/21-amazing-facts-about-pigeons.htm"
       "images/luckycute.png"
       nil
       "Before Luckybird, Lucky lived in China Town awaiting her fate of being turned into a pigeon soup.  As Luck would have it, Cam was walking around the area and decided it was a good day to buy a
       fluffy little pigeon.  Thus Lucky was named Lucky, as she is Lucky to be alive today.  Lucky is quite the socialite - when she's not in the office she can be found jet setting with
       [https://twitter.com/Skrillex/status/317356876687896576 Skrillex], [http://www.youtube.com/watch?v=OveIXobFCTI Mike Tyson], and
       [http://raysroadreview.com/nikola-teslas-white-pigeon-by-kate-ladew/ Nikola Tesla.]")
      (about-item
       "Rasta"
       "http://en.wikipedia.org/wiki/Chestnut-mandibled_Toucan"
       "images/rasta.png"
       nil
       "Rasta is the secret identity of a superhero whose power is consuming blueberries faster than your average Jamba Juice. She is an active political advocate, focusing most of her efforts on
      raising awareness of one of the most critical issues affecting America today -- the suprising lack of reggae music being played in offices across the nation. Any other jams -- no matter how
      \"rageous\" -- will be met with a swift and deadly Toucan growl of disapproval.")])]))
