

Organic Bananas Feature

It is assumed that The "Organic Bananas" item degrade in Quality twice as fast as normal items and At the end of each day system lowers both ‘int’ values for every item.


	
Code Suggestions

It will be good to separate out the logic to handle the normal items and special items in an interface and implement updateQuality method differently for different behaviour.

A specific implementation through a factory pattern also will be good, so that it will be easy to extend for a new item in the feature without breaking the existing functionalities.


Git hub

Created a master repository - https://github.com/nishavinod/Exercise.git
Imported code from https://github.com/SuperMarketPlusPlus/Exercise.git to the repository that is created
Cloned the project and created a branch out of master branch ORGANIC-BANANAS-FEATURE-master
And then applied all the changes to this branch, created a pull request with the changes https://github.com/nishavinod/Exercise/pull/1/commits
