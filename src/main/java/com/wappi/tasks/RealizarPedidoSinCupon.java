package com.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.wappi.userinterface.WappiHomePage.*;

public class RealizarPedidoSinCupon implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_PEDIR_TERCERA_OFERTA),
                Click.on(BOTON_CONFIRMAR_PEDIDO),
                Click.on(MODAL_CERRAR_PEDIDO)
                );
    }

    public static RealizarPedidoSinCupon deBienvenida() {
        return Tasks.instrumented(RealizarPedidoSinCupon.class);
    }

}
