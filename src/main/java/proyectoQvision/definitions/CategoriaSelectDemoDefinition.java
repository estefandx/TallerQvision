package proyectoQvision.definitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import proyectoQvision.steps.MenuSeleniumStep;
import proyectoQvision.steps.SelectDropDownListStep;
import proyectoQvision.steps.SelemiunStep;
public class CategoriaSelectDemoDefinition {

  @Steps
  SelemiunStep selemiunStep;

  @Steps
  MenuSeleniumStep menuSeleniumStep;

  @Steps
  SelectDropDownListStep selectDropDownListStep;

  @Cuando("^cuando se seleccione el dia (.*)$")
  public void cuando_se_seleccione_el_dia_Female(String diaSemana)   {
    menuSeleniumStep.seleccionarOpcionMenuDesplegable("Input Forms","Select Dropdown List");
    selectDropDownListStep.seleccionarDiaSemana(diaSemana);

  }

  @Entonces("^se muestra el dia seleccionado (.*)$")
  public void se_nuestra_el_dia_seleccionado_Female(String diaSemana) {
    selectDropDownListStep.validarDiaSemana(diaSemana);

  }

}
