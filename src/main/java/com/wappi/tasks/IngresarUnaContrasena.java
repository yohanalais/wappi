package com.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappi.userinterface.WappiLoginPage.*;

public class IngresarUnaContrasena implements Task {

    private String contrasena;

    public IngresarUnaContrasena(String contrasena) {
        this.contrasena = contrasena.trim();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("usuario").into(CAMPO_NOMBRE_USUARIO),
                Enter.theValue(contrasena).into(CAMPO_CONTRASENA),
                Click.on(BOTON_INGRESO));
    }

    public static IngresarUnaContrasena enCampo(String contrasena) {
        return Tasks.instrumented(IngresarUnaContrasena.class, contrasena);
    }
}
