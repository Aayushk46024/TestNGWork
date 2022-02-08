$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/AayushKhandelwal/BDDFramework/src/main/java/FeatureFiles/Login.feature");
formatter.feature({
  "name": "Checking Login functionality of the application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking Login functionality with the valid login credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username in the username textfield",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_username_in_the_username_textfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password in the password textfield",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enters_password_in_the_password_textfield()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_is_on_Homepage()"
});
formatter.result({
  "status": "passed"
});
});