package proyectoQvision.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
public class SelectDropDownListPage extends PageObject {

  @FindBy(id = "select-demo")
  WebElementFacade selectDiaSemana;

  @FindBy(xpath = "//*[@id='easycont']//p[@class='selected-value']")
  WebElementFacade resultadoSelectDiaSeamana;

  public void seleccionarDiaSemana(String diaSemana) {
    selectDiaSemana.click();
    selectDiaSemana.selectByVisibleText(diaSemana.trim());
  }

  public String getResultadoSelectDiaSemana() {
    return resultadoSelectDiaSeamana.getText();
  }
}
