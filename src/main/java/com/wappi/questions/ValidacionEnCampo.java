package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.PerfilPage.MENSAJE_ERROR_IMAGEN;

public class ValidacionEnCampo implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(MENSAJE_ERROR_IMAGEN).viewedBy(actor).asString();
    }
    public static ValidacionEnCampo deImagen() {
        return new ValidacionEnCampo();
    }
}
