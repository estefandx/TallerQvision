package proyectoQvision.pages;
import com.ibm.icu.impl.UResource.Key;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
public class SelectJqueryDropDownPage extends PageObject {

  @FindBy(id = "select2-country-container")
  private WebElementFacade selectPais;

  @FindBy(xpath = "//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']")
  private WebElementFacade txtFiltroBusquedaPais;

  @FindBy(xpath = "//*[@id='country']/following-sibling::span")
  private WebElementFacade cmbPais;


  public  void seleccionarPais(String pais){
    cmbPais.waitUntilVisible().click();
    txtFiltroBusquedaPais.sendKeys(pais);
    txtFiltroBusquedaPais.sendKeys(Keys.ENTER);
  }

  public String getValorSelectPais(){
    return selectPais.getAttribute("title");
  }



}
