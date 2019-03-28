package proyectoQvision.steps;
import org.fluentlenium.core.annotation.Page;
import proyectoQvision.pages.SeleniumPage;
public class SelemiunStep {

  @Page
  SeleniumPage seleniumPage;

  public void abrirUrl() {
    seleniumPage.abrirUrl();
  }
}

