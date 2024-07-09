package reto_Automatizacion.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import reto_Automatizacion.tasks.DoCheckout;
import reto_Automatizacion.tasks.Login;
import reto_Automatizacion.tasks.OpenUp;
import reto_Automatizacion.tasks.SelectProducts;


public class RetoStepDefinitions {

    @Given("that {actor} wants to create an order in the Swag Labs application.")
    public void dianaWantsToCreateAnOrderInTheSwagLabsApplication(Actor actor) {
        actor.wasAbleTo(
                OpenUp.thePage(),
                Login.onThePage()
        );
    }
    @When("she adds products to the cart in the Swag Labs application.")
    public void sheAddsProductsToTheCartInTheSwagLabsApplication() {
        OnStage.theActorCalled("Diana").wasAbleTo(
                SelectProducts.onTheBotton()
        );
    }

    @Then("she can complete the order to checkout.")
    public void sheCanCompleteTheOrderToCheckout() {
        OnStage.theActorCalled("Diana").wasAbleTo(
                DoCheckout.onTheBotton()
        );
    }
}
