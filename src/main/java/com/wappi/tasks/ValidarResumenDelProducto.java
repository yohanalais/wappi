package com.wappi.tasks;

import com.wappi.model.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

import static com.wappi.userinterface.WappiHomePage.*;

public class ValidarResumenDelProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        Producto producto = new Producto();

        producto.setPrecio(Text.of(TEXTO_PRIMER_PRECIO).viewedBy(actor).asString());
        producto.setDescripcion(Text.of(TEXTO_DESCRIPCION_OFERTA).viewedBy(actor).asString());
        producto.setComercio(Text.of(TEXTO_COMERCIO).viewedBy(actor).asString());
        producto.setCostoDeEnvio(Text.of(TEXTO_COSTO_ENVIO).viewedBy(actor).asString());
        producto.setFecha(Text.of(TEXTO_FECHA_OFERTA).viewedBy(actor).asString());
        producto.setDireccion(Text.of(TEXTO_DIRECCION_COMERCIO).viewedBy(actor).asString());
        actor.remember("producto_de_ofertas", producto);

    }
    public static ValidarResumenDelProducto enOfertas() {
        return Tasks.instrumented(ValidarResumenDelProducto.class);
    }
}
