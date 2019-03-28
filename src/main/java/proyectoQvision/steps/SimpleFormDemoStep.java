package proyectoQvision.steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import proyectoQvision.pages.SimpleFormDemoPage;
public class SimpleFormDemoStep {

  @Page
  SimpleFormDemoPage simpleFormDemoPage;


  public void ingresarMensaje(String mensaje) {
    simpleFormDemoPage.ingresarMensaje(mensaje);
    simpleFormDemoPage.mostrarMensaje();
  }

  public void validarMensaje(String valorEsperado) {

    MatcherAssert.assertThat(
        "el mensaje del resultado  es idefenre al esperado",
        valorEsperado.equals(simpleFormDemoPage.getResultadoMensaje()));
  }

  public void diligenciarNumerosSuma(String numero1, String numero2) throws InterruptedException {
    simpleFormDemoPage.ingresarPrimerNumero(numero1);
    simpleFormDemoPage.ingresarSegundoNumero(numero2);
    simpleFormDemoPage.sumarNumeros();
    Thread.sleep(5000);
  }

  public void validarSuma(String resultado) {
    MatcherAssert.assertThat(
        "el resultado de la suma es diferente al esperado ",
        resultado.equals(simpleFormDemoPage.getResultadoSuma()));
  }

}
