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

#### Run Elasticsearch and Kibana
- `docker-compose up`
- Elasticsearch: http://localhost:9200
- Kibana: http://localhost:5601
- If Elasticsearch does not start in Windows (wsl), use this command: `sudo sysctl -w vm.max_map_count=262144`

#### URL of Automation Demo Site

http://demo.automationtesting.in/Register.html

#### URL of webpage where we can download the driver for chrome

https://chromedriver.chromium.org/downloads

#### URL of webpage where we can download the driver for firefox

https://github.com/mozilla/geckodriver/releases

#### Documentation about Page Factory with Selenium

https://github.com/SeleniumHQ/selenium/wiki/PageFactory

#### Documentation about Cucumber Reporting Plugin

https://gitlab.com/monochromata-de/cucumber-reporting-plugin

#### Folder where reports are created (where report-feature_3752441683.html is an example)

`selenium-framework-poc\target\cucumber\cucumber-html-reports\report-feature_3752441683.html`

#### Original repository

https://github.com/jdmesalosada/selenium-framework-poc
