<h1 align="center">Web UI automation project for amazon marketplace <a href="https://www.amazon.com" target="_blank"><img src="https://github.com/Fatalwgx/README/blob/master/icons/amazon_icon.png" width="300" height="100" alt="Logo"/></a></h1>

&#8287;&#8287;&#8287;&#8287;&#8287;
## :open_book: Summary:
- [Technologies and tools](#gear-Technologies-and-Tools-used-in-the-project)
- [Description](#heavy_check_mark-Description)
- [Running tests using Jenkins](#-Running-tests-using-Jenkins)
- [Running tests locally](#computer-Running-tests-locally)
- [Analytics and Reports](#bar_chart-Analytics-and-Reports)
  - [Allure](#-allure)
  - [Telegram](#-telegram)

&#8287;&#8287;&#8287;&#8287;&#8287;
## :gear: Technologies and Tools used in the project

<p align="left">
 <img src="https://github.com/Fatalwgx/README/blob/master/icons/selenoid.svg" title="selenoid" width="50" height="50"  alt="selenoid"/>
 <img src="https://github.com/Fatalwgx/README/blob/master/icons/jenkins.svg" title="Jenkins" width="50" height="50"  alt="jenkins"/>
 <img src="https://github.com/Fatalwgx/README/blob/master/icons/allure.svg" title="Allure" width="50" height="50"  alt="allure"/>
</p>

&#8287;&#8287;&#8287;&#8287;&#8287;
## :heavy_check_mark: Description

> In this project, autotests are written in  <code>Java</code> using frameworks <code>Selenide</code> for UI-tests.
>
> <code>Selenoid</code> runs the application on a remote server in containers <code>Docker</code>.
>
> <code>JUnit 5</code> used for unit testing
>
> <code>Gradle</code> used for automated project build
>
> <code>Jenkins</code> runs tests
>
> <code>Allure Report</code> generates a test run report
>
Autotests are integrated with the test management system <code>Allure TestOps</code> and task tracker system <code>Jira</code>
>
> Notifications about the completed run are sent to <code>Telegram</code> using the library [allure-notifications](https://github.com/qa-guru/allure-notifications)

## :heavy_check_mark: Tested functionality
> - Checking the display of the correct navbar (Changing locale, language 
> - Searching from products and fetching results
> - Changing search categories



&#8287;&#8287;&#8287;&#8287;&#8287;
## :bar_chart: Analytics and Reports
