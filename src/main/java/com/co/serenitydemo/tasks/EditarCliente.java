package com.co.serenitydemo.tasks;

import com.co.serenitydemo.userinterfaces.Cliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.co.serenitydemo.userinterfaces.Cliente.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class EditarCliente implements Task {

    private final String contactName;
    private final String contactTitle;
    private final String address;
    private final String country;
    private final String city;
    private final String phone;

    public EditarCliente(List<List<String>> datosCliente) {
        contactName = datosCliente.get(0).get(0);
        contactTitle = datosCliente.get(0).get(1);
        address = datosCliente.get(0).get(2);
        country = datosCliente.get(0).get(3);
        city = datosCliente.get(0).get(4);
        phone = datosCliente.get(0).get(5);
    }

    public static EditarCliente informacion(List<List<String>> datosCliente) {
        return instrumented(EditarCliente.class, datosCliente);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("CONTACT_NAME", contactName);
        actor.remember("CONTACT_TITLE", contactTitle);
        actor.remember("COUNTRY", country);
        actor.remember("CITY", city);
        actor.remember("PHONE", phone);
        actor.attemptsTo(
                Enter.theValue(contactName).into(TXT_CONTACTNAME),
                Enter.theValue(contactTitle).into(TXT_CONTACTTITLE),
                Enter.theValue(address).into(Cliente.TXT_ADDRESS),
                Click.on(OPT_COUNTRY),
                Enter.theValue(country).into(SEARCH_COUNTRY).thenHit(Keys.ENTER),
                Click.on(OPT_CITY),
                Enter.theValue(city).into(SEARCH_CITY).thenHit(Keys.ENTER),
                Enter.theValue(phone).into(TXT_PHONE),
                Click.on(BTN_APPLYCHANGES),
                WaitUntil.the(BTN_SAVE, isClickable()),
                Click.on(BTN_SAVE)
        );
    }
}
