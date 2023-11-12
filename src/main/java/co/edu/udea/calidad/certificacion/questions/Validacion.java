package co.edu.udea.calidad.certificacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidad.certificacion.userinterfaces.UserPage.MORE_PRODUCTS;

public class Validacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        Integer productos= Text.of(MORE_PRODUCTS).viewedBy(actor).asInteger(); //lo que se ve en el carrito, lo convierto a entero
        if(productos==1){
            return true;
        }
        else {
            return false;
        }
    }
    public static Validacion theAddToCar(){
        return new Validacion();
    }
}
