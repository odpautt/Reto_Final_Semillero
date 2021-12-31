package com.indra.actions;

import com.indra.models.AdvantageonlineshoppingBuyOnlineModels;
import com.indra.pages.AdvantageOnlineShoppingBuyOnlinePage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AdvantageonlineshoppingBuyOnlineActions extends AdvantageOnlineShoppingBuyOnlinePage {

    public AdvantageonlineshoppingBuyOnlineActions(WebDriver driver) {
        super(driver);
    }

    public void realizarLogin(){
        hacerClicIconoSignIn();
        llenarInformacionLogin("PruebaOrlando","Prueba123");
        hacerClicBtnSignI();

    }

    public void hacerClicIconoSignIn(){
        getBtnIconoLogin().click();
    }

    public void hacerClicBtnSignI(){
        getBtnSignIn().waitUntilPresent();
        getBtnSignIn().click();
    }

    public void llenarInformacionLogin(String user, String password){
        enter(user).into(getUserName());
        enter(password).into(getPassword());
    }

    public void hacerClicBtnBuscar(){
        getBtnBuscar().waitUntilPresent();
        getBtnBuscar().click();
    }

    public void ingresarArticuloBuscado(String articuloBuscado){
        getCajaBuscarArticulo().waitUntilEnabled();
        enter(articuloBuscado, Keys.ENTER).into(getCajaBuscarArticulo());
    }

    public void hacerClicBtnCerrarBusqueda(){
        getBtnClose().click();
    }

    public void realizarBusquedaDeArticulo(){

        hacerClicBtnBuscar();
        ingresarArticuloBuscado("Chromebook");
        hacerClicBtnCerrarBusqueda();
    }

    public void agregarArticuloAlCarrito(){
        realizarBusquedaDeArticulo();
        getListadoArticulos().get(0).click();
        getBtnAgregarCarrito().click();


    }

    public void moverMouseCarritoCompras(){
        WebElement gmailLink = getDriver().findElement(By.xpath("//nav//ul//li//a[@id='shoppingCartLink']"));
        Actions actionProvider = new Actions(getDriver());// Performs mouse move action onto the element
        actionProvider.moveToElement(gmailLink).build().perform();

    }

    public void validarDetallesDelCarritoCompras(){
        moverMouseCarritoCompras();
        getBtnCarritoComprasHover().click();
        getTituloShoppingCart().isPresent();

        int igualdad=0;
        /** realiza la validacion campo a campo de los detalles de cada uno de los articulos seleccionados, si todos son iguales aumenta el contador en 1 */
        for(int i=0; i< getPrecioArticuloHover().size();i++){
            if(getCantidadArticulosHover().get(i).getText().split(" ")[1].equals(getCantidadArticuloTabla().get(i).getText())
            && getColorArticuloHover().get(i).getText().equals(getColorArticuloTabla()
                    .get(i).getAttribute("title"))
            && getImagenArticuloHover().get(i).getAttribute("src")
                    .equals(getImagenArticuloTabla().get(i).getAttribute("src"))
            && getNombreArticuloTabla().get(i).getText()
                    .contains(getNombreArticuloHover().get(i).getText().replace("...",""))
            && getPrecioArticuloHover().get(i).getText().equals(getPrecioArticuloTabla().get(i).getText())){
                igualdad++;
            }
        }

        MatcherAssert.assertThat("los detalles del pop up del carrito de compras de todos los articulos " +
                "seleccionados es igual al mostrado en el apartado SHOPPING CART ",getCantidadArticulosHover().size(),Matchers.is(igualdad));
    }

    public void hacerClicCheckOut(){
        getBtnCheckOut().click();
    }




}
