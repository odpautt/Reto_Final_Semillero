package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("https://advantageonlineshopping.com/#/")
public class AdvantageOnlineshoppingPage extends PageObject {
    public AdvantageOnlineshoppingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='hrefUserIcon']")
    private WebElementFacade esperaSeccionImagenes;

    @FindBy(xpath = "//span[@class='shop_now roboto-bold ng-binding']")
    private List<WebElement> todasLasCategorias;

    @FindBy(xpath = "//div[@class='slider']//div[@class='imgContainer']")
    private List<WebElement> espacioPublicidad;

    @FindBy(xpath = "//*[@id='slider_explore_now']/div/div[1]/div[1]/div[1]/img")
    private WebElementFacade espacioDePublicidad;

    @FindBy(xpath = "//article[@id='slider_explore_now']//button[@class='ng-scope']")
    private WebElementFacade textoDelBanner;

    @FindBy(xpath = "//li[@class='nav-li-Links']//a")
    private List<WebElementFacade> listaNombresMenu;


    public WebElementFacade getTextoDelBanner() {
        return textoDelBanner;
    }

    public WebElementFacade getEspacioDePublicidad() {
        return espacioDePublicidad;
    }

    public List<WebElement> getEspacioPublicidad() {
        return espacioPublicidad;
    }

    public List<WebElement> getTodasLasCategorias() {
        return todasLasCategorias;
    }

    public WebElementFacade getEsperaSeccionImagenes() {
        return esperaSeccionImagenes;
    }

    public List<WebElementFacade> getListaNombresMenu() {
        return listaNombresMenu;
    }
}
