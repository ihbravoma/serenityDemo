package com.co.serenitydemo.tasks;

import com.co.serenitydemo.interactions.LlenarInformacionCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static com.co.serenitydemo.userinterfaces.Cliente.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CrearUnCliente implements Task {

    private final List<List<String>> datosCliente;

    public CrearUnCliente(List<List<String>> datosCliente) {
        this.datosCliente = datosCliente;
    }

    public static CrearUnCliente nuevo(List<List<String>> datosCliente) {
        return instrumented(CrearUnCliente.class, datosCliente);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NUEVOCLIENTE, WebElementStateMatchers.isEnabled()),
                Click.on(BTN_NUEVOCLIENTE),
                LlenarInformacionCliente.nuevo(datosCliente),
                Click.on(BTN_APPLYCHANGES),
                WaitUntil.the(BTN_SAVE, isClickable()),
                Click.on(BTN_SAVE)
        );
    }
}
