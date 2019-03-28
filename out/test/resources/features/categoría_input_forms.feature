#language: es

Característica: taller de automatizacion Qvision


  Esquema del escenario: validar mensaje de respuesta
    Dado que se ingresa a la pagina de selenium
    Cuando cuando se ingrese el parametro <mensaje>
    Entonces el valor ingresado debe ser igual a <mensajeEsperado>
    Ejemplos:
      | mensaje        | mensajeEsperado |
      | mensaje prueba | mensaje prueba  |


  Esquema del escenario: validar suma de dos numeros
    Dado que se ingresa a la pagina de selenium
    Cuando cuando se ingrese el numero <numero1> y el numero <numero2>
    Entonces en valor del resultado debe ser <suma>
    Ejemplos:
      | numero1 | numero2 | suma |
      | 5       | 6       | 11   |



