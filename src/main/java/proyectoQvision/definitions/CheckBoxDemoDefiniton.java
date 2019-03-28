package proyectoQvision.definitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import proyectoQvision.steps.CheckBoxDemoStep;
import proyectoQvision.steps.MenuSeleniumStep;
public class CheckBoxDemoDefiniton {

  @Steps
  MenuSeleniumStep menuSeleniumStep;
  @Steps
  CheckBoxDemoStep checkBoxDemoStep;

  @Cuando("^cuando se selecciona la casilla checkbox$")
  public void cuando_se_selecciona_la_casilla_checkbox()   {
    menuSeleniumStep.seleccionarOpcionMenuDesplegable("Input Forms", "Checkbox Demo");
    checkBoxDemoStep.seleccionarChekbox();
  }

  @Entonces("^se muestra el mensaje \"([^\"]*)\"$")
  public void el_valor_se_muestra_el_mensaje(String mensaje) {
    checkBoxDemoStep.validarMensajeCheckBox(mensaje);
  }
}
