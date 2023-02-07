package com.co.serenitydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.serenitydemo.userinterfaces.Home.LINK_CUSTOMERS;
import static com.co.serenitydemo.userinterfaces.Home.LINK_NORTHWIND;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederAlModuloCliente implements Task {

    public static AccederAlModuloCliente deLaAplicacion() {
        return instrumented(AccederAlModuloCliente.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_NORTHWIND),
                Click.on(LINK_CUSTOMERS)
        );
    }
}
