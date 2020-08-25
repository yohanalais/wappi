package com.wappi.questions;

import com.wappi.model.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.commons.lang3.builder.EqualsBuilder;

import static com.wappi.userinterface.WappiHomePage.*;

public class LosDatosDeOferta implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        Producto productoModal = new Producto();
        Producto productoOferta = actor.recall("producto_de_ofertas");

        actor.attemptsTo(Click.on(BOTON_PEDIR_PRIMERA_OFERTA));

        productoModal.setPrecio(Text.of(MODAL_OFERTA_PRECIO).viewedBy(actor).asString());
        productoModal.setDescripcion(Text.of(MODAL_OFERTA_DESCRIPCION).viewedBy(actor).asString());
        productoModal.setComercio(Text.of(MODAL_OFERTA_COMERCIO).viewedBy(actor).asString().substring(9));
        productoModal.setCostoDeEnvio(Text.of(MODAL_OFERTA_COSTO_ENVIO).viewedBy(actor).asString().substring(15));
        productoModal.setFecha(Text.of(MODAL_OFERTA_FECHA).viewedBy(actor).asString().substring(11));
        productoModal.setDireccion(Text.of(MODAL_OFERTA_DIRECCION).viewedBy(actor).asString().substring(12));
        actor.attemptsTo(Click.on(MODAL_OFERTA_CERRAR));

        return EqualsBuilder.reflectionEquals(productoModal, productoOferta);

    }

    public static LosDatosDeOferta estanEnModal() {
        return new LosDatosDeOferta();
    }
}
