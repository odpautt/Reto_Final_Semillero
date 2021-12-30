package com.indra.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://advantageonlineshopping.com/#/")
public class AdvantageOnlineShoppingFollowPage extends PageObject {
    public AdvantageOnlineShoppingFollowPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@id='follow']")
    private WebElementFacade seccionRedesSociales;

    @FindBy(xpath = "//div[@id='follow']//img")
    private List<WebElement> listaRedesSociales;

    public WebElementFacade getSeccionRedesSociales() {
        return seccionRedesSociales;
    }

    public List<WebElement> getListaRedesSociales() {
        return listaRedesSociales;
    }
}
