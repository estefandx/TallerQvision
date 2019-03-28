package proyectoQvision.definitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import proyectoQvision.steps.MenuSeleniumStep;
import proyectoQvision.steps.RadioButtonDemoStep;
public class CategoriaRadioButtonDefinition {



  @Steps
  MenuSeleniumStep menuSeleniumStep;

  @Steps
  RadioButtonDemoStep radioButtonDemoStep;

  @Cuando("^cuando se seleccione el radio button (.*)$")
  public void cuando_se_seleccione_el_radio_button_Female(String genero)
      throws InterruptedException {
    menuSeleniumStep.seleccionarOpcionMenuDesplegable("Input Forms","Radio Buttons Demo");
    radioButtonDemoStep.selecionarGenero(genero);

  }

  @Entonces("^se nuestra el mensaje de validacion (.*)$")
  public void se_nuestra_el_mensaje_de_validacion_Radio_button_Female_is_checked(String mensaje) {
    radioButtonDemoStep.validarResultadoradioButtonGenero(mensaje);
  }


}
