$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('annotation\outline.feature');
formatter.feature({
  "line": 1,
  "name": "annotation",
  "description": "",
  "id": "annotation",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "User navigates to Facebook",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Annotation.goToFacebook()"
});
formatter.result({
  "duration": 15629601650,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 7,
      "value": "#Scenario with AND"
    }
  ],
  "line": 8,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I enter username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 21
    }
  ],
  "location": "Annotation.enterUsername(String)"
});
formatter.result({
  "duration": 20459273892,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 21
    }
  ],
  "location": "Annotation.enterPassword(String)"
});
formatter.result({
  "duration": 15499242318,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.checkFail()"
});
formatter.result({
  "duration": 12809655,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "User navigates to Facebook",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Annotation.goToFacebook()"
});
formatter.result({
  "duration": 18832402219,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I enter username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I enter password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Relogin option should be available",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 21
    }
  ],
  "location": "Annotation.enterUsername(String)"
});
formatter.result({
  "duration": 20410990592,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 21
    }
  ],
  "location": "Annotation.enterPassword(String)"
});
formatter.result({
  "duration": 15471842141,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.checkFail()"
});
formatter.result({
  "duration": 16250908,
  "status": "passed"
});
formatter.match({
  "location": "Annotation.checkRelogin()"
});
formatter.result({
  "duration": 2416166751,
  "status": "passed"
});
});