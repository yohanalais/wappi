package com.wappi.questions;

import com.wappi.model.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.commons.lang3.builder.EqualsBuilder;

import static com.wappi.userinterface.MenuPage.LINK_MIS_PEDIDOS;
import static com.wappi.userinterface.MisPedidosPage.*;

public class LosDatosDePedidos implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        Producto productoOferta = actor.recall("producto_de_ofertas");
        Producto productoPedido = new Producto();

        actor.attemptsTo(Click.on(LINK_MIS_PEDIDOS));
        productoPedido.setFecha(Text.of(TEXTO_FECHA_PEDIDO).viewedBy(actor).asString());
        productoPedido.setDescripcion(Text.of(TEXTO_DESCRIPCION_PEDIDO).viewedBy(actor).asString());
        productoPedido.setPrecio(Text.of(TEXTO_PRECIO_PEDIDO).viewedBy(actor).asString());
        productoPedido.setCostoDeEnvio(Text.of(TEXTO_COSTO_ENVIO_PEDIDO).viewedBy(actor).asString());
        productoPedido.setComercio(Text.of(TEXTO_COMERCIO_PEDIDO).viewedBy(actor).asString());
        productoPedido.setDireccion(Text.of(TEXTO_DIRECCION_PEDIDO).viewedBy(actor).asString());

        return EqualsBuilder.reflectionEquals(productoPedido, productoOferta);
    }

    public static LosDatosDePedidos enHistorial() {
        return new LosDatosDePedidos();
    }
}
