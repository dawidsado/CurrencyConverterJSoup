# CurrencyConverterJSoup 💲

## •	ABOUT 
Basic currency converter which enables conversion based on the amount provided by the user to other currencies. (Note that I focused on main currencies – Euro, US Dollar, British Pound, and Polish Zloty). 
To download actual exchange rates I used the JSoup library and the capability to inspect webpage source code.
Then I parse those values into doubles.

In Calculator class I created methods that are responsible for variety of currency conversions
(zlotyIntoOtherValues is returning the given amount in Zloty and values in the other three currencies, other methods are responsible for conversion from foreign currencies into Zloty).
User is providing the amount in the console right after method is initialized (I used Scanner class).

Using JUnit framework I created unit tests of every method in Downloader, FromZlotyConversions, and IntoZlotyConversions classes.

<br></br>

## •	TECHNOLOGY THAT I USED 🚀
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

<br></br>

## •	Main CLASS 🎥

https://user-images.githubusercontent.com/77989461/191108937-bca6b0c8-575f-4322-994f-7fd84170b68f.mp4

<br></br>

## •	WHAT HAD I PRACTICED DURING THAT PROJECT? 🤔
-	OOP principles
-	Features of JSoup library
-	Making unit tests
-	Finding solutions for problems such as parsing String values to double using a particular regex
-	Analyzing webpage source code (using CSS selectors to get the specific data from the website)
