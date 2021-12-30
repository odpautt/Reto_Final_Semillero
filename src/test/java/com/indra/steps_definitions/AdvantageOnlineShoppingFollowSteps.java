package com.indra.steps_definitions;
import com.indra.actions.AdvantageOnlineShoppingFollowActions;
import com.indra.models.AdvantageOnlineShoppingFollowModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AdvantageOnlineShoppingFollowSteps {
    @Managed
    WebDriver driver;
    AdvantageOnlineShoppingFollowActions shoppingFollowActions = new AdvantageOnlineShoppingFollowActions(driver);
    @Given("^que el usuario ingresa a la pagina de inicio del portal$")
    public void queElUsuarioIngresaALaPaginaDeInicioDelPortal() {
        shoppingFollowActions.open();

    }


    @When("^se dirige a la parte inferior de la pagina$")
    public void seDirigeALaParteInferiorDeLaPagina() {
        shoppingFollowActions.esperarCargaDeRedesSociales();

    }

    @Then("^deberia poder ver al menos tres redes sociales$")
    public void deberiaPoderVerAlMenosTresRedesSociales(List<AdvantageOnlineShoppingFollowModels> followModelsList) {

        shoppingFollowActions.validarCantidadRedesSociales(followModelsList.get(0));

    }
}
