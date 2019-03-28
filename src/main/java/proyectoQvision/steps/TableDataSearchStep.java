package proyectoQvision.steps;
import org.fluentlenium.core.annotation.Page;
import org.hamcrest.MatcherAssert;
import proyectoQvision.pages.TableDataSearchPage;
public class TableDataSearchStep {

  @Page
  TableDataSearchPage tableDataSearchPage;

  public void buscarTarea(String tarea) {
    tableDataSearchPage.filtarTarea(tarea);
  }

  public void verificarRegistroTabla(String tarea) {

    MatcherAssert.assertThat(
        "no se realizo el filtro correctamente en la tabla",
        tableDataSearchPage.validarRegistroTablaTarea(tarea));
  }

  public void verificarTablaSinRegistro(String mensaje) {
    String mensajeEsperado = tableDataSearchPage.getMensajeTablaSinRegistros(mensaje);

    MatcherAssert.assertThat(
        "no se muestra el mensaje esperado" + mensaje,
        tableDataSearchPage.validarRegistroTablaTarea(mensajeEsperado));
  }
}


