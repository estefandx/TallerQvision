package proyectoQvision.steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import proyectoQvision.pages.AlertModalPage;
public class AlertModalStep {

  @Page
  AlertModalPage alertModalPage;


  public void diligenciarMensajeAler(String mensaje){
    alertModalPage.seleccinarVentanaAlert();
    alertModalPage.DiligenciarMensajePompt(mensaje);
  }

  public void validarMensajePompt(String mensaje){
    String resultadomensaje = alertModalPage.getMensajeResultadoAlert();
    MatcherAssert.assertThat(
        "no se encuentra el mensaje esperado" + mensaje
            + "mensaje obtenido" + resultadomensaje,
        resultadomensaje.contains(mensaje));
  }

}
