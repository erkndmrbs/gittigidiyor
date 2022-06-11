$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/API.feature");
formatter.feature({
  "name": "Api trello",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Get islemi",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hello"
    }
  ]
});
formatter.step({
  "name": "Kullanici \"endpoint\" ile get islemi yapar",
  "keyword": "Given "
});
formatter.step({
  "name": "Kullanici \"\u003cavatarUrl\u003e\" ve \"\u003cfullName\u003e\" bilgileri ile expected datayi olustur",
  "keyword": "And "
});
formatter.step({
  "name": "Kullanici api verilerini dogrular",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "avatarUrl",
        "fullName"
      ]
    },
    {
      "cells": [
        "https://trello-members.s3.amazonaws.com/5191197f9433cf5507006338/9a94b9e9e546d5494a4d8d5b4e9e6c86",
        "briancervino"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Get islemi",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hello"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici \"endpoint\" ile get islemi yapar",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ApiSD.kullanici_ile_get_islemi_yapar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici \"https://trello-members.s3.amazonaws.com/5191197f9433cf5507006338/9a94b9e9e546d5494a4d8d5b4e9e6c86\" ve \"briancervino\" bilgileri ile expected datayi olustur",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ApiSD.kullanici_ve_bilgileri_ile_expected_datayi_olustur(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kullanici api verilerini dogrular",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ApiSD.kullanici_api_verilerini_dogrular()"
});
formatter.result({
  "error_message": "io.restassured.path.json.exception.JsonPathException: Failed to parse the JSON document\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:1002)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:967)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:1047)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:202)\r\n\tat io.restassured.path.json.JsonPath.getString(JsonPath.java:352)\r\n\tat stepdefinitions.ApiSD.kullanici_api_verilerini_dogrular(ApiSD.java:55)\r\n\tat ✽.Kullanici api verilerini dogrular(file:///C:/Users/Win10/Downloads/com.Testinium/src/test/resources/features/API.feature:7)\r\nCaused by: groovy.json.JsonException: Lexing failed on line: 1, column: 1, while reading \u0027C\u0027, no possible valid JSON value or punctuation could be recognized.\r\n\tat groovy.json.JsonLexer.nextToken(JsonLexer.java:86)\r\n\tat groovy.json.JsonLexer$nextToken.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:130)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parse(ConfigurableJsonSlurper.groovy:97)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper$parse.callCurrent(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:171)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:185)\r\n\tat io.restassured.internal.path.json.ConfigurableJsonSlurper.parseText(ConfigurableJsonSlurper.groovy:83)\r\n\tat io.restassured.path.json.JsonPath$4$1.method(JsonPath.java:965)\r\n\tat io.restassured.path.json.JsonPath$ExceptionCatcher.invoke(JsonPath.java:1000)\r\n\tat io.restassured.path.json.JsonPath$4.doParseWith(JsonPath.java:967)\r\n\tat io.restassured.path.json.JsonPath$JsonParser.parseWith(JsonPath.java:1047)\r\n\tat io.restassured.path.json.JsonPath.get(JsonPath.java:202)\r\n\tat io.restassured.path.json.JsonPath.getString(JsonPath.java:352)\r\n\tat stepdefinitions.ApiSD.kullanici_api_verilerini_dogrular(ApiSD.java:55)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});