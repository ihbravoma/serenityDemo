package com.co.serenitydemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {

    private Home() {
    }

    public static final Target LINK_NORTHWIND = Target.the("enlace northwind").locatedBy("//*[@id='nav_menu1_2']//span[text()='Northwind']");
    public static final Target LINK_CUSTOMERS = Target.the("enlace para acceder al módulo de clientes").locatedBy("//*[@id='nav_menu1_2_1']//span[text()='Customers']");

}
