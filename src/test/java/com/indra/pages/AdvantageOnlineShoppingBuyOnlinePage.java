package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://advantageonlineshopping.com/#/")
public class AdvantageOnlineShoppingBuyOnlinePage extends PageObject {
    public AdvantageOnlineShoppingBuyOnlinePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "menuUser")
    private WebElementFacade btnIconoLogin;

    @FindBy(xpath = "//input[@name='username']")
    private WebElementFacade userName;

    @FindBy(xpath = "//input[@name='password']")
    private WebElementFacade password;

    @FindBy(id = "sign_in_btnundefined")
    private WebElementFacade btnSignIn;

/** buscar Y agregar articulo */

    @FindBy(xpath = "//div[@id='search']")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//div[@class='autoCompleteCover']//input[@id='autoComplete']")
    private WebElementFacade cajaBuscarArticulo;

    @FindBy(xpath = "//img[@src='../../css/images/closeDark.png']")
    private WebElementFacade btnClose;

    @FindBy(xpath = " //p//a[@class='productName ng-binding']")
    private List<WebElementFacade> listadoArticulos;

    @FindBy(xpath = "//button[@name='save_to_cart']")
    private WebElementFacade btnAgregarCarrito;

    /** Popup Detalles Carrito compras*/

    @FindBy(xpath = "(//a//h3[@class='ng-binding'])")
    private List<WebElement> NombreArticuloHover;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[1][1]/tbody/tr/td/a/label[1]")
    private List<WebElement> cantidadArticulosHover;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[1][1]/tbody/tr/td/a/label/span")
    private List<WebElement> colorArticuloHover;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[1][1]/tbody/tr/td/a/img")
    private List<WebElement> imagenArticuloHover;

    @FindBy(xpath = "//nav//ul//li//a[@id='shoppingCartLink']")
    private WebElementFacade btnCarritoComprasHover;



    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[1][1]/tbody/tr/td/p")
    private List<WebElement> precioArticuloHover;

    /** Detalles CheckOut*/
    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td/label[@class='roboto-regular productName ng-binding']" )
    private List<WebElement> nombreArticuloTabla;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[4]/span")
    private List<WebElement> colorArticuloTabla;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[5]/label[2]")
    private List<WebElement> cantidadArticuloTabla;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[6]/p")
    private List<WebElement> precioArticuloTabla;

    @FindBy(xpath = "(//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[1]/img")
    private List<WebElement> imagenArticuloTabla;

    @FindBy(xpath = "//h3[contains(.,'SHOPPING CART')]")
    private WebElementFacade tituloShoppingCart;

    @FindBy(id = "checkOutButton")
    private WebElementFacade btnCheckOut;

   /**


    colorGrande
    (//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[4]/span
    cantidad grande
    (//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[5]/label[2]
    preciogrande
    (//table[@ng-show='cart.productsInCart.length > 0'])[2]/tbody/tr/td[6]/p
    */
    public WebElementFacade getBtnIconoLogin() {
        return btnIconoLogin;
    }

    public WebElementFacade getUserName() {
        return userName;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public WebElementFacade getBtnSignIn() {
        return btnSignIn;
    }

    public WebElementFacade getBtnBuscar() {
        return btnBuscar;
    }

    public WebElementFacade getCajaBuscarArticulo() {
        return cajaBuscarArticulo;
    }

    public WebElementFacade getBtnClose() {
        return btnClose;
    }

    public List<WebElementFacade> getListadoArticulos() {
        return listadoArticulos;
    }

    public WebElementFacade getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public List<WebElement> getNombreArticuloHover() {
        return NombreArticuloHover;
    }

    public List<WebElement> getCantidadArticulosHover() {
        return cantidadArticulosHover;
    }

    public List<WebElement> getColorArticuloHover() {
        return colorArticuloHover;
    }

    public List<WebElement> getImagenArticuloHover() {
        return imagenArticuloHover;
    }

    public WebElementFacade getBtnCarritoComprasHover() {
        return btnCarritoComprasHover;
    }

    public List<WebElement> getPrecioArticuloHover() {
        return precioArticuloHover;
    }

    public List<WebElement> getNombreArticuloTabla() {
        return nombreArticuloTabla;
    }

    public List<WebElement> getColorArticuloTabla() {
        return colorArticuloTabla;
    }

    public List<WebElement> getCantidadArticuloTabla() {
        return cantidadArticuloTabla;
    }

    public List<WebElement> getPrecioArticuloTabla() {
        return precioArticuloTabla;
    }

    public List<WebElement> getImagenArticuloTabla() {
        return imagenArticuloTabla;
    }

    public WebElementFacade getTituloShoppingCart() {
        return tituloShoppingCart;
    }

    public WebElementFacade getBtnCheckOut() {
        return btnCheckOut;
    }
}
