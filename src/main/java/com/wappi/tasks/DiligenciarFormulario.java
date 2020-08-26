package com.wappi.tasks;


import com.wappi.model.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.wappi.userinterface.WappiLoginPage.*;

public class DiligenciarFormulario implements Task {

    private Persona persona;

    public DiligenciarFormulario(List<Persona> personas) {
        this.persona = personas.get(0);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(persona.getNombreUsuario()).into(CAMPO_NOMBRE_USUARIO),
                Enter.theValue(persona.getContrasena()).into(CAMPO_CONTRASENA),
                Click.on(BOTON_INGRESO));
    }

    public static DiligenciarFormulario deIngreso(List<Persona> persona) {
        return Tasks.instrumented(DiligenciarFormulario.class, persona);
    }


}
