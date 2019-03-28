package proyectoQvision.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
public class SimpleFormDemoPage extends PageObject {

  @FindBy(id = "user-message")
  WebElementFacade txtmensajeUsuario;
  @FindBy(xpath = "//*[@id='get-input']/button")
  WebElementFacade btnMostrarMensaje;
  @FindBy(id = "display")
  WebElementFacade resultadoMensaje;
  @FindBy(id = "sum1")
  WebElementFacade txtSum1;
  @FindBy(id = "sum2")
  WebElementFacade txtSum2;
  @FindBy(xpath = "//*[@id='gettotal']/button")
  WebElementFacade btnResultadoSuma;
  @FindBy(id = "displayvalue")
  WebElementFacade resultadosuma;

  public String getResultadoMensaje() {
    return resultadoMensaje.getText();
  }

  public void ingresarMensaje(String mensaje) {
    txtmensajeUsuario.sendKeys(mensaje);
  }

  public void mostrarMensaje() {
    btnMostrarMensaje.click();
  }

  public void ingresarPrimerNumero(String numero) {
    txtSum1.sendKeys(numero);
  }

  public void ingresarSegundoNumero(String numero) {
    txtSum2.sendKeys(numero);
  }

  public void sumarNumeros() {
    btnResultadoSuma.click();
  }

  public String getResultadoSuma() {
    return resultadosuma.getText();
  }
}
