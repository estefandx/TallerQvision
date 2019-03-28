package proyectoQvision.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.yecht.Data.Str;
public class TableDataSearchPage extends PageObject {

  @FindBy(id = "task-table-filter")

  WebElementFacade txtFiltrarTarea;
  @FindBy(xpath = "//*[@id='task-table']")
  WebElementFacade tblTareas;
  @FindBy(xpath = "//*[@id='task-table']//tbody/tr[@class='filterTable_no_results']/td")
  WebElementFacade mensajeRegistroNoEncontrado;

  public void filtarTarea(String tarea) {
    txtFiltrarTarea.sendKeys(tarea);
  }

  public boolean validarRegistroTablaTarea(String tarea) {

    return tblTareas.findElement(By.xpath("//tbody/tr/td[contains(text(),'" + tarea + "')] "))
        .isDisplayed();
  }

  public String getMensajeTablaSinRegistros(String mensaje){
    return mensajeRegistroNoEncontrado.getText();

  }
}
