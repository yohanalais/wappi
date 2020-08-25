package com.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.wappi.userinterface.WappiHomePage.BOTON_ORDENADOR_PRECIO;

public class OrdenarAscendentemente implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ORDENADOR_PRECIO));
    }

    public static OrdenarAscendentemente losPrecios() {
        return Tasks.instrumented(OrdenarAscendentemente.class);
    }
}
