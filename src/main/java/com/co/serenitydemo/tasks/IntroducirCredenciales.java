package com.co.serenitydemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static com.co.serenitydemo.userinterfaces.InicioSesion.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IntroducirCredenciales implements Task {

    private final String userName;
    private final String password;

    public IntroducirCredenciales(List<List<String>> credenciales) {
        userName = credenciales.get(0).get(0);
        password = credenciales.get(0).get(1);
    }

    public static IntroducirCredenciales delAdministrador(List<List<String>> credenciales) {
        return instrumented(IntroducirCredenciales.class, credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userName).into(TXT_USERNAME),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTN_SIGNIN)
        );
    }
}
