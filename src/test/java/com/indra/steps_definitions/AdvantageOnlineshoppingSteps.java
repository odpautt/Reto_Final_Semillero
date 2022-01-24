package com.indra.steps_definitions;

import com.indra.actions.AdvantageOnlineshoppingActions;

import com.indra.models.AdvantageOnlineShoppingModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AdvantageOnlineshoppingSteps {
    @Managed
    WebDriver driver;

    AdvantageOnlineshoppingActions advantageonlineshoppingActions = new AdvantageOnlineshoppingActions(driver);

    @Given("^que el usuario ingresa a la pagina de inicio$")
    public void queElUsuarioIngresaALaPaginaDeInicio() {
        advantageonlineshoppingActions.open();

    }

    @When("^carga el contenido$")
    public void cargaElContenido() {
        advantageonlineshoppingActions.esperarCargaCompletaDePagina();

    }

    @Then("^deberia poder ver las diferentes categoria$")
    public void deberiaPoderVerLasDiferentesCategoria() {
        advantageonlineshoppingActions.mostrarTodasLasCategorias();


    }

    @Given("^que el usuario esta en la pagina de inicio$")
    public void queElUsuarioEstaEnLaPaginaDeInicio() {
        advantageonlineshoppingActions.open();
    }

    @When("^carga se el contenido de la pagina$")
    public void cargaSeElContenidoDeLaPagina() {
        advantageonlineshoppingActions.esperarCargaCompletaDePagina();
    }

    @Then("^deberia poder ver un espacio publicitario$")
    public void deberiaPoderVerUnEspacioPublicitario() {
        advantageonlineshoppingActions.encontrarEspaciosDePublicidad();


    }

    @Given("^que el usuario esta en la pagina de inicio del portal$")
    public void queElUsuarioEstaEnLaPaginaDeInicioDelPortal() {
        advantageonlineshoppingActions.open();
    }

    @When("^carga el contenido de la pagina$")
    public void cargaElContenidoDeLaPagina() {
        advantageonlineshoppingActions.esperarCargaCompletaDePagina();
    }

    @Then("^deberia poder ver un menu de opciones$")
    public void deberiaPoderVerUnMenuDeOpciones(List<AdvantageOnlineShoppingModels> advantageonlineshoppingModels) {
            advantageonlineshoppingActions.validarNombresDelMenu(advantageonlineshoppingModels.get(0));
    }
}
