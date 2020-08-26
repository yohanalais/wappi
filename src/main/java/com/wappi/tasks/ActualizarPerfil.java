package com.wappi.tasks;

import com.wappi.model.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static com.wappi.userinterface.MenuPage.LINK_INFORMACION_PERSONAL;
import static com.wappi.userinterface.PerfilPage.*;

public class ActualizarPerfil implements Task {

    private Persona persona;

    public ActualizarPerfil(List<Persona> personas) {
        this.persona = personas.get(0);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_INFORMACION_PERSONAL),
                Enter.theValue(persona.getNombre()).into(CAMPO_NOMBRE),
                Enter.theValue(persona.getApellido()).into(CAMPO_APELLIDO),
                Enter.theValue(persona.getFechaNacimiento()).into(CAMPO_FECHA_DE_NACIMIENTO),
                SelectFromOptions.byVisibleText(persona.getPais()).from(CAMPO_PAIS));

        if (persona.getGenero().equalsIgnoreCase("M")) {
            actor.attemptsTo(Click.on(BOTON_SEXO_MASCULINO));
        } else {
            actor.attemptsTo(Click.on(BOTON_SEXO_FEMENINO));
        }
        actor.attemptsTo(Click.on(BOTON_GUARDAR));
    }

    public static ActualizarPerfil enCampos(List<Persona> personas) {
        return Tasks.instrumented(ActualizarPerfil.class, personas);
    }
}
