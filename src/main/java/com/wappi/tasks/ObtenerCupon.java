package com.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.WappiHomePage.*;

public class ObtenerCupon implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        String codigoCupon;

        actor.attemptsTo(
                Click.on(BOTON_OBTENER_CUPON));
        codigoCupon = Text.of(MODAL_DE_CODIGO_CUPON).viewedBy(actor).asString();
        actor.remember("CodigoCupon", codigoCupon);
        actor.attemptsTo(Click.on(MODAL_CERRAR_CUPON));

    }

    public static ObtenerCupon deBienvenida() {
        return Tasks.instrumented(ObtenerCupon.class);
    }
}
