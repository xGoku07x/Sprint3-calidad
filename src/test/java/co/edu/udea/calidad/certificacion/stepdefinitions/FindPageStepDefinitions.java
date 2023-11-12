package co.edu.udea.calidad.certificacion.stepdefinitions;

import co.edu.udea.calidad.certificacion.questions.Validacion;
import co.edu.udea.calidad.certificacion.task.OpenTheBrowser;
import co.edu.udea.calidad.certificacion.userinterfaces.UserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Cucumber.class)
public class FindPageStepDefinitions {
    @Managed(driver = "chrome")
    public WebDriver driver;
    private Actor usuario= Actor.named("Arley");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("que estoy en la pagina principal de Amazon")
    public void estoyPaginaPrincipalAmazon(){
        usuario.can(BrowseTheWeb.with(driver)); //abro el browser con el driver en este caso el driver=google


    }

    @When("quiero agregar un tv lg a mi carrito")
    public void aggTvLg(){
        usuario.attemptsTo(OpenTheBrowser.Browser(new UserPage()));//abro el browser en la pagina de amazon y cargo con todos los id's que requiero para trabajar(id buscador, id add, id carrito)

    }

    @Then("el tv debe agregarse sin errores")
    public void elTvSeAgg(){
        usuario.should(seeThat(Validacion.theAddToCar(),equalTo(true)));

    }

}
