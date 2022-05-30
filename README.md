# selenium-framework-poc
Example of a mini-framework to execute automated tests using Selenium, Spring, Cucumber.


#### course

https://www.udemy.com/course/curso-creacion-framework-con-selenium-spring-y-cucumber/

#### Run the tests

`mvn clean test -Denvironment=prod
`

#### Run the tests by tags

`mvn clean test -Denvironment=prod  -Dcucumber.options="--tags '@run'"
`

#### First command used for run first scenario before define the steps

`mvn clean test
`

#### Command for tests in different environments

`mvn clean test -Denvironment=dev
`
`mvn clean test -Denvironment=prod
`

#### URL of Automation Demo Site

http://demo.automationtesting.in/Register.html

#### URL of webpage where we can download the driver for chrome

https://chromedriver.chromium.org/downloads

#### URL of webpage where we can download the driver for firefox

https://github.com/mozilla/geckodriver/releases

#### Documentation about Page Factory with Selenium

https://github.com/SeleniumHQ/selenium/wiki/PageFactory

#### Original repository

https://github.com/jdmesalosada/selenium-framework-poc
