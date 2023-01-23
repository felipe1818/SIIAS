#language: es
@acumulaciones
  Característica: El usuario crear expediente

  Antecedentes:
  Los usuario crea expediente

  Escenario: usuario podra crea expediente

    #login

    Dado ingresar al ambiente
    Cuando ingresar usuario "digitadorsp" y contrasena "123$124"
    Entonces se visualiza la pantalla de inicio

    #Buscamos posibles investigaciones

    Dado seleccionar boton "Investigaciones"
    Cuando Agregamos numero de acta "SQ03N017215"
    Entonces seleccionar boton "Buscar acta"

    Dado seleccionamos acta
    #Cuando visualizar el archivo
    #Entonces visualizar archivo cargado

    #Acumulacion