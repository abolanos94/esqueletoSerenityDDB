package co.com.screenplay.project.hook;

import freemarker.core.Environment;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screenplay.project.utils.Constans.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    private EnvironmentVariables environmentVariables;

    public static Performable browserURl() {
        return instrumented(OpenWeb.class);
    }

    @Override
    @Step("open the browser on QuindApp Register Page")
    public <T extends Actor> void performAs(T actor) {
        String pathWebURl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathWebURl));
    }
}
