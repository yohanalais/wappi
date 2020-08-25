package com.wappi.stepdefinitions;


import com.wappi.model.Persona;
import com.wappi.questions.MensajeDeConfirmacion;
import com.wappi.questions.ValidacionEnCampo;
import com.wappi.tasks.ActualizarPerfil;
import com.wappi.tasks.DiligenciarFormulario;
import com.wappi.tasks.DiligenciarFormularioIncompleto;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static com.wappi.stepdefinitions.ValidarPedidosStepDefinitions.yohana;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class ActualizarPerfilStepDefinitions {


    @Cuando("^Ella actualiza los campos del perfil$")
    public void ellaActualizaLosCamposDelPerfil(List<Persona> personas) {
        yohana.attemptsTo(ActualizarPerfil.enCampos(personas));
    }

    @Cuando("^Ella diligencia el formulario incompleto$")
    public void ellaDiligenciaElFormularioIncompleto(List<Persona> personas) {
        yohana.attemptsTo(DiligenciarFormularioIncompleto.sinImagen());
    }

    @Entonces("^Ella visualiza un mensaje de confirmacion$")
    public void EllaVisualizaUnMensajeDeConfirmacion() {
        yohana.should(seeThat(MensajeDeConfirmacion.deActualizacion(), equalTo("Tu información se guardó correctamente")));
    }

    @Entonces("^Ella visualiza un mensaje de validacion en el campo$")
    public void ellaVisualizaUnMensajeDeValidacionEnElCampo() {
        yohana.should(seeThat(ValidacionEnCampo.deImagen(), equalTo("La imagen es requerida")));
    }
}
