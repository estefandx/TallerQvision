package proyectoQvision.steps;
import org.fluentlenium.core.annotation.Page;
import proyectoQvision.pages.MenuSeleniumPage;
public class MenuSeleniumStep {

  @Page
  MenuSeleniumPage menuSeleniumPage;

  public void seleccionarOpcionMenuDesplegable(String opcionMenuPrincipal,
      String opcionMenuDesplegable) {
    menuSeleniumPage.seleccionarOpcionMenuPrincipal(opcionMenuPrincipal);
    menuSeleniumPage.seleccionarMenuDesplegable(opcionMenuDesplegable);
  }
}
