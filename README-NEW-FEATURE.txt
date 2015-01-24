{\rtf1\ansi\ansicpg1252\cocoartf1343\cocoasubrtf160
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset0 HelveticaNeue;}
{\colortbl;\red255\green255\blue255;\red38\green38\blue38;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 Organic Bananas Feature\
\
It is assumed that 
\f1\fs32 \cf2 \expnd0\expndtw0\kerning0
The "Organic Bananas" item degrade in Quality twice as fast as normal items and At the end of each day system lowers both \'91int\'92 values for every item.
\f0\fs24 \cf0 \kerning1\expnd0\expndtw0 \
\
\
	\
Code Suggestions\
\
It will be good to separate out the logic to handle the normal items and special items in an interface and implement updateQuality method differently for different behaviour.\
\
A specific implementation through a factory pattern also will be good, so that it will be easy to extend for a new item in the feature without breaking the existing functionalities.\
\
\
Git hub\
\
Created a master repository - https://github.com/nishavinod/Exercise.git\
Imported code from https://github.com/SuperMarketPlusPlus/Exercise.git to the repository that is created\
Cloned the project and created a branch out of master branch {\field{\*\fldinst{HYPERLINK "https://github.com/nishavinod/Exercise/tree/ORGANIC-BANANAS-FEATURE-master"}}{\fldrslt ORGANIC-BANANAS-FEATURE-master}}\
And then applied all the changes to this branch, created a pull request with the changes https://github.com/nishavinod/Exercise/pull/1/commits}