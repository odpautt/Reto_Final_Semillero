package com.indra.actions;
import com.indra.models.AdvantageOnlineShoppingModels;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import com.indra.pages.AdvantageonlineshoppingPage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AdvantageonlineshoppingActions extends AdvantageonlineshoppingPage {

    public AdvantageonlineshoppingActions(WebDriver driver) {
        super(driver);
    }

    public void esperarCargaCompletaDePagina(){
        getEsperaSeccionImagenes().waitUntilPresent();
    }

    public void mostrarTodasLasCategorias(){
        List<String> listadoDeCategorias = Arrays.asList("SPEAKERS", "TABLETS", "LAPTOPS", "MICE", "HEADPHONES");
        int contadorCategoriasIguales = 0;
        for(int i=0; i<listadoDeCategorias.size(); i++) {
            for (int j = 0; j < getTodasLasCategorias().size(); j++) {
                if(getTodasLasCategorias().get(j).getText().equals(listadoDeCategorias.get(i))){
                    contadorCategoriasIguales ++;
                }
            }
        }
        MatcherAssert.assertThat("La cantidad de categorias encontradas debe ser igual a " +
                        "la cantidad de categorias de la lista "
                ,listadoDeCategorias.size(),Matchers.is(contadorCategoriasIguales));
    }

    public void encontrarEspaciosDePublicidad(){

        getEspacioDePublicidad().waitUntilVisible();
        MatcherAssert.assertThat("espacio del banner debe estar presente",
                getEspacioDePublicidad().getAttribute("src"), Matchers.containsString("Banner"));
    }

    public void validarNombresDelMenu(AdvantageOnlineShoppingModels advantageonlineshoppingModels){
        List<String> nombreDeLasOpcionesMenu = new ArrayList<>();
        nombreDeLasOpcionesMenu.add(advantageonlineshoppingModels.getOpcion1());
        nombreDeLasOpcionesMenu.add(advantageonlineshoppingModels.getOpcion2());
        nombreDeLasOpcionesMenu.add(advantageonlineshoppingModels.getOpcion3());
        nombreDeLasOpcionesMenu.add(advantageonlineshoppingModels.getOpcion4());
        int contadorNombresMenu=0;

        for (WebElementFacade menu : getListaNombresMenu()){
            for(int i = 0; i<nombreDeLasOpcionesMenu.size(); i++){
                if(menu.getText().equals(nombreDeLasOpcionesMenu.get(i))){
                    contadorNombresMenu ++;
                }
            }
        }
        MatcherAssert.assertThat("La cantidad de nombres encontrados en el menu debe ser igual a " +
                        "la cantidad de la lista del feature"
                ,nombreDeLasOpcionesMenu.size(),Matchers.is(contadorNombresMenu));
    }
}
