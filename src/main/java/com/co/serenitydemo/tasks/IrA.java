package com.co.serenitydemo.tasks;

import com.co.serenitydemo.userinterfaces.InicioSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrA implements Task {

    public static IrA laPagina() {
        return instrumented(IrA.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.browserOn(new InicioSesion()));
    }

}
