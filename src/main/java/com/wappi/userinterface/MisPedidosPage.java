package com.wappi.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class MisPedidosPage {
    public static final Target TEXTO_USO_CUPON_PRIMERA_VEZ = Target.the("texto uso cupon primera vez")
            .locatedBy("//tr[@id='order-0']/td[7]");
    public static final Target TEXTO_USO_CUPON_SEGUNDA_VEZ = Target.the("texto uso cupon segunda vez")
            .locatedBy("//tr[@id='order-1']/td[7]");
    public static final Target TEXTO_FECHA_PEDIDO = Target.the("texto fecha pedido")
            .locatedBy("//tr[@id='order-0']/td[1]");
    public static final Target TEXTO_DESCRIPCION_PEDIDO = Target.the("texto descripcion pedido")
            .locatedBy("//tr[@id='order-0']/td[2]");
    public static final Target TEXTO_PRECIO_PEDIDO = Target.the("texto precio pedido")
            .locatedBy("//tr[@id='order-0']/td[3]");
    public static final Target TEXTO_COSTO_ENVIO_PEDIDO = Target.the("texto costo envio pedido")
            .locatedBy("//tr[@id='order-0']/td[4]");
    public static final Target TEXTO_COMERCIO_PEDIDO = Target.the("texto comercio pedido")
            .locatedBy("//tr[@id='order-0']/td[5]");
    public static final Target TEXTO_DIRECCION_PEDIDO = Target.the("texto direccion pedido")
            .locatedBy("//tr[@id='order-0']/td[6]");

}
