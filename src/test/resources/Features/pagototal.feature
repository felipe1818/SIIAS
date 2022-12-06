# language: es
@pagototal
Característica: El usuario podra generar un expediente con los acuerdo depago

  Antecedentes:
  Los usuario podran generar un reporte

  Escenario: usuario podra generar un reporte

    #login

    Dado ingresar usuario "coordinadorsp" y contrasena "123$123"
    Cuando se visualiza la pantalla de inicio
    Entonces seleccionar boton "Buscar"


    #Buscar un expediente

    Dado agregar ano del expediente "2019" y numero expediente "1"
    #Cuando agregar area origina proceso "Subdirección de vigilancia en Salud Publica"
    #Cuando agregar estado expediente "Expediente Creado en Direccion para reparto" y estado cobro coactivo "ACUERDOS DE PAGO"
    Entonces seleccionar boton "buscar"

    Dado seleccionar expediente
    Cuando se visualiza la informacion del expediente
    Entonces seleccionar boton "pago y liquidacion"

    Dado seleccionar boton "Salir"
