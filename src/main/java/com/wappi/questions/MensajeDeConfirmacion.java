package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.PerfilPage.MENSAJE_CONFIRMACION_ACTUALIZACION;

public class MensajeDeConfirmacion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_CONFIRMACION_ACTUALIZACION).viewedBy(actor).asString();
    }

    public static MensajeDeConfirmacion deActualizacion() {
        return new MensajeDeConfirmacion();
    }
}
