package proyectoQvision.steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import proyectoQvision.pages.CheckBoxDemoPage;
public class CheckBoxDemoStep {

  @Page
  CheckBoxDemoPage checkBoxDemoPage;


  public void seleccionarChekbox() {
    checkBoxDemoPage.seleccionarChekbox();
  }

  public void validarMensajeCheckBox(String mensaje) {
    MatcherAssert.assertThat(
        "el resultado del mensaje no es igual al esperado",
        mensaje.equals(checkBoxDemoPage.getResultadoChekbox()));
  }

}
