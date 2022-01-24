package com.indra.steps_definitions;

import com.indra.actions.AdvantageOnlineShoppingDetailsActions;
import com.indra.actions.AdvantageOnlineshoppingBuyOnlineActions;
import com.indra.models.AdvantageonlineshoppingBuyOnlineModels;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AdvantageOnlineshoppingBuyOnlineSteps {
    @Managed
    WebDriver driver;
    AdvantageOnlineshoppingBuyOnlineActions buyOnlineActions = new AdvantageOnlineshoppingBuyOnlineActions(driver);
    AdvantageOnlineShoppingDetailsActions shoppingDetailsActions = new AdvantageOnlineShoppingDetailsActions(driver);
    @Given("^estoy logueado en el portal demo$")
    public void estoyLogueadoEnElPortalDemo() {
        buyOnlineActions.open();
        buyOnlineActions.realizarLogin();
    }


    @When("^el usuario agrega un articulo a la canasta de compras$")
    public void elUsuarioAgregaUnArticuloALaCanastaDeCompras() {
        buyOnlineActions.agregarArticuloAlCarrito();
    }

    @Then("^al hacer clic en la casta el sistema deberia mostrar los detalles del producto seleccionado$")
    public void alHacerClicEnLaCastaElSistemaDeberiaMostrarLosDetallesDelProductoSeleccionado() {
        buyOnlineActions.validarDetallesDelCarritoCompras();

    }

    /******************caso 2 *******************************/

    @Given("^que el usuario esta logeado en el portal demo$")
    public void queElUsuarioEstaLogeadoEnElPortalDemo() {
        estoyLogueadoEnElPortalDemo();
    }

    @Given("^que agrego un articulo a la canasta de compras$")
    public void queAgregoUnArticuloALaCanastaDeCompras() {
        elUsuarioAgregaUnArticuloALaCanastaDeCompras();
    }

    @When("^hace click en checkOut$")
    public void haceClickEnCheckOut() {
        alHacerClicEnLaCastaElSistemaDeberiaMostrarLosDetallesDelProductoSeleccionado();
        buyOnlineActions.hacerClicCheckOut();
    }

    @Then("^el portal deberia mostrarle una pantalla con los siguientes datos:$")
    public void elPortalDeberiaMostrarleUnaPantallaConLosSiguientesDatos(List<AdvantageonlineshoppingBuyOnlineModels> onlineModelsList) {
        shoppingDetailsActions.validarShippingDetails(onlineModelsList.get(0));
    }



    @Given("^que el usuario esta logeado en el portal$")
    public void queElUsuarioEstaLogeadoEnElPortal() {
        estoyLogueadoEnElPortalDemo();
    }

    @Given("^que agrego un articulo al carrito de compras$")
    public void queAgregoUnArticuloAlCarritoDeCompras() {
        elUsuarioAgregaUnArticuloALaCanastaDeCompras();
    }

    @Given("^esta en la pantalla shipping details$")
    public void estaEnLaPantallaShippingDetails() {
        haceClickEnCheckOut();
    }

    @When("^hace click Edit shipping details$")
    public void haceClickEditShippingDetails() {
        shoppingDetailsActions.hacerClicEditarDetalles();
    }

    @Then("^el usuario deberia poder editar la informacion$")
    public void elUsuarioDeberiaPoderEditarLaInformacion() {
        shoppingDetailsActions.validaQueSeaEditableLaInformacion();
    }

    @Given("^que se logueo en el portal$")
    public void queSeLogueoEnElPortal() {
        estoyLogueadoEnElPortalDemo();
    }


    @Given("^que agrego un articulo a la canasta$")
    public void queAgregoUnArticuloALaCanasta() {
        elUsuarioAgregaUnArticuloALaCanastaDeCompras();
    }

    @When("^esta en la pantalla Payment Method$")
    public void estaEnLaPantallaPaymentMethod() {
        haceClickEnCheckOut();
        shoppingDetailsActions.hacerClicNext();

    }

    @Then("^deberia poder visulizar dos opciones de pago$")
    public void deberiaPoderVisulizarDosOpcionesDePago(List<AdvantageonlineshoppingBuyOnlineModels> buyOnlineModels) {
        shoppingDetailsActions.validarOpcionesDePago(buyOnlineModels.get(0));
    }



    @Given("^que se logueo el usuario en el portal$")
    public void queSeLogueoElUsuarioEnElPortal() {
        estoyLogueadoEnElPortalDemo();
    }

    @Given("^que el usuario agregro un articulo de compra$")
    public void queElUsuarioAgregroUnArticuloDeCompra() {
        elUsuarioAgregaUnArticuloALaCanastaDeCompras();
    }

    @When("^selecciona la opcion de pago Master Credit$")
    public void seleccionaLaOpcionDePagoMasterCredit() {
        estaEnLaPantallaPaymentMethod();
        shoppingDetailsActions.seleccionarMetodoPagoMasterCredit();
    }

    @Then("^deberia poder visualizar la opcion de editar tarjeta de credito$")
    public void deberiaPoderVisualizarLaOpcionDeEditarTarjetaDeCredito() {

        shoppingDetailsActions.validarOpcionEditarTarjetaCredito();
    }



    @When("^hace click en el link de editar tarjeta$")
    public void haceClickEnElLinkDeEditarTarjeta() {
        shoppingDetailsActions.hacerClicEditarTarjetaCredito();
    }

    @Then("^deberia poder visualizar los datos de la tarjeta anterior$")
    public void deberiaPoderVisualizarLosDatosDeLaTarjetaAnterior() {

        shoppingDetailsActions.validarCargadeDatosTarjetaCreditoAnterior(5);

    }



    @Then("^deberia poder visualizar el boton de Pay Now$")
    public void deberiaPoderVisualizarElBotonDePayNow() {

        shoppingDetailsActions.validaBotonPaynowEstaPresente();
    }



    @When("^hace click en el boton Pay Now$")
    public void haceClickEnElBotonPayNow() {
        shoppingDetailsActions.hacerClicBotonPayNow();
    }

    @Then("^deberia poder visualizar la orden de pago con los siguientes campos$")
    public void deberiaPoderVisualizarLaOrdenDePagoConLosSiguientesCampos(List<AdvantageonlineshoppingBuyOnlineModels>
                                                                                      buyOnlineModels) {
        shoppingDetailsActions.validarCamposOrdenDePago(buyOnlineModels.get(0));

    }


}
