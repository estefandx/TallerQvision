package proyectoQvision.definitions;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import proyectoQvision.steps.MenuSeleniumStep;
import proyectoQvision.steps.SelemiunStep;
import proyectoQvision.steps.SimpleFormDemoStep;
public class CategoriaInputFormsDefinitions {

  @Steps
  SimpleFormDemoStep SimpleFormDemoStep;
  @Steps
  MenuSeleniumStep menuSeleniumStep;
  @Steps
  SelemiunStep selemiunStep;

  @Dado("^que se ingresa a la pagina de selenium$")
  public void que_se_ingresa_a_la_pagina_de_selenium() {
    selemiunStep.abrirUrl();
  }

  @Cuando("^cuando se ingrese el parametro (.*)$")
  public void cuando_se_ingrese_el_parametro_tales(String parametro) throws InterruptedException {
    menuSeleniumStep.seleccionarOpcionMenuDesplegable("Input Forms", "Simple Form Demo");
    SimpleFormDemoStep.ingresarMensaje(parametro);
  }

  @Entonces("^el valor ingresado debe ser igual a (.*)$")
  public void el_valor_ingresado_debe_ser_igual_a_tales(String valorEsperado) {
    SimpleFormDemoStep.validarMensaje(valorEsperado);
  }

  @Cuando("^cuando se ingrese el numero (.*) y el numero (.*)$")
  public void cuandoSeIngreseElNumeroNumeroYElNumeroNumero(String numero1, String numero2)
      throws InterruptedException {
    menuSeleniumStep.seleccionarOpcionMenuDesplegable("Input Forms", "Simple Form Demo");
    SimpleFormDemoStep.diligenciarNumerosSuma(numero1, numero2);
  }

  @Entonces("^en valor del resultado debe ser (.*)$")
  public void enValorDelResultadoDebeSerSuma(String resultado) {
    SimpleFormDemoStep.validarSuma(resultado);
  }
}
