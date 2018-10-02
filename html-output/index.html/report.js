$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/SeleniumQAProject/Cucumber_Amazon/src/main/java/com/amazon/features/amazon.features");
formatter.feature({
  "line": 1,
  "name": "Amazon Test flow",
  "description": "",
  "id": "amazon-test-flow",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Amazon Test order validation",
  "description": "",
  "id": "amazon-test-flow;amazon-test-order-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User loads amazon site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User is on amazon landing page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User verifies amazon link is correct",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user search for a product",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user verifies whether product are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the product",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user add the product to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user click on cart and verifies whether item is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Proceed to Check out",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "enter username and password",
  "rows": [
    {
      "cells": [
        "9052219955",
        "AmazonAbhi79"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify recipient name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_loads_amazon_site()"
});
formatter.result({
  "duration": 5332778758,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d69.0.3497.100)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.15063 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027ABHISHEK\u0027, ip: \u0027192.168.13.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.41.578737 (49da6702b16031..., userDataDir: C:\\Users\\ABHISHEK\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:61119}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.100, webStorageEnabled: true}\nSession ID: 3e52937b49dd1ca92ae9371bbee2d73a\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat com.amazon.stepdefinition.StepDefinition.user_loads_amazon_site(StepDefinition.java:29)\r\n\tat ✽.Given User loads amazon site(D:/SeleniumQAProject/Cucumber_Amazon/src/main/java/com/amazon/features/amazon.features:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_amazon_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_verifies_amazon_link_is_correct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_search_for_a_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_verifies_whether_product_are_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_the_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_add_the_product_to_the_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_click_on_cart_and_verifies_whether_item_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.proceed_to_Check_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.verify_recipient_name()"
});
formatter.result({
  "status": "skipped"
});
});