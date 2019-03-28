package proyectoQvision.definitions;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import proyectoQvision.steps.MenuSeleniumStep;
import proyectoQvision.steps.TableDataSearchStep;
public class CategoriaTableDefinition {

  @Steps
  MenuSeleniumStep menuSeleniumStep;

  @Steps
  TableDataSearchStep tableDataSearchStep;

  @Cuando("^cuando se busque  la tarea   (.*) en la tabla$")
  public void cuando_se_busque_la_tarea_SEO_tags_en_la_tabla(String tarea) {
   menuSeleniumStep.seleccionarOpcionMenuDesplegable("Table","Table Data Search");
   tableDataSearchStep.buscarTarea(tarea);


  }

  @Entonces("^se muestra un registro con la tarea  (.*)$")
  public void se_muestra_un_registro_con_la_tarea_SEO_tags(String tarea) {
    tableDataSearchStep.verificarRegistroTabla(tarea);


  }

  @Entonces("^se  muestra el mensaje \"([^\"]*)\"$")
  public void seMuestraElMensaje(String mensaje) {
    tableDataSearchStep.verificarTablaSinRegistro(mensaje);


  }
}
