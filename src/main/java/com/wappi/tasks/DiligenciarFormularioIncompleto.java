package com.wappi.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static com.wappi.userinterface.MenuPage.LINK_INFORMACION_PERSONAL;
import static com.wappi.userinterface.PerfilPage.*;

public class DiligenciarFormularioIncompleto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_INFORMACION_PERSONAL),
                Enter.theValue("Yohana").into(CAMPO_NOMBRE),
                Enter.theValue("Castillo").into(CAMPO_APELLIDO),
                Enter.theValue("09/11/1988").into(CAMPO_FECHA_DE_NACIMIENTO),
                SelectFromOptions.byVisibleText("Colombia").from(CAMPO_PAIS),
                Click.on(BOTON_SEXO_FEMENINO),
                Click.on(BOTON_GUARDAR));
        ;
    }

    public static DiligenciarFormularioIncompleto sinImagen() {
        return Tasks.instrumented(DiligenciarFormularioIncompleto.class);
    }
}
