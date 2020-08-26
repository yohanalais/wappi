package com.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappi.userinterface.WappiHomePage.*;

public class UtilizarCupon implements Task {
    private String cupon;

    public UtilizarCupon(String cupon) {
        this.cupon = cupon.trim();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(BOTON_PEDIR_TERCERA_OFERTA),
                Enter.theValue(cupon).into(MODAL_INGRESAR_CUPON),
                Click.on(BOTON_CONFIRMAR_PEDIDO))
        ;
    }

    public static UtilizarCupon invalido(String cupon) {
        return Tasks.instrumented(UtilizarCupon.class, cupon);
    }
}
