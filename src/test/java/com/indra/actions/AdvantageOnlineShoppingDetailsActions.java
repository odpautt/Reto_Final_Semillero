package com.indra.actions;

import com.indra.models.AdvantageonlineshoppingBuyOnlineModels;
import com.indra.pages.AdvantageOnlineShoppingDetailsPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class AdvantageOnlineShoppingDetailsActions extends AdvantageOnlineShoppingDetailsPage {
    public AdvantageOnlineShoppingDetailsActions(WebDriver driver) {
        super(driver);
    }

    public void validarShippingDetails(AdvantageonlineshoppingBuyOnlineModels buyOnlineModels){
        List<String> listaDatos = new ArrayList<>();
        listaDatos.add(buyOnlineModels.getNombreUsuario());
        listaDatos.add(buyOnlineModels.getDireccionUsuario());
        listaDatos.add(buyOnlineModels.getTelefonoUsuario());
        int cantidadDatos=0;

        if(getCampoDatoNombre().isPresent()){
            cantidadDatos++;
        }
        if(getCampoDatoDireccion().isPresent()){
            cantidadDatos++;
        }
        if(getCampoDatoTefono().isPresent()){
            cantidadDatos++;
        }

        MatcherAssert.assertThat("la cantidad de datos presentes es  Shipping Details" +
                " es igual a la cantidad de datos a valida", listaDatos.size(), Matchers.is(cantidadDatos));

    }

    public void hacerClicEditarDetalles(){
        getBtnEditarDetalles().click();
    }

    public void validaQueSeaEditableLaInformacion(){

        int informacionEditable=0;

        if(getNombreEditable().isEnabled()){
            informacionEditable ++;
        }
        if(getDireccionEditable().isEnabled()){
            informacionEditable ++;
        }
        if(getTelefonoEditable().isEnabled()){
            informacionEditable ++;
        }

        MatcherAssert.assertThat("El nombre, Direccion y Telefono son editables"
                ,informacionEditable,Matchers.is(3));

    }

    public void hacerClicNext(){
        getBtnNext().click();
    }

    public void validarOpcionesDePago(AdvantageonlineshoppingBuyOnlineModels buyOnlineModels){

        int metodospagoexitentes=0;
        if(buyOnlineModels.getOpcionPago1().toLowerCase()
                .equals(getMetodoPagoSafepay().getAttribute("alt").toLowerCase())){
            metodospagoexitentes++;
        }
        if(buyOnlineModels.getOpcionPago2().toLowerCase()
                .equals(getMetodoPagoMasterCredit().getAttribute("alt").toLowerCase())){
            metodospagoexitentes++;
        }
        MatcherAssert.assertThat("se muestra los dos metodos de pago"
                ,metodospagoexitentes,Matchers.is(2));
    }

    public void seleccionarMetodoPagoSafePay(){
        getMetodoPagoSafepay().click();
    }

    public void seleccionarMetodoPagoMasterCredit(){
        getMetodoPagoMasterCredit().click();

    }

    public void validarOpcionEditarTarjetaCredito(){
        int opcionEcontrada=0;
        if(getLinkEditarTarjetaCredito().isEnabled()){
            opcionEcontrada++;
        }
        MatcherAssert.assertThat("la opcion editar tarjeta  de credito esta habilitada",opcionEcontrada,Matchers.is(1));

    }

    public void hacerClicEditarTarjetaCredito(){
        getLinkEditarTarjetaCredito().click();
    }

    public void validarCargadeDatosTarjetaCreditoAnterior(int cantidadcampoRequeridos){

        int camposRequeridosExistentes=0;
        if (!getCardNumber().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        if (!getCardHolderName().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        if (!getCvvNumber().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        if (!getYear().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        if(!getCardHolderName().getAttribute("value").isEmpty()){
            camposRequeridosExistentes++;
        }
        MatcherAssert.assertThat("la cantidad de campos diligencias es igual a la cantidad de campos requeridos",
                camposRequeridosExistentes,Matchers.is(cantidadcampoRequeridos));

    }

    public void validaBotonPaynowEstaPresente(){

        int btnPayNowHabilitado=0;
        if(getBtnPayNow().isEnabled()){
            btnPayNowHabilitado++;
        }
        MatcherAssert.assertThat("EL boton esta presente y habilitado",
                btnPayNowHabilitado, Matchers.is(1));
    }

    public void hacerClicBotonPayNow(){
        getBtnPayNow().click();
    }

    public void validarCamposOrdenDePago(AdvantageonlineshoppingBuyOnlineModels buyOnlineModels){
        List<String> listaCamposOrdenPago = new ArrayList<>();
        listaCamposOrdenPago.add(buyOnlineModels.getDireccionDeEntrega());
        listaCamposOrdenPago.add(buyOnlineModels.getMedioDePago());
        listaCamposOrdenPago.add(buyOnlineModels.getResumenCompra());
        listaCamposOrdenPago.add(buyOnlineModels.getNumeroOrden());
        listaCamposOrdenPago.add(buyOnlineModels.getNumeroGuia());


        int campoPresente=0;
        if(getDireccionDeEntrega().getText().contains(buyOnlineModels.getDireccionDeEntrega())){
            campoPresente++;

        }
        if(getMedioDePago().getText().contains(buyOnlineModels.getMedioDePago())){
            campoPresente++;

        }
        if(getResumenCompra().getText().contains(buyOnlineModels.getResumenCompra())){
            campoPresente++;

        }
        if(getNumeroOrden().isPresent()){
            campoPresente++;

        }
        if(getNumeroGuia().isPresent()){
            campoPresente++;

        }
         MatcherAssert.assertThat("los campos estan presentes ybson iguales a los del requerimiento",
                 campoPresente,Matchers.is(listaCamposOrdenPago.size()));

    }

}
