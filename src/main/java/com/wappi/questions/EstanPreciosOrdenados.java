package com.wappi.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.ArrayList;
import java.util.List;

import static com.wappi.userinterface.WappiHomePage.TEXTO_PRECIO;

public class EstanPreciosOrdenados implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        List<Integer> precios = new ArrayList<>();

        String precio;

        for (int i = 0; i < 3; i++) {
            precio = Text.of(TEXTO_PRECIO.of("" + i)).viewedBy(actor).asString();
            precio = precio.replaceAll("[$,.]", "");
            precios.add(Integer.parseInt(precio));

        }
        for (int i = 0; i < 3; i++) {
            if (i != 0) {

                if (precios.get(i) < precios.get(i - 1)) {
                    return false;
                }
            }
        }
        return true;

    }

    public static EstanPreciosOrdenados ascendentemente() {
        return new EstanPreciosOrdenados();
    }
}
