package proyectoQvision.steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import proyectoQvision.pages.RadioButtonDemoPage;
public class RadioButtonDemoStep {

  @Page
  RadioButtonDemoPage radioButtonDemoPage;

  public void selecionarGenero(String genero) {
    radioButtonDemoPage.seleccionarGenero(genero);
    radioButtonDemoPage.mostarResuladoRadioButtonGenero();
  }

  public void validarResultadoradioButtonGenero(String mensaje) {
    MatcherAssert.assertThat(
        "el resultado del mensaje no es igual al esperado",
        mensaje.equals(radioButtonDemoPage.getResultadoRadioButtonGenero()));
  }
}
