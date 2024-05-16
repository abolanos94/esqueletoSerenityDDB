package co.com.screenplay.project.stepdefinitios;

import co.com.screenplay.project.hook.OpenWeb;
import co.com.screenplay.project.tasks.OpenTheBrowserOnLogin;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class OpenWebStep {
    @Managed(driver = "edge")
    public WebDriver browser;
    private final Actor User = Actor.named("User");

    @Before
    public void setUp() {
        //setTheStage(new OnlineCast());
        User.can(BrowseTheWeb.with(browser));

    }

    @Given("{string} abre el sitio web de pruebas")
    public void abreElSitioWebDePruebas(String actor) {
        User.attemptsTo(OpenTheBrowserOnLogin.on());
    }

    @When("cuando ingres al navegador")
    public void cuandoIngresAlNavegador() {
        
    }

    @Then("visualizara el titulo de la pagina {string}")
    public void visualizaraElTituloDeLaPagina(String mensaje) {
    }
}
