package reto_Automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target USERNAME = Target.the("").located(By.id("user-name"));

    public static final Target PASSWORD = Target.the("").located(By.id("password"));

    public static final Target SIGN_IN = Target.the("").located(By.id("login-button"));


}

