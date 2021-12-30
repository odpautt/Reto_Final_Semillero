package com.indra.actions;
import com.indra.models.AdvantageOnlineShoppingFollowModels;
import com.indra.pages.AdvantageOnlineShoppingFollowPage;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AdvantageOnlineShoppingFollowActions extends AdvantageOnlineShoppingFollowPage {
    public AdvantageOnlineShoppingFollowActions(WebDriver driver) {
        super(driver);
    }
    public void esperarCargaDeRedesSociales(){
        getSeccionRedesSociales().waitUntilPresent();
    }
    public void validarCantidadRedesSociales(AdvantageOnlineShoppingFollowModels followModelsList){
        List<String> listaRedesSociales = new ArrayList<>();
        listaRedesSociales.add(followModelsList.getRedsocial1());
        listaRedesSociales.add(followModelsList.getRedsocial2());
        listaRedesSociales.add(followModelsList.getRedsocial3());
        int contadorRedesSociales=0;

        for (WebElement redes : getListaRedesSociales()){
            for (int i = 0; i<listaRedesSociales.size();i ++){
                /** Se realiza un split para extraer solo el nombre de la red social*/
                if(redes.getAttribute("name").split("_")[1]
                        .equals(listaRedesSociales.get(i).toLowerCase())){
                    contadorRedesSociales++;
                }
            }
        }
        MatcherAssert.assertThat("la cantidad de redes sociales en la pagina" +
                "es igual a la cantidad de redes sociales en el feature"
                ,contadorRedesSociales, Matchers.is(listaRedesSociales.size()));
    }
}
