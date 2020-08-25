package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.WappiLoginPage.MENSAJE_ERROR_USUARIO;


public class ValidacionMinimoEnNombreUsuario implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_ERROR_USUARIO).viewedBy(actor).asString();
    }

    public static ValidacionMinimoEnNombreUsuario deCaracteres() {
        return new ValidacionMinimoEnNombreUsuario();
    }
}
