<h1 align="center">Web UI automation project for amazon marketplace <a href="https://www.amazon.com" target="_blank"><img src="https://github.com/Fatalwgx/README/blob/master/icons/amazon_icon.png" width="300" height="100" alt="Logo"/></a></h1>

&#8287;&#8287;&#8287;&#8287;&#8287;
## :open_book: Summary:
- [Technologies and tools](#gear-Technologies-and-Tools-used-in-the-project)
- [Description](#heavy_check_mark-Description)
- [Analytics and Reports](#bar_chart-Analytics-and-Reports)
  - [Running tests from the terminal](#computer-running-tests-from-the-terminal)
  - [Running tests in Jenkins](#-running-tests-in-jenkins)
  - [Test results report in Allure Report](#-test-results-report-in-allure-report)
  - [Integration with Allure TestOps](#-integration-with-allure-testops)
  - [Integration with Jira](#-integration-with-jira)
  - [Telegram notifications using a bot](#-telegram-notifications-using-a-bot)
  - [Test running example in Selenoid](#-test-running-example-in-selenoid)


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
> - Checking the display of the correct navbar (Changing locale, language)
> - Searching from products and fetching results
> - Changing search categories



&#8287;&#8287;&#8287;&#8287;&#8287;
## :bar_chart: Analytics and Reports
## :computer: Running tests from the terminal

### Local running tests

```bash
gradle clean test
```

### Remote running tests

```bash
gradle clean test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-Dremote=${SERVER_REMOTE}
```

## <img width="4%" title="Jenkins" src="media/logo/Jenkins_logo.svg"> Running tests in [Jenkins]( )

First you need to click on the <code><strong>*Collect with parameters*</strong></code> button and set options. By clicking on the <code><strong>*Collect*</strong></code> button a build will be started.

<p align="center">
  <img src="media/jenkins.png" alt="Jenkins" width="800">
</p>

After build is completed, in the <code><strong>*Builds history*</strong></code> opposite the build number will appear
the *Allure Report* icon, clicking on which will open the page with the generated html-report.

<p align="center">
  <img src=" " alt="allure-report" width="800">
</p>

## <img width="4%" title="Allure Report" src=" "> Test results report in [Allure Report]( )

<p align="center">
  <img src=" " alt="allure-report1" width="900">
</p>

## <img width="4%" title="Allure TestOPS" src=" "> Integration with [Allure TestOps]( )

## Main dashboard

<p align="center">
  <img src=" " alt="dashboard" width="900">
</p>

## Test results

<p align="center">
  <img src=" " alt="testresults" width="900">
</p>

## <img width="4%" title="Jira" src="media/logo/Jira.svg"> Integration with [Jira]( )

<p align="center">
  <img src=" " alt="jira" width="900">
</p>

## <img width="4%" title="Telegram" src=" "> Telegram notifications using a bot
After the build is completed, a special bot created in <code>Telegram</code>, automatically processes and sends a test run report message.

<p align="center">
<img title="Telegram Notifications" src=" ">
</p>

## <img width="4%" title="Selenoid" src=" "> Test running example in Selenoid

A video is attached to each test in the report.

<p align="center">
  <img title="Selenoid Video" src=" ">
</p>
