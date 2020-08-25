package com.wappi.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PerfilPage {

    public static final Target CAMPO_NOMBRE = Target.the("campo nombre").located(By.id("name"));
    public static final Target CAMPO_APELLIDO = Target.the("campo apellido").located(By.id("lastName"));
    public static final Target CAMPO_FECHA_DE_NACIMIENTO = Target.the("campo fecha de nacimiento").located(By.id("bornDate"));
    public static final Target CAMPO_PAIS = Target.the("campo pais").located(By.id("country"));
    public static final Target BOTON_SEXO_MASCULINO = Target.the("boton sexo masculino").located(By.id("M"));
    public static final Target BOTON_SEXO_FEMENINO = Target.the("boton sexo femenino").located(By.id("F"));
    public static final Target BOTON_CANCELAR = Target.the("boton cancelar").located(By.id("cancel-changes"));
    public static final Target BOTON_GUARDAR = Target.the("boton guardar").located(By.id("save-profile"));
    public static final Target MENSAJE_CONFIRMACION_ACTUALIZACION = Target.the("mensaje confirmacion de actualizacion")
            .locatedBy("//div[@id='confirmation-modal']/div/p");
    public static final Target MENSAJE_ERROR_IMAGEN = Target.the("mensaje de error en imagen").located(By.id("e-image"));
}
