#language: es

Característica: taller de automatizacion Qvision


  Esquema del escenario: validar mensaje de respuesta
    Dado que se ingresa a la pagina de selenium
    Cuando cuando se seleccione el dia   <diaSemana>
    Entonces se muestra el dia seleccionado  <diaSemana>
    Ejemplos:
      | diaSemana |
      | Thursday  |