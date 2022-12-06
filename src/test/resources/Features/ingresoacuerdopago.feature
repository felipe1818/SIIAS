# language: es
  @ingresoacuerdopago
Característica: El usuario podra generar un expediente con los acuerdo depago

  Antecedentes:
  Los usuario podran generar un reporte

  Escenario: usuario podra generar un reporte

    #login

    Dado ingresar usuario "coordinadorcc" y contrasena "123$123"
    Cuando se visualiza la pantalla de inicio
    Entonces seleccionar boton "Reportes"

    #reporte

    Dado seleccionar el reporte ingreso acuerdo pago
    Cuando agregar fehca inicial "01/05/2022" y fecha final "14/09/2022"
    Entonces seleccionar boton "Visualizar reporte"

    Dado descargar archivos reporte