package reto_Automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import reto_Automatizacion.userinterface.ProductsPage;


public class SelectProducts implements Task {

    public static SelectProducts onTheBotton (){
        return Tasks.instrumented(SelectProducts.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {
    actor.attemptsTo(
            Click.on(ProductsPage.AddProductOne),
            Click.on(ProductsPage.AddProductTwo),
            Click.on(ProductsPage.ShoppingCart)
    );

    }

    }
