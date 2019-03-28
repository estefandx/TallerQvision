package proyectoQvision.steps;

import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import proyectoQvision.pages.SelectJqueryDropDownPage;
public class SelectJqueryDropDownStep {

  @Page
  SelectJqueryDropDownPage selectJqueryDropDownPage;

  public void seleccionarPais(String pais) {
    selectJqueryDropDownPage.seleccionarPais(pais);
  }

  public void validarPaisSeleccionado(String pais){
    String resultadoPais = selectJqueryDropDownPage.getValorSelectPais();
    MatcherAssert.assertThat(
        "el pais seleccionado " + pais + " no es el seleccionado " + resultadoPais ,
        pais.equals(resultadoPais));
  }
}
