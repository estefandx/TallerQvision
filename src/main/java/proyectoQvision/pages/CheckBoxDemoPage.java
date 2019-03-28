package proyectoQvision.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class CheckBoxDemoPage  extends PageObject {

  @FindBy(id = "isAgeSelected")
  WebElementFacade chkmensaje;

  @FindBy(id = "txtAge")
  WebElementFacade resultadoCheckBox;

  public void seleccionarChekbox() {
    chkmensaje.waitUntilClickable().click();
  }

  public String getResultadoChekbox() {
    return resultadoCheckBox.getText();
  }

}
