package com.wappi.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/ingreso_a_la_aplicacion.feature",
		glue = "com.wappi.stepdefinitions",
		snippets = SnippetType.CAMELCASE

)
public class IngresoALaAplicacionRunner {

}
