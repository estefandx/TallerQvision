package proyectoQvision.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class MenuSeleniumPage extends PageObject {

  @FindBy(id = "navbar-brand-centered")
  WebElementFacade mnuPrincipal;

  public void seleccionarOpcionMenuPrincipal(String opcion){
    mnuPrincipal.findElement(By.xpath("//ul/li/a[contains(text(),'" + opcion +"')]")).click();
  }

  public void seleccionarMenuDesplegable(String opcion)  {
    mnuPrincipal.findElement(By.xpath("//ul/li/ul/li/a[contains(text(),'" + opcion +"')]")).click();

  }

}
