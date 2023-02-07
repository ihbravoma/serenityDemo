package com.co.serenitydemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cliente {

    private Cliente() {
    }

    public static final Target BTN_NUEVOCLIENTE = Target.the("botón para crear nuevo cliente").locatedBy("//*[text()=' Nuevo Customer']");
    public static final Target TXT_CUSTOMERID = Target.the("id del cliente").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_CustomerID"));
    public static final Target TXT_COMPANYNAME = Target.the("nombre de la compañía").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_CompanyName"));
    public static final Target TXT_CONTACTNAME = Target.the("nombre del contacto").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_ContactName"));
    public static final Target TXT_CONTACTTITLE = Target.the("título del contacto").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_ContactTitle"));
    public static final Target TXT_ADDRESS = Target.the("dirección del cliente").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_Address"));
    public static final Target OPT_COUNTRY = Target.the("opciones de países").located(By.id("select2-chosen-5"));
    public static final Target OPT_CITY = Target.the("opciones de ciudades").located(By.id("select2-chosen-6"));
    public static final Target SEARCH_COUNTRY = Target.the("buscador de países").located(By.id("s2id_autogen5_search"));
    public static final Target SEARCH_CITY = Target.the("buscador de ciudades").located(By.id("s2id_autogen6_search"));
    public static final Target TXT_PHONE = Target.the("teléfono del cliente").located(By.id("Serenity_Demo_Northwind_CustomerDialog9_Phone"));
    public static final Target BTN_APPLYCHANGES = Target.the("botón aplicar cambios").locatedBy("//*[@title='Aplicar cambios']//i");
    public static final Target BTN_SAVE = Target.the("botón guardar").locatedBy("//*[text()=' Guardar']");
    public static final Target SEARCH_CUSTOMER = Target.the("buscar de clientes").locatedBy("//div[@class='s-QuickSearchBar']//input[@placeholder='buscar ...']");
    public static final Target LBL_CUSTOMERID = Target.the("cliente ID").locatedBy("//div[@class='ui-widget-content slick-row even' or @class='ui-widget-content slick-row odd']//div[@class='slick-cell l0 r0']//a");
    public static final Target LBL_COMPANYNAME = Target.the("nombre compañía").locatedBy("//div[@class='ui-widget-content slick-row even' or @class='ui-widget-content slick-row odd']//div[@class='slick-cell l1 r1']//a");
    public static final Target LBL_CONTACTNAME = Target.the("nombre de contacto").locatedBy("//div[@class='ui-widget-content slick-row even' or @class='ui-widget-content slick-row odd']//div[@class='slick-cell l2 r2']");
    public static final Target LBL_CONTACTTITLE = Target.the("título contacto").locatedBy("//div[@class='ui-widget-content slick-row even' or @class='ui-widget-content slick-row odd']//div[@class='slick-cell l3 r3']");
    public static final Target LBL_COUNTRY = Target.the("país").locatedBy("//div[@class='ui-widget-content slick-row even' or @class='ui-widget-content slick-row odd']//div[@class='slick-cell l6 r6']");
    public static final Target LBL_CITY = Target.the("ciudad").locatedBy("//div[@class='ui-widget-content slick-row even' or @class='ui-widget-content slick-row odd']//div[@class='slick-cell l7 r7']");
    public static final Target LBL_PHONE = Target.the("teléfono").locatedBy("//div[@class='ui-widget-content slick-row even' or @class='ui-widget-content slick-row odd']//div[@class='slick-cell l8 r8']");

}
