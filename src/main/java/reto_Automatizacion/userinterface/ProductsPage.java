package reto_Automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {

    public static final Target AddProductOne = Target.the("").located(By.id("add-to-cart-sauce-labs-onesie"));

    public static final Target AddProductTwo = Target.the("").located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));

    public static final Target ShoppingCart = Target.the("").locatedBy("//a[@class=\"shopping_cart_link\"]");


}





