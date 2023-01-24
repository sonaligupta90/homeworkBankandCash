$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/TechfiosLogin.feature");
formatter.feature({
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario"
    }
  ]
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters the \"\u003cusername\u003e\" in the \"Username\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters the \"\u003cpassword\u003e\" in the \"Password\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on \"bankCash\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountTitle\u003e\" in the \"accountTitle\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cPhone\u003e\" in the \"Phone\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in the \"internetBankingURL\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"submit\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "Phone",
        "internetBankingURL"
      ]
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "sonali007",
        "savings",
        "1000000",
        "12345678909876",
        "java",
        "1234567890",
        "https://www.chase.com/digital/online-banking"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to login with valid credentials and open a new account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Scenario"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"demo@techfios.com\" in the \"Username\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_the_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the \"abc123\" in the \"Password\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_the_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"bankCash\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"sonali007\" in the \"accountTitle\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"savings\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"1000000\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"12345678909876\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"java\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"1234567890\" in the \"Phone\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"https://www.chase.com/digital/online-banking\" in the \"internetBankingURL\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_enters_in_the_field_in_accounts_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"submit\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_clicks_on_(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.LoginStepDefination.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "status": "passed"
});
});