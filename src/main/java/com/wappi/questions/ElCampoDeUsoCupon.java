package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.MenuPage.LINK_MIS_PEDIDOS;
import static com.wappi.userinterface.MisPedidosPage.TEXTO_USO_CUPON_PRIMERA_VEZ;

public class ElCampoDeUsoCupon implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(LINK_MIS_PEDIDOS));
        return Text.of(TEXTO_USO_CUPON_PRIMERA_VEZ).viewedBy(actor).asString();
    }

    public static ElCampoDeUsoCupon es() {
        return new ElCampoDeUsoCupon();
    }


}
