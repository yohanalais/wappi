package com.wappi.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/actualizar_perfil.feature",
        glue = "com.wappi.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Test2"
)
public class ActualizarPerfilRunner {

}
