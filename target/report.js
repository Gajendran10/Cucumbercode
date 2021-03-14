$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/TwoDMap.Feature");
formatter.feature({
  "name": "Add cust twdmap",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Add cust info",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Launch twod url",
  "keyword": "Given "
});
formatter.match({
  "location": "TwoDmap.launch_twod_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click link twod",
  "keyword": "And "
});
formatter.match({
  "location": "TwoDmap.click_link_twod()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "fill detail twod",
  "rows": [
    {
      "cells": [
        "Fname",
        "Lname",
        "MailId",
        "Address",
        "Phone.No"
      ]
    },
    {
      "cells": [
        "Gajen",
        "Mani",
        "gg@gmail.com",
        "Krr",
        "73888818"
      ]
    },
    {
      "cells": [
        "hewee",
        "jwej",
        "hh@gmail.com",
        "hee",
        "45366266"
      ]
    },
    {
      "cells": [
        "ryeeh",
        "ettt",
        "rr@gmail.com",
        "ger",
        "32292991"
      ]
    },
    {
      "cells": [
        "iwiwi",
        "eree",
        "er@gmail.com",
        "wer",
        "92983882"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TwoDmap.fill_detail_twod(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "CustomerDetail.i_validate_the_outcomes()"
});
formatter.result({
  "status": "passed"
});
});