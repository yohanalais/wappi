package com.wappi.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.wappi.userinterface.WappiLoginPage.CAMPO_CONTRASENA;
import static com.wappi.userinterface.WappiLoginPage.CAMPO_NOMBRE_USUARIO;

public class IngresarNombreDeUsuario implements Task {

    private String usuario;

    public IngresarNombreDeUsuario(String usuario) {
        this.usuario = usuario.trim();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(usuario).into(CAMPO_NOMBRE_USUARIO),
                Click.on(CAMPO_CONTRASENA));
    }

    public static IngresarNombreDeUsuario enCampo(String usuario) {

        return Tasks.instrumented(IngresarNombreDeUsuario.class, usuario);
    }
}
