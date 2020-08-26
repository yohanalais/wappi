package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.WappiHomePage.TITULO_OFERTAS;

public class VerElTitulo implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(TITULO_OFERTAS).viewedBy(actor).asString();
    }

    public static VerElTitulo deOfertas() {
        return new VerElTitulo();
    }
}
