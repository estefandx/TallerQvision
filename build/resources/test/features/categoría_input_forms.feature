#language: es

Característica: taller de automatizacion Qvision


  Esquema del escenario: Consultar coberturas filtradas sin enviar parámetros obligatorios
    Dado que se ingresa a la pagina de selenium
    Cuando cuando se ingrese el parametro <poliza>
    Entonces el valor ingresado debe ser igual a <estado>
    Ejemplos:
      | poliza | estado |
      | tales  | tales1 |



