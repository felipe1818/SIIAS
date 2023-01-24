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
    Cuando Agregamos numero de acta "SQ03S013406"
    Entonces seleccionar boton "Buscar acta"

    Dado visualizar el archivo
    Cuando visualizar archivo cargado
    Entonces seleccionamos acta

    #Acumulacion

    Dado seleccionar boton "Buscar coincidencia"
    Cuando visualizar el archivo
    Entonces visualizar archivo cargado

    #Crear expediente

    Dado seleccionamos coincidencia
    Cuando seleccionar boton "Crear expediente"
    Entonces Validar que se haya creado el expediente

    #Buscar expediente

    Dado seleccionar boton "Buscar expediente"
    Cuando buscar expediente creado
    Entonces seleccionar boton "Busca"

    Dado seleccionar expediente
    Cuando seleccionar boton "Acta"
    Entonces seleccionar acta asociada al expediente
