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

#### Original repository

https://github.com/jdmesalosada/selenium-framework-poc
