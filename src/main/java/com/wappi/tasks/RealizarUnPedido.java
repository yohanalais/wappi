package com.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.wappi.userinterface.WappiHomePage.*;

public class RealizarUnPedido implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(BOTON_PEDIR_PRIMERA_OFERTA),
                Click.on(BOTON_CONFIRMAR_PEDIDO),
                Click.on(MODAL_CERRAR_PEDIDO)
        );
    }

    public static RealizarUnPedido requerido() {
        return Tasks.instrumented(RealizarUnPedido.class);
    }
}
