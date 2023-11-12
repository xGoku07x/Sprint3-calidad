package co.edu.udea.calidad.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.calidad.certificacion.userinterfaces.UserPage.*;

public class AmazonPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("tv lg").into(INPUT_TEXT1).thenHit(Keys.RETURN));//escribo el contenido en el id del buscador de amazon. le doy enter(
        actor.attemptsTo(Click.on(TV));//click en el 3 televisor de la lista
        actor.attemptsTo(Click.on(ADD_CAR));
    }
    public static AmazonPage go(){
        return Tasks.instrumented(AmazonPage.class);
    }
}
