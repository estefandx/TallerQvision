package proyectoQvision.pages;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://www.seleniumeasy.com/test/")
public class SeleniumPage extends PageObject {

  public void abrirUrl() {
    getDriver().get("https://www.seleniumeasy.com/test/");
  }

}
