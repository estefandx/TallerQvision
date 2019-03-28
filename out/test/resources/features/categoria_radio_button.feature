#language: es

Característica: taller de automatizacion Qvision


  Esquema del escenario: validar mensaje de respuesta
    Dado que se ingresa a la pagina de selenium
    Cuando cuando se seleccione el radio button   <radioButton>
    Entonces se nuestra el mensaje de validacion <mensajeEsperado>
    Ejemplos:
      | radioButton | mensajeEsperado                  |
      | Female      | Radio button 'Female' is checked |