package com.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappi.userinterface.MenuPage.LINK_INICIO;
import static com.wappi.userinterface.WappiHomePage.*;

public class RealizarPedidoConCupon implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String codigoCupon = actor.recall("CodigoCupon");
        actor.attemptsTo(Click.on(LINK_INICIO),
                Click.on(BOTON_PEDIR_PRIMERA_OFERTA),
                Enter.theValue(codigoCupon).into(MODAL_INGRESAR_CUPON),
                Click.on(BOTON_CONFIRMAR_PEDIDO),
                Click.on(MODAL_CERRAR_PEDIDO)
        );
    }

    public static RealizarPedidoConCupon deBienvenida() {
        return Tasks.instrumented(RealizarPedidoConCupon.class);
    }
}
