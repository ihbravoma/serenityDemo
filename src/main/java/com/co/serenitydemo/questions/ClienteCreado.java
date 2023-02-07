package com.co.serenitydemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.co.serenitydemo.userinterfaces.Cliente.*;

public class ClienteCreado implements Question<Boolean> {

    private Logger logger = Logger.getLogger(ClienteCreado.class.getName());

    public static ClienteCreado exitosamente() {
        return new ClienteCreado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String customerID = actor.recall("CUSTOMER_ID");
        String companyName = actor.recall("COMPANY_NAME");
        String contactName = actor.recall("CONTACT_NAME");
        String contactTitle = actor.recall("CONTACT_TITLE");
        String country = actor.recall("COUNTRY");
        String city = actor.recall("CITY");
        String phone = actor.recall("PHONE");
        boolean clienteCreado;
        actor.attemptsTo(
                Enter.theValue(customerID).into(SEARCH_CUSTOMER)
        );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.log(Level.WARNING, "Interrupted!", e);
            Thread.currentThread().interrupt();
        }
        clienteCreado = customerID.equals(LBL_CUSTOMERID.resolveFor(actor).getText().trim()) && companyName.equals(LBL_COMPANYNAME.resolveFor(actor).getText().trim()) && contactName.equals(LBL_CONTACTNAME.resolveFor(actor).getText().trim())
                && contactTitle.equals(LBL_CONTACTTITLE.resolveFor(actor).getText().trim()) && country.equals(LBL_COUNTRY.resolveFor(actor).getText().trim())
                && city.equals(LBL_CITY.resolveFor(actor).getText().trim()) && phone.equals(LBL_PHONE.resolveFor(actor).getText().trim());
        return clienteCreado;
    }
}
