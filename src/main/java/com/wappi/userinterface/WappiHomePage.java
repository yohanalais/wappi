package com.wappi.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class WappiHomePage {
    public static final Target BOTON_OBTENER_CUPON = Target.the("boton obtener cupon")
            .located(By.id("welcome-coupon"));
    public static final Target MODAL_DE_CODIGO_CUPON = Target.the("modal codigo cupon")
            .locatedBy("//div[@id='coupon-modal']/div/span[@id='coupon-code']");
    public static final Target MODAL_CERRAR_CUPON = Target.the("modal cerrar cupon")
            .locatedBy("//div[@id='coupon-modal']/div/span");
    public static final Target BOTON_PEDIR_PRIMERA_OFERTA = Target.the("boton pedir primera oferta")
            .locatedBy("//tr[@id='offer-0']/td[7]/button");
    public static final Target BOTON_PEDIR_SEGUNDA_OFERTA = Target.the("boton pedir segunda oferta")
            .locatedBy("//tr[@id='offer-1']/td[7]/button");
    public static final Target BOTON_PEDIR_TERCERA_OFERTA = Target.the("boton pedir tercera oferta")
            .locatedBy("//tr[@id='offer-2']/td[7]/button");
    public static final Target MODAL_INGRESAR_CUPON = Target.the("modal ingresar cupon")
            .located(By.id("coupon"));
    public static final Target BOTON_CONFIRMAR_PEDIDO = Target.the("boton confirmar pedido")
            .located(By.id("order-confirm"));
    public static final Target MODAL_CERRAR_PEDIDO = Target.the("modal cerrar pedido")
            .locatedBy("//div[@id='confirmation-modal']/div/span");
    public static final Target BOTON_ORDENADOR_PRECIO = Target.the("boton ordenador precio")
            .located(By.id("price-order"));
    public static final Target TITULO_OFERTAS = Target.the("titulo de ofertas")
            .locatedBy("//h1");
    public static final Target MENSAJE_CONFIRMACION_PEDIDO = Target.the("mensaje confirmacion de pedido")
            .locatedBy("//div[@id='confirmation-modal']/div/p");
    public static final Target TEXTO_PRECIO = Target.the("texto de precio")
            .locatedBy("//tr[@id='offer-{0}']/td[3]");
    public static final Target MODAL_OFERTA_DESCRIPCION = Target.the("descripcion de oferta")
            .locatedBy("//div[@id='offer-modal']/div/div/span");
    public static final Target MODAL_OFERTA_PRECIO = Target.the("precio de oferta")
            .locatedBy("//div[@id='offer-modal']/div/div/span[2]");
    public static final Target MODAL_OFERTA_FECHA = Target.the("fecha de oferta")
            .locatedBy("//div[@id='offer-modal']/div/div[2]/span");
    public static final Target MODAL_OFERTA_COSTO_ENVIO = Target.the("costo de envio")
            .locatedBy("//div[@id='offer-modal']/div/div[2]/span[2]");
    public static final Target MODAL_OFERTA_DIRECCION = Target.the("direccion de comercio")
            .locatedBy("//div[@id='offer-modal']/div/div[2]/span[4]");
    public static final Target MODAL_OFERTA_CERRAR = Target.the("cerrar de modal de oferta")
            .locatedBy("//div[@id='offer-modal']/div/span");
    public static final Target MODAL_OFERTA_COMERCIO = Target.the("comercio de oferta")
            .locatedBy("//div[@id='offer-modal']/div/div[2]/span[3]");
    public static final Target TEXTO_DESCRIPCION_OFERTA = Target.the("texto descripcion oferta")
            .locatedBy("//tr[@id='offer-0']/td[2]");
    public static final Target TEXTO_PRIMER_PRECIO = Target.the("texto primer precio")
            .locatedBy("//tr[@id='offer-0']/td[3]");
    public static final Target TEXTO_FECHA_OFERTA = Target.the("texto fecha de oferta")
            .locatedBy("//tr[@id='offer-0']/td");
    public static final Target TEXTO_COSTO_ENVIO = Target.the("texto costo envio")
            .locatedBy("//tr[@id='offer-0']/td[4]");
    public static final Target TEXTO_DIRECCION_COMERCIO = Target.the("texto direccion de comercio")
            .locatedBy("//tr[@id='offer-0']/td[6]");
    public static final Target TEXTO_COMERCIO = Target.the(" texto comercio")
            .locatedBy("//tr[@id='offer-0']/td[5]");
    public static final Target TEXTO_VALIDACION_CUPON = Target.the("texto validacion de cupon")
            .located(By.id("e-coupon"));


}
