package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.WappiHomePage.MENSAJE_CONFIRMACION_PEDIDO;

public class MensajeConfirmacionDePedido implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_CONFIRMACION_PEDIDO).viewedBy(actor).asString();
    }

    public static MensajeConfirmacionDePedido exitoso() {
        return new MensajeConfirmacionDePedido();
    }
}
