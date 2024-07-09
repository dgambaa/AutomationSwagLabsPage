package reto_Automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target FirstName = Target.the("").located(By.id("first-name"));

    public static final Target LastName = Target.the("").located(By.id("last-name"));

    public static final Target PostalCode = Target.the("").located(By.id("postal-code"));

    public static final Target ContinueButton = Target.the("").located(By.id("continue"));


}
