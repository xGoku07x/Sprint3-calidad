package co.edu.udea.calidad.certificacion.task;

import co.edu.udea.calidad.certificacion.interactions.AmazonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;

public class OpenTheBrowser implements Task {
    private PageObject page;
    public OpenTheBrowser(PageObject page){
        this.page=page;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));// en el navegador abro la pagina {pagina definida en serenity}
        actor.attemptsTo(AmazonPage.go());//mando la interaccion en el buscador de amazon con la palabra tv lg


    }

    public static OpenTheBrowser Browser(PageObject page){
        return Tasks.instrumented(OpenTheBrowser.class,page);
    }
}
