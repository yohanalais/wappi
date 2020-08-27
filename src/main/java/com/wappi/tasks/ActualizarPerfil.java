package com.wappi.tasks;

import com.wappi.interaction.Esperar;
import com.wappi.model.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import static com.wappi.userinterface.MenuPage.LINK_INFORMACION_PERSONAL;
import static com.wappi.userinterface.PerfilPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class ActualizarPerfil implements Task {

    private Persona persona;

    public ActualizarPerfil(List<Persona> personas) {
        this.persona = personas.get(0);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        File imagen = new File("imagen/3d-theme-yf6");
        String rutaImagen = imagen.getAbsolutePath();

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

        actor.attemptsTo(Click.on(BOTON_SELECCIONAR_IMAGEN));

        StringSelection ss = new StringSelection (rutaImagen);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress (KeyEvent.VK_ENTER);
        robot.keyRelease (KeyEvent.VK_ENTER);
        robot.keyPress (KeyEvent.VK_CONTROL);
        robot.keyPress (KeyEvent.VK_V);
        robot.keyRelease (KeyEvent.VK_V);
        robot.keyRelease (KeyEvent.VK_CONTROL);
        robot.keyPress (KeyEvent.VK_ENTER);
        robot.keyRelease (KeyEvent.VK_ENTER);

        actor.attemptsTo(Esperar.hasta(10000));

        actor.attemptsTo(Click.on(BOTON_GUARDAR));
    }

    public static ActualizarPerfil enCampos(List<Persona> personas) {
        return Tasks.instrumented(ActualizarPerfil.class, personas);
    }
}
