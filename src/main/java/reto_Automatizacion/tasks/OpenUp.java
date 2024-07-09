package reto_Automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import reto_Automatizacion.userinterface.SwagLabsPage;

public class OpenUp implements Task {

        private SwagLabsPage SwagLabsPage;

        public static OpenUp thePage() {return Tasks.instrumented(OpenUp.class); }

        @Override
        public <T extends Actor> void performAs(T actor) {actor.attemptsTo(Open.browserOn(SwagLabsPage)); }
    }
