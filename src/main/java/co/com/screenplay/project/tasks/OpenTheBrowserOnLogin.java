package co.com.screenplay.project.tasks;

import co.com.screenplay.project.hook.QuindAppOpenLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTheBrowserOnLogin implements Task {

    public static OpenTheBrowserOnLogin on (){
        return instrumented(OpenTheBrowserOnLogin.class);
    }

    @Override
    @Step("{0} open the browser on QuindApp Home Page")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(new QuindAppOpenLoginPage()));
    }

}
