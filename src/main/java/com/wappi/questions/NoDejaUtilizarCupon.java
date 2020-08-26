package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.WappiHomePage.*;

public class NoDejaUtilizarCupon implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {

        String codigoCupon = actor.recall("CodigoCupon");
        actor.attemptsTo(Click.on(BOTON_PEDIR_SEGUNDA_OFERTA),
        Enter.theValue(codigoCupon).into(MODAL_INGRESAR_CUPON),
                Click.on(BOTON_CONFIRMAR_PEDIDO));
        return Text.of(TEXTO_VALIDACION_CUPON).viewedBy(actor).asString();
    }
    public static NoDejaUtilizarCupon porTerceraVez() {
        return new NoDejaUtilizarCupon();
    }
}
