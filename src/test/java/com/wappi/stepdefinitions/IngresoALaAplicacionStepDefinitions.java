package com.wappi.stepdefinitions;


import com.wappi.model.Persona;
import com.wappi.questions.*;
import com.wappi.tasks.DiligenciarFormulario;
import com.wappi.tasks.IngresarNombreDeUsuario;
import com.wappi.tasks.IngresarUnaContrasena;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static com.wappi.stepdefinitions.ValidarPedidosStepDefinitions.yohana;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class IngresoALaAplicacionStepDefinitions {


    @Cuando("^Ella diligencia el formulario$")
    public void ellaDiligenciaElFormulario(List<Persona> personas) {
        yohana.attemptsTo(DiligenciarFormulario.deIngreso(personas));
    }

    @Cuando("^Ella ingresa un nombre de usuario (.*)$")
    public void ellaIngresaUnNombreDeUsuario(String usuario) {
        yohana.attemptsTo(IngresarNombreDeUsuario.enCampo(usuario));
    }

    @Cuando("^Ella ingresa una contrasena (.*)$")
    public void ellaIngresaUnaContrasena(String contrasena) {
        yohana.attemptsTo(IngresarUnaContrasena.enCampo(contrasena));
    }

    @Entonces("^Ella valida que el ingreso a la aplicacion es exitoso$")
    public void ellaValidaQueElIngresoALaAplicacionEsExitoso() {
        yohana.should(seeThat(VerElTitulo.deOfertas(), equalTo("Ofertas")));
    }

    @Entonces("^Ella visualiza la validacion de minimo de caracteres$")
    public void ellaVisualizaLaValidacionDeMinimoDeCaracteres() {
        yohana.should(seeThat(ValidacionMinimoEnNombreUsuario.deCaracteres(), equalTo("El usuario debe contener entre 6 y 20 caracteres")));
    }

    @Entonces("^Ella visualiza la validacion de maximo de caracteres$")
    public void ellaVisualizaLaValidacionDeMaximoDeCaracteres() {
        yohana.should(seeThat(ValidacionMaximoEnNombreUsuario.deCaracteres(), equalTo("El usuario debe contener entre 6 y 20 caracteres")));
    }

    @Entonces("^Ella visualiza la validacion de minimo de caracteres de contrasena$")
    public void ellaVisualizaLaValidacionDeMinimoDeCaracteresDeContrasena() {
        yohana.should(seeThat(ValidacionMinimoEnContrasena.deCaracteres(), equalTo("La contraseña debe contener entre 8 y 14 caracteres")));
    }


    @Entonces("^Ella visualiza la validacion de maximo de caracteres de contrasena$")
    public void ellaVisualizaLaValidacionDeMaximoDeCaracteresDeContrasena() {
        yohana.should(seeThat(ValidacionMaximoEnContrasena.deCaracteres(), equalTo("La contraseña debe contener entre 8 y 14 caracteres")));
    }
}
