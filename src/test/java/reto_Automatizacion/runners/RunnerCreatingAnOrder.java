package reto_Automatizacion.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/reto_aplicativo_SwagLabs.feature",
        glue = {"reto_Automatizacion.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE )

public class RunnerCreatingAnOrder {

}