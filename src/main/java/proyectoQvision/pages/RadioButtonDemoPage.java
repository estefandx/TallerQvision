package proyectoQvision.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
public class RadioButtonDemoPage extends PageObject {

  @FindBy(xpath = "//*[@id='easycont']/div/div/div/div")
  WebElementFacade contenedorRadioButtonGenero;
  @FindBy(id = "buttoncheck")
  WebElementFacade btnValorRadioButtonGenero;
  @FindBy(xpath = "//*[@class='radiobutton']")
  WebElementFacade resultadoRadioButonGenero;

  public void seleccionarGenero(String genero) {
    contenedorRadioButtonGenero
        .findElement(By.xpath("//label[contains(text(),'" + genero.trim() + "')]")).click();
  }

  public void mostarResuladoRadioButtonGenero() {
    btnValorRadioButtonGenero.click();
  }

  public String getResultadoRadioButtonGenero() {
    return resultadoRadioButonGenero.getText();
  }
}
