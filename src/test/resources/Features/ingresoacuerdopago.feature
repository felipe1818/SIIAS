# language: es
  @ingresoacuerdopago
Característica: El usuario podra generar un expediente con los acuerdo depago

  Antecedentes:
  Los usuario podran generar un reporte

  Escenario: usuario podra generar un reporte

    #login

    Dado ingresar al ambiente
    Cuando ingresar usuario "coordinadorcc" y contrasena "123$123"
    Entonces se visualiza la pantalla de inicio

    #reporte

    Dado seleccionar boton "Reportes"
    Cuando seleccionar el reporte ingreso acuerdo pago
    Entonces agregar fehca inicial "01/05/2022" y fecha final "14/09/2022"

    Dado descargar archivos reporte
