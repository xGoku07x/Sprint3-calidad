package co.edu.udea.calidad.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/open_amazon_page.feature",
        glue = "co.edu.udea.calidad.certificacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)

public class OpenPageAmazon {

}
