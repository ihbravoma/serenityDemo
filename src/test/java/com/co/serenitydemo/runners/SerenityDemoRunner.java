package com.co.serenitydemo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/crear_cliente.feature", "src/test/resources/features/editar_cliente.feature"},
        glue = "com.co.serenitydemo.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class SerenityDemoRunner {
}
