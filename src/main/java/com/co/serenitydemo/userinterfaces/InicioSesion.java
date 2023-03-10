package com.co.serenitydemo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesion extends PageObject {

    private InicioSesion() {
    }

    public static final Target TXT_USERNAME = Target.the("nombre de usuario").located(By.id("LoginPanel0_Username"));
    public static final Target TXT_PASSWORD = Target.the("clave de usuario").located(By.id("LoginPanel0_Password"));
    public static final Target BTN_SIGNIN = Target.the("botón para iniciar sesión").located(By.id("LoginPanel0_LoginButton"));

}
