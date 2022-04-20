package com.indra.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "com.indra.steps_definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@test1"
)
public class Login {
}
