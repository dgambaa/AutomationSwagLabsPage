package reto_Automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import reto_Automatizacion.userinterface.CartPage;
import reto_Automatizacion.userinterface.CheckoutPage;
import reto_Automatizacion.userinterface.FinishCheckoutPage;

public class DoCheckout implements Task {

    public static DoCheckout onTheBotton() {
        return Tasks.instrumented(DoCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(CartPage.CheckoutButton),

                Enter.theValue("Diana").into(CheckoutPage.FirstName),
                Enter.theValue("G").into(CheckoutPage.LastName),
                Enter.theValue("100052").into(CheckoutPage.PostalCode),
                Click.on(CheckoutPage.ContinueButton),

                Click.on(FinishCheckoutPage.FinishButton)
        );

    }

}
