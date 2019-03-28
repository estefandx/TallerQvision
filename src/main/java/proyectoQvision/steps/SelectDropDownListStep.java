package proyectoQvision.steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import proyectoQvision.pages.SelectDropDownListPage;
public class SelectDropDownListStep {

  @Page
  SelectDropDownListPage selectDropDownListPage;

  public void seleccionarDiaSemana(String diaSemana) {
    selectDropDownListPage.seleccionarDiaSemana(diaSemana);
  }

  public void validarDiaSemana(String diaSemana) {
    String resultadoSelect = selectDropDownListPage.getResultadoSelectDiaSemana();
    MatcherAssert.assertThat(
        "el resultado del mensaje no es igual al esperado dia Esperado:" + diaSemana
            + "mensaje obtenido" + resultadoSelect,
        resultadoSelect.contains(diaSemana));
  }
}
