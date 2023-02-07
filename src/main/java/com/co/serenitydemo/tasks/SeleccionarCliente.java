package com.co.serenitydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.co.serenitydemo.userinterfaces.Cliente.LBL_CUSTOMERID;
import static com.co.serenitydemo.userinterfaces.Cliente.SEARCH_CUSTOMER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarCliente implements Task {

    private final String clienteID;
    private final Logger logger = Logger.getLogger(SeleccionarCliente.class.getName());

    public SeleccionarCliente(String clienteID) {
        this.clienteID = clienteID;
    }

    public static SeleccionarCliente paraEditar(String clienteID) {
        return instrumented(SeleccionarCliente.class, clienteID);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember("CUSTOMER_ID", clienteID);
        actor.attemptsTo(Enter.theValue(clienteID).into(SEARCH_CUSTOMER));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.log(Level.WARNING, "Interrupted!", e);
            Thread.currentThread().interrupt();
        }
        actor.attemptsTo(
                Ensure.that(LBL_CUSTOMERID).text().isEqualTo(clienteID),
                Click.on(LBL_CUSTOMERID));
    }
}
