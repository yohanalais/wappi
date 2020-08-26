package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.WappiHomePage.TEXTO_VALIDACION_CUPON;

public class MensajeDeCupon implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TEXTO_VALIDACION_CUPON).viewedBy(actor).asString();
    }

    public static MensajeDeCupon invalido() {
        return new MensajeDeCupon();
    }
}
