# DIRECTORY LAYOUT #

```
automatedTestingFramework/              --> root project directory
    clirunners/                             --> bat scripts to run tests in cli
    lib/                                    --> directory with libraries
        dbdrivers.oracle/                       --> directory with dbdrivers
            ojdbc.jar                               --> oracle library
        webdrivers/                             --> directory with webdrivers
            chrome/                                 --> chrome driver
            iternetexplorer                         --> internet explorer driver
            phantomjs                               --> phantomjs driver
    logs/                                   --> directory for run logs
    README/                                 --> directory with file describing setup,structure of framework
    src/                                    --> directory with source code
        java/                                   --> main part of code
            com.example/                            --> package directory
                core/                                   --> reusable part of code
                    base/                                   --> directory with base functionalities
                        environments/                           --> directory with environment handlers
                            EnvironmentServices.java                --> handler class for environment data
                            ParametersManager.java                  --> environment manager class
                            RuntimeParameters.java                  --> handler class for environment variables
                        user/                                   --> directory for support users due to specific data
                            AccountData.java                        --> class with user's account model
                            AvailableUsers.java                     --> class with defined filters for searching user
                            MapUserFile.java                        --> class supporting AvailableUsers.java
                            UserAccountPredicate.java               --> class with embedded filter based on Predicate function
                            UserData.java                           --> class with user data model
                            UserProvider.java                       --> class which is used in test for providing users
                    download/                               --> directory with class responsible for downloading
                        DownloadManager.java                    --> class with downloading functionalities
                    enums/                                  --> directory with enums
                        IResolutionList.java                    --> interface for resolutions
                        ResolutionEnum.java                     --> enum with resolution supported
                        SubUrl.java                             --> enum with website addresses
                    exceptions/                             --> directory with own exceptions
                        BFInputDataException.java               --> exception input data given by end user
                        BFWaitingTimeoutException.java          --> exception for max. timeout
                    logger/                                 --> directory with logger functionalities
                        BFLogger.java                           --> class with overriden logger methods
                        BFLoggerInstance.java                   --> wrapper class for log4j
                        EnvironmentLevel.java                   --> class supporting logging level
                    properties/                             --> directory with java properties
                        PropertiesManager.java                  --> class for java properties handling
                    utils/                                  --> directory with utilities
                        ColorsUtils.java                        --> class for working with colors
                        NumberUtils.java                        --> class for working with number
                        StringComparator.java                   --> class with string functionalities
                    SecuredProperties.java                      --> class for hashing secret data
                database/                               --> directory with database schema
                demo/                                   --> directory with application api, page objects
                selenium/                               --> reusable part of code to supply selenium's features
                    exceptions/                             --> directory with own exceptions related with selenium
                        BFComponentStateException.java          --> exception for unknown component's state
                        BFElementNotFoundException.java         --> exception when element wasn't found
                        BFInitializationException.java          --> exception when initialization failed
                        BFSeleniumGridNotConnectedException.java--> exception if selenium grid connection failed
                        BFWaitingForBrowserWindowException.java --> exception when connection with browser failed
                    newDrivers/                             --> directory with webdrivers wrappers
                        elementType/                            --> directory with webelements wrapper
                            BasicElement.java                       --> class with base methods for webelements
                            Button.java                             --> class wrapper for button webelement
                            CheckBox.java                           --> class wrapper for checkbox webelement
                            DropdownListElement.java                --> class wrapper for dropdown list webelement
                            ElementType.java                        --> enum with webelement's types
                            IBasicElement.java                      --> interface for webelements
                            IFrame.java                             --> class with iframe methods 
                            InputTextElement.java                   --> class wrapper for inputtext webelement
                            LabelElement.java                       --> class wrapper for label webelement
                            ListElements.java                       --> class wraper for list webelement
                            MenuElement.java                        --> class wrapper for menu webelement
                            NavigationBarElement.java               --> class wrapper for navigationbar webelement
                            RadioButtonElement.java                 --> class wrapper for radiobutton webelement
                            TabElement.java                         --> class wrapper for tabs webelement
                            TooltipElement.java                     --> class wrapper for tooltip webelement
                        DriverExtension.java                    --> class with methods extending webdrivers
                        DriverManager.java                      --> class for drivers handler(multithreading etc.)
                        INewWebDriver.java                      --> interface for webdriver's wrappers
                        NewChromeDriver.java                    --> class with wrapper for chrome driver
                        NewFirefoxDriver.java                   --> class with wrapper for firefox driver
                        NewInternetExplorerDriver.java          --> class with wrapper for internet explorer driver
                        NewPhantomJSDriver.java                 --> class with wrapper for phantomjs driver
                        NewRemoteWebDriver.java                 --> class with wrapper for remote driver
                        NewRemoteWebElement.java                --> class with wrapper for remote webelement
                    utils/                                  --> directory with  various utilities
                        DateUtils.java                          --> class with methods handling date
                    webdriver/                              --> directory with additional webdriver utilities
                        WdUtility.java                          --> class with webdriver utilities
                    BasePage.java                           --> root class for all page objects
                    IBasePage.java                          --> interface for page objects
                webservice/                             --> directory with webservice functionalities
                    pageobject/                             --> directory with models objects
                        IUrlServiceObjectModel.java             --> interface for webservices models
                        UrlServiceObjectModel.java              --> root class for model objects
                    service/                                --> directory with REST handlers
                        session.sso/                            --> directory with sso handling
                            CookieConverter.java                    --> class with cookies handler
                            SSOSession.java                         --> class which holds session's parameters
                        RestServiceObjectModel.java             --> class with restassured handler
                        WebServiceDriverManager.java            --> class wrapper with webservice driver
                    soapUI/                                 --> directory with soapUI handling
                        SoapUIPostRequest.java                  --> class with SoapUI request wrapper
                        SoapUIPostResponse.java                 --> class with SoapUI response wrapper
                        SoapUIUtils.java                        --> class with SoapUI utilities
        test/                                   --> test part of code
            java/                                   --> test part of code
                com.example/                            --> package directory
                    demo/                                   --> directory with demo tests
                        cucumber/                               --> directory with tests with gherkin syntax
                        tests/                                  --> directory with junit tests
                        testSuites/                             --> directory with suites definitions
                    testcore/                               --> directory with reusable test part
                        assertions/                             --> directory with own assertions
                            AssertExtension.java                    --> file with extensions of junit assertions
                        core/                                   --> directory with base tests content
                            BaseTest.java                           --> file with base test class
                            BaseTestWatcher                         --> file with listener class supporting reporting
                            IBaseTest.java                          --> file with interface for base test class
                        testRunners/                            --> internal classes supporting run of tests
                        unit/                                   --> unit tests for framework features
                        TestUtils.java                          --> class with helpers for local paths
                    webservice.services/                    --> tests at webservices level
                        examples/                               --> example test for webservices
            resources/                              --> directory with static files
                dynamicData                             --> directory with users info
                    user_repository.json                    --> static file with users' models
                environment                             --> directory with environment parameters
                    environments.csv                        --> static file with environments addresses
    target/                                 --> allure output directory
    .gitignore                              --> path to files to be ignored by git
    application.properties                  --> db configuration
    pom.xml                                 --> run configuration
    settings.properties                     --> files with paths to drivers
```

