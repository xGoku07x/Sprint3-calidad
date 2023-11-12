package co.edu.udea.calidad.certificacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;



public class UserPage extends PageObject {
    public static final Target TV =Target.the("TV").located(By.cssSelector("img.s-image[data-image-index='1']"));//selecciono el 1 elemento de la lista
    public static final Target INPUT_TEXT1 =Target.the("INPUT TEXT1").locatedBy("//*[@id='twotabsearchtextbox']");

    public static final Target ADD_CAR =Target.the("ADD TO CAR").locatedBy("//*[@id='add-to-cart-button']");//agrego al carrito el primer tv disponible

    public static final Target MORE_PRODUCTS= Target.the("ONE+").locatedBy("//*[@id='nav-cart-count']");
}
