package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.WappiLoginPage.MENSAJE_ERROR_CONTRASENA;


public class ValidacionMaximoEnContrasena implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_ERROR_CONTRASENA).viewedBy(actor).asString();
    }
    public static ValidacionMaximoEnContrasena deCaracteres() {
        return new ValidacionMaximoEnContrasena();
    }
}
