package com.co.serenitydemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.co.serenitydemo.userinterfaces.Cliente.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarInformacionCliente implements Interaction {

    private final String customerID;
    private final String companyName;
    private final String contactName;
    private final String contactTitle;
    private final String address;
    private final String country;
    private final String city;
    private final String phone;

    public LlenarInformacionCliente(List<List<String>> datosCliente) {
        customerID = datosCliente.get(0).get(0);
        companyName = datosCliente.get(0).get(1);
        contactName = datosCliente.get(0).get(2);
        contactTitle = datosCliente.get(0).get(3);
        address = datosCliente.get(0).get(4);
        country = datosCliente.get(0).get(5);
        city = datosCliente.get(0).get(6);
        phone = datosCliente.get(0).get(7);
    }

    public static LlenarInformacionCliente nuevo(List<List<String>> datosCliente) {
        return instrumented(LlenarInformacionCliente.class, datosCliente);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("CUSTOMER_ID", customerID);
        actor.remember("COMPANY_NAME", companyName);
        actor.remember("CONTACT_NAME", contactName);
        actor.remember("CONTACT_TITLE", contactTitle);
        actor.remember("COUNTRY", country);
        actor.remember("CITY", city);
        actor.remember("PHONE", phone);
        actor.attemptsTo(
                Enter.theValue(customerID).into(TXT_CUSTOMERID),
                Enter.theValue(companyName).into(TXT_COMPANYNAME),
                Enter.theValue(contactName).into(TXT_CONTACTNAME),
                Enter.theValue(contactTitle).into(TXT_CONTACTTITLE),
                Enter.theValue(address).into(TXT_ADDRESS),
                Click.on(OPT_COUNTRY),
                Enter.theValue(country).into(SEARCH_COUNTRY).thenHit(Keys.ENTER),
                Click.on(OPT_CITY),
                Enter.theValue(city).into(SEARCH_CITY).thenHit(Keys.ENTER),
                Enter.theValue(phone).into(TXT_PHONE)
        );
    }
}
