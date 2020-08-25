package com.wappi.stepdefinitions;


import com.wappi.questions.EstanPreciosOrdenados;
import com.wappi.tasks.OrdenarAscendentemente;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static com.wappi.stepdefinitions.ValidarPedidosStepDefinitions.yohana;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class OrdenadorDeOfertasStepDefinitions {


    @Cuando("^Ella ordena ascendentemente los precios$")
    public void ellaOrdenaAscendentementeLosPrecios() {
        yohana.attemptsTo(OrdenarAscendentemente.losPrecios());
    }

    @Entonces("^Ella valida que esten ordenados correctamente$")
    public void ellaValidaQueEstenOrdenadosCorrectamente() {
        yohana.should(seeThat(EstanPreciosOrdenados.ascendentemente()));
    }
}
