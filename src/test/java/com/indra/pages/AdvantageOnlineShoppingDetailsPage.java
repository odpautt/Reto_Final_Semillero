package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("orderPayment")
public class AdvantageOnlineShoppingDetailsPage extends PageObject {
    public AdvantageOnlineShoppingDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//div[@id='userDetails']/div/img")
    private WebElementFacade campoDatoNombre;

    @FindBy (xpath = "//div[@id='userDetails']/div/div[@icon-home]")
    private WebElementFacade campoDatoDireccion;

    @FindBy (xpath = "//div[@id='userDetails']/div/div[@icon-phone]")
    private WebElementFacade campoDatoTefono;

    @FindBy (xpath = "//a[contains(.,'Edit shipping details')]")
    private WebElementFacade btnEditarDetalles ;

    /** Datos de la edicion*/

    @FindBy (name = "first_name")
    private WebElementFacade nombreEditable ;

    @FindBy (name = "address")
    private WebElementFacade direccionEditable ;

    @FindBy (name = "phone_number")
    private WebElementFacade telefonoEditable ;

    /** metodos de pago */

    @FindBy(xpath = "//button[@id='next_btn']")
    private WebElementFacade btnNext;

    @FindBy(xpath = "(//div[@class='paymentMethods']/div/img)[1]")
    private WebElementFacade metodoPagoSafepay;

    @FindBy(xpath = "(//div[@class='paymentMethods']/div/img)[2]")
    private WebElementFacade metodoPagoMasterCredit;

    @FindBy(xpath = "//label[@class='edit  ng-scope']")
    private WebElementFacade linkEditarTarjetaCredito;

    /** edicion tarjeta credito*/
    @FindBy(xpath = "//input[contains(@id,'creditCard')]")
    private WebElementFacade cardNumber;
    @FindBy(xpath = "//input[@name='cvv_number']")
    private WebElementFacade cvvNumber;
    @FindBy(xpath = "//select[@name='mmListbox']")
    private WebElementFacade expirationDate;
    @FindBy(xpath = "//select[@name='yyyyListbox']")
    private WebElementFacade year;
    @FindBy(xpath = "//input[@name='cardholder_name']")
    private WebElementFacade cardHolderName;
    @FindBy (xpath = "(//div[@class='blueLink']//a[@class='ng-scope'])[2]")
    private WebElementFacade linkRegresar;

    @FindBy(xpath = "//button[@id='pay_now_btn_MasterCredit']")
    private WebElementFacade btnPayNow;

    @FindBy(xpath = "(//div[@class='seccion borderRight']/span)[1]")
    private WebElementFacade direccionDeEntrega ;
    @FindBy(xpath = "(//div[@class='seccion borderRight']/span)[2]")
    private WebElementFacade medioDePago;
    @FindBy(xpath = "//div[@class='seccion']/span")
    private WebElementFacade resumenCompra;
    @FindBy(xpath = "//p/label[@id='orderNumberLabel']")
    private WebElementFacade numeroOrden;
    @FindBy(xpath = "//p/label[@id='trackingNumberLabel']")
    private WebElementFacade numeroGuia;


    public WebElementFacade getCampoDatoNombre() {
        return campoDatoNombre;
    }

    public WebElementFacade getCampoDatoDireccion() {
        return campoDatoDireccion;
    }

    public WebElementFacade getCampoDatoTefono() {
        return campoDatoTefono;
    }

    public WebElementFacade getBtnEditarDetalles() {
        return btnEditarDetalles;
    }

    public WebElementFacade getNombreEditable() {
        return nombreEditable;
    }

    public WebElementFacade getDireccionEditable() {
        return direccionEditable;
    }

    public WebElementFacade getTelefonoEditable() {
        return telefonoEditable;
    }

    public WebElementFacade getBtnNext() {

        return btnNext;
    }

    public WebElementFacade getMetodoPagoSafepay() {
        return metodoPagoSafepay;
    }

    public WebElementFacade getMetodoPagoMasterCredit() {
        return metodoPagoMasterCredit;
    }

    public WebElementFacade getLinkEditarTarjetaCredito() {
                return linkEditarTarjetaCredito;
    }

    public WebElementFacade getCardNumber() {
        return cardNumber;
    }

    public WebElementFacade getCvvNumber() {
        return cvvNumber;
    }

    public WebElementFacade getExpirationDate() {
        return expirationDate;
    }

    public WebElementFacade getYear() {
        return year;
    }

    public WebElementFacade getCardHolderName() {
        return cardHolderName;
    }

    public WebElementFacade getLinkRegresar() {
        return linkRegresar;
    }

    public WebElementFacade getBtnPayNow() {
        return btnPayNow;
    }

    public WebElementFacade getDireccionDeEntrega() {
        return direccionDeEntrega;
    }

    public WebElementFacade getMedioDePago() {
        return medioDePago;
    }

    public WebElementFacade getResumenCompra() {
        return resumenCompra;
    }

    public WebElementFacade getNumeroOrden() {
        return numeroOrden;
    }

    public WebElementFacade getNumeroGuia() {
        return numeroGuia;
    }
}
