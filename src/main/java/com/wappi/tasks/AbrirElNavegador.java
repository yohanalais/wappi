package com.wappi.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

;

public class AbrirElNavegador implements Task {
    private PageObject page;

    public AbrirElNavegador(PageObject page) {
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));

    }

    public static AbrirElNavegador en(PageObject page) {
        return instrumented(AbrirElNavegador.class, page);
    }

}
