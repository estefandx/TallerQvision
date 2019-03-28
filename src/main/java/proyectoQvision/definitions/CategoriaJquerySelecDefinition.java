package proyectoQvision.definitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import proyectoQvision.steps.MenuSeleniumStep;
import proyectoQvision.steps.SelectJqueryDropDownStep;
public class CategoriaJquerySelecDefinition {

  @Steps
  MenuSeleniumStep menuSeleniumStep;
  @Steps
  SelectJqueryDropDownStep selectJqueryDropDownStep;

  @Cuando("^cuando se seleccione el el pais  (.*)$")
  public void cuando_se_seleccione_el_el_pais_Australia(String pais) {
    menuSeleniumStep.seleccionarOpcionMenuDesplegable("Input Forms", "JQuery Select dropdown");
    selectJqueryDropDownStep.seleccionarPais(pais);
  }

  @Entonces("^se valida que el pais (.*) exista en el select$")
  public void se_valida_que_el_Australia_exista_en_el_select(String pais) {
    selectJqueryDropDownStep.validarPaisSeleccionado(pais);

  }
}
