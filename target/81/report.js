$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("incubyte.feature");
formatter.feature({
  "line": 1,
  "name": "Email Action",
  "description": "",
  "id": "email-action",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4146407200,
  "status": "passed"
});
formatter.before({
  "duration": 80444800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "User is on Home Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User enters Username",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User Clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_enters_Username()"
});
formatter.result({
  "duration": 10775371400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enters_Password()"
});
formatter.result({
  "duration": 320620600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_Clicks_on_login_button()"
});
formatter.result({
  "duration": 84120300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Successful Sending Email with Valid Credentials",
  "description": "",
  "id": "email-action;successful-sending-email-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User clicks on compose tab",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User enters email address",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters subject",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters message body",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks on send button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User validates message sent",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.user_clicks_on_compose_tab()"
});
formatter.result({
  "duration": 11630589800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enters_email_address()"
});
formatter.result({
  "duration": 344970100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enters_subject()"
});
formatter.result({
  "duration": 384878800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_enters_message_body()"
});
formatter.result({
  "duration": 354537900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_send_button()"
});
formatter.result({
  "duration": 122960500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.user_validates_message_sent()"
});
formatter.result({
  "duration": 10075475800,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 128899700,
  "status": "passed"
});
formatter.after({
  "duration": 129601000,
  "status": "passed"
});
formatter.after({
  "duration": 294403200,
  "status": "passed"
});
});