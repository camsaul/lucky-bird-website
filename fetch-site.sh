#!/bin/bash

echo "Make sure you have the Clojure server running on port 3000, b! 'lein ring server'"

# do a recursive fetch of all the site files
wget -r "localhost:3000" -nH

git commit -am "updated output"
git push origin gh-pages
