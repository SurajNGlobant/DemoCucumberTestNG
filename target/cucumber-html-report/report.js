$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/homepage_searchModule.feature");
formatter.feature({
  "id": "validate-amazon-search-features",
  "tags": [
    {
      "name": "@homePage",
      "line": 2
    },
    {
      "name": "@searchModule",
      "line": 2
    }
  ],
  "description": "",
  "name": "validate Amazon Search features",
  "keyword": "Feature",
  "line": 4
});
formatter.before({
  "duration": 119898,
  "status": "passed"
});
formatter.scenario({
  "id": "validate-amazon-search-features;verify-that-user-is-able-to-search-product",
  "tags": [
    {
      "name": "@validSearch",
      "line": 6
    }
  ],
  "description": "",
  "name": "Verify that user is able to search product",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I am at the homepage of Amazon",
  "keyword": "Given ",
  "line": 8
});
formatter.step({
  "name": "I search with \u0027pc\u0027",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "The list of product is displayed for \u0027pc\u0027",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "location": "HomePageSteps.launchHomePage()"
});
formatter.result({
  "duration": 21214326502,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pc",
      "offset": 15
    }
  ],
  "location": "HomePageSteps.searchProduct(String)"
});
formatter.result({
  "duration": 15760111052,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pc",
      "offset": 38
    }
  ],
  "location": "HomePageSteps.verifyListOfProductDisplayed(String)"
});
formatter.result({
  "duration": 54572996,
  "status": "passed"
});
formatter.after({
  "duration": 5643718020,
  "status": "passed"
});
formatter.before({
  "duration": 224400,
  "status": "passed"
});
formatter.scenario({
  "id": "validate-amazon-search-features;verify-that-user-is-able-to-search-product",
  "tags": [
    {
      "name": "@invalidSearch",
      "line": 12
    }
  ],
  "description": "",
  "name": "Verify that user is able to search product",
  "keyword": "Scenario",
  "line": 13,
  "type": "scenario"
});
formatter.step({
  "name": "I am at the homepage of Amazon",
  "keyword": "Given ",
  "line": 14
});
formatter.step({
  "name": "I search with \u0027adlfjaldjf\u0027",
  "keyword": "When ",
  "line": 15
});
formatter.step({
  "name": "The search error message is displayed as \u0027Your search \"adlfjaldjf\" did not match any products.\u0027",
  "keyword": "Then ",
  "line": 16
});
formatter.match({
  "location": "HomePageSteps.launchHomePage()"
});
formatter.result({
  "duration": 5897820197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "adlfjaldjf",
      "offset": 15
    }
  ],
  "location": "HomePageSteps.searchProduct(String)"
});
formatter.result({
  "duration": 2305189280,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your search \"adlfjaldjf\" did not match any products.",
      "offset": 42
    }
  ],
  "location": "HomePageSteps.the_error_message_is_displayed_as_Your_search_did_not_match_any_products(String)"
});
formatter.result({
  "duration": 54587459,
  "status": "passed"
});
formatter.after({
  "duration": 3427552000,
  "status": "passed"
});
});