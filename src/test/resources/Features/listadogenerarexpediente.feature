# language: es
  @ListadoGeneral
Característica: El usuario podra generar un expediente general

  Antecedentes:
     Los usuario podran generar un reporte

  Escenario: usuario podra generar un reporte

    Dado ingresar usuario "coordinadorcc" y contrasena "123$123"
    Cuando se visualiza la pantalla de inicio
    Entonces seleccionar boton "Reportes"

    Dado seleccionar el reporte Listado general
    Cuando seleccionar boton Generar reporte
    Entonces seleccionar boton Descargar reporte