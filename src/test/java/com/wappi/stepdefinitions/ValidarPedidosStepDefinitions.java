package com.wappi.stepdefinitions;

import com.wappi.questions.*;
import com.wappi.tasks.*;
import com.wappi.userinterface.WappiLoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ValidarPedidosStepDefinitions {


    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    public static Actor yohana = Actor.named("Yohana");

    private WappiLoginPage wappiLoginPage;

    @Before
    public void setUp() {
        yohana.can(BrowseTheWeb.with(herBrowser));
    }

    @Dado("^que Yohana quiere usar Wappi$")
    public void queYohanaQuiereUsarWappi() {
        yohana.wasAbleTo(AbrirElNavegador.en(wappiLoginPage));
    }

    @Y("^obtiene el cupon de bienvenida$")
    public void obtieneElCuponDeBienvenida() {
        yohana.wasAbleTo(ObtenerCupon.deBienvenida());
    }

    @Cuando("^Ella realiza pedidos utilizando el cupon de bienvenida$")
    public void ellaRealizaPedidosUtilizandoElCuponDeBienvenida() {
        yohana.attemptsTo(RealizarPedidoConCupon.deBienvenida());
    }

    @Cuando("^Ella realiza pedidos sin cupon de bienvenida$")
    public void ellaRealizaPedidosSinCuponDeBienvenida() {
        yohana.attemptsTo(RealizarPedidoSinCupon.deBienvenida());
    }

    @Cuando("^Ella  obtiene los datos de la oferta$")
    public void ellaObtieneDatosDeLaOferta() {
        yohana.attemptsTo(ValidarResumenDelProducto.enOfertas());
    }

    @Cuando("^Ella realiza el pedido$")
    public void EllaRealizaElPedido() {
        yohana.attemptsTo(RealizarUnPedido.requerido());
    }

    @Cuando("^Ella utiliza el cupon (.*)$")
    public void ellaUtilizaElCupon(String cupon) {
        yohana.attemptsTo(UtilizarCupon.invalido(cupon));
    }

    @Entonces("^Ella visualiza el uso del cupon (.*)$")
    public void ellaVisualizaElPedidoRealizado(String usoCupon) {
        yohana.should(seeThat(ElCampoDeUsoCupon.es(), equalTo(usoCupon)));
    }

    @Entonces("^Ella visualiza los datos en el modal$")
    public void ellaVisualizaLosDatosEnElModal() {
        yohana.should(seeThat(LosDatosDeOferta.estanEnModal()));
    }

    @Entonces("^Ella visualiza en su historial los datos del pedido realizado$")
    public void ellaVisualizaEnSuHistorialDatosDelPedidoRealizado() {
        yohana.should(seeThat(LosDatosDePedidos.enHistorial()));
    }

    @Entonces("^Ella valida que solo lo pueda utilizar dos veces$")
    public void ellaValidaQueSoloLoPuedaUtilizarDosVeces() {
        yohana.should(seeThat(NoDejaUtilizarCupon.porTerceraVez(), equalTo("Cupón inválido")));
    }

    @Entonces("^Ella valida que el cupon no se puede usar$")
    public void ellaValidaQueElCuponNoSePuedeUsar() {
        yohana.should(seeThat(MensajeDeCupon.invalido(), equalTo("Cupón inválido")));
    }
}
