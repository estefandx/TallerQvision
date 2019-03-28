package proyectoQvision.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features =
        "src/test/resources/features/categoria_checkbox _demo.feature",
    glue = {"proyectoQvision.definitions"}
)
public class CategoriaCheckboxRunner {

}
