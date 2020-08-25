package com.wappi.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://automation-wappi.vercel.app/login")
public class WappiLoginPage extends PageObject {
    public static final Target CAMPO_NOMBRE_USUARIO = Target.the("campo nombre de usuario")
            .located(By.id("username"));
    public static final Target CAMPO_CONTRASENA = Target.the("campo contrasena")
            .located(By.id("password"));
    public static final Target BOTON_INGRESO = Target.the("boton ingreso")
            .located(By.id("button-login"));
    public static final Target MENSAJE_ERROR_USUARIO = Target.the("mensaje error usuario")
            .located(By.id("e-username"));
    public static final Target MENSAJE_ERROR_CONTRASENA = Target.the("mensaje error contrasena")
            .located(By.id("e-password"));


}
