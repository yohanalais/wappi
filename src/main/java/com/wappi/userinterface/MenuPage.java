package com.wappi.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {
	public static final Target LINK_INICIO = Target.the("link inicio").located(By.linkText("Inicio"));
	public static final Target LINK_CUPONES = Target.the("link cupones").located(By.linkText("Cupones"));
	public static final Target LINK_MIS_PEDIDOS = Target.the("link mis pedidos").located(By.linkText("Mis pedidos"));
	public static final Target LINK_INFORMACION_PERSONAL = Target.the("link informacion personal").located(By.linkText("Información personal"));
	public static final Target LINK_CERRAR_SESION = Target.the("link cerrar sesion").located(By.linkText("Cerrar Sesión"));

}
