#language: es

Característica: taller de automatizacion Qvision


  Esquema del escenario: buscar registro en tabla
    Dado que se ingresa a la pagina de selenium
    Cuando cuando se busque  la tarea   <tarea> en la tabla
    Entonces se muestra un registro con la tarea  <tarea>
    Ejemplos:
      | tarea    |
      | SEO tags |

  Esquema del escenario: buscar registro en tabla sin resultados
    Dado que se ingresa a la pagina de selenium
    Cuando cuando se busque  la tarea   <tarea> en la tabla
    Entonces se  muestra el mensaje "No results found"
    Ejemplos:
      | tarea    |
      | Sin registro |