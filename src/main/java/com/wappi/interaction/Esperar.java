package com.wappi.interaction;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction {
    private int tiempo;

    public Esperar(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(tiempo);
    }

    public static Esperar hasta(int tiempo) {
        return instrumented(Esperar.class, tiempo);
    }
}

