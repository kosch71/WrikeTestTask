# Wrike Test
Test case scenario:

* Open url: wrike.com;

* Click "Get started for free" button near "Login" button;

* Fill in the email field with random generated value of email with mask “<random_text>+wpt@wriketask.qaa” (e.g. “abcdef+wpt@wriketask.qaa”);

* Click on "Create my Wrike account" button + check with assertion that you are moved to the next page;

* Fill in the Q&A section at the left part of page (like random generated answers) + check with assertion that your answers are submitted;

* Check that section "Follow us" at the site footer contains the "Twitter" button that leads to the correct url and has the correct icon;

* Create results report using allure plugin (by maven).

# Stack of technologies for implementation:

* Platform: java 11

* Build and run: maven

* Test framework: junit4

* UI test: selenium 3 (without wrappers)

* Pattern: pageObject (test -> steps -> pages)

* Reporting: allure plugin

* Selector: xpath (should be short and stable)

# Allure reports

* [Footer test](https://github.com/kosch71/WrikeTestTask/blob/master/src/main/resources/Allure/AllureReport-1.png)

* [Getting started test](https://github.com/kosch71/WrikeTestTask/blob/master/src/main/resources/Allure/AllureReport.png)
