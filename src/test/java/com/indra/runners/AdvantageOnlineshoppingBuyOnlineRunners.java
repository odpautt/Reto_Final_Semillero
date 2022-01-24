package com.indra.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/advantageonlineshopping/advantageonlineshopping_buyonline.feature"
        ,glue = "com.indra.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
        //,tags = "@caso"
)

public class AdvantageOnlineshoppingBuyOnlineRunners {
}
