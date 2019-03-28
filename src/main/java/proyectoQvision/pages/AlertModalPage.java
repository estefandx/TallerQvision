package proyectoQvision.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
public class AlertModalPage extends PageObject {

  @FindBy(id = "prompt-demo")
  WebElementFacade mensajeResultadoAlert;
  @FindBy(xpath = "//*[@id='easycont']//button[contains(text(),'Click for Prompt Box')]")
  WebElementFacade btnPromptBox;

  public String getMensajeResultadoAlert() {
    return mensajeResultadoAlert.getText();
  }

  public void DiligenciarMensajePompt(String mensaje) {
    getAlert().sendKeys(mensaje);
    getAlert().accept();
  }

  public void seleccinarVentanaAlert() {
    btnPromptBox.waitUntilEnabled().click();
  }
}
