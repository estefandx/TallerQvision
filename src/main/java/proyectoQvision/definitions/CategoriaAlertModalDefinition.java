package proyectoQvision.definitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import proyectoQvision.steps.AlertModalStep;
import proyectoQvision.steps.MenuSeleniumStep;
public class CategoriaAlertModalDefinition {

  @Steps
  MenuSeleniumStep menuSeleniumStep;

  @Steps
  AlertModalStep alertModalStep;

  @Cuando("^cuando se ingresa la frase \"([^\"]*)\"$")
  public void cuando_se_ingresa_la_frase(String mensaje) {
    menuSeleniumStep.seleccionarOpcionMenuDesplegable("Alerts & Modals","Javascript Alerts");
   alertModalStep.diligenciarMensajeAler(mensaje);


  }

  @Entonces("^se muestra el mensaje del Alert \"([^\"]*)\"$")
  public void se_muestra_el_mensaje_del_Alert(String mensaje) {
   alertModalStep.validarMensajePompt(mensaje);

  }

}
