#language: es

Característica: taller de automatizacion Qvision


  Esquema del escenario: validar select jQuery
    Dado que se ingresa a la pagina de selenium
    Cuando cuando se seleccione el el pais  <pais>
    Entonces se valida que el pais <pais> exista en el select
    Ejemplos:
      | pais      |
      | Australia |