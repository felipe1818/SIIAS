# language: es
@pagototal
Característica: El usuario podra agregar pagos

  Antecedentes:
  Los usuario podra agregar pagos

  Escenario:  podra agregar pagos

    #login

    Dado ingresar al ambiente

    Dado ingresar usuario "coordinadorcc" y contrasena "123$123"
    Cuando se visualiza la pantalla de inicio
    Entonces seleccionar boton "Buscar"


    #Buscar un expediente

    Dado agregar ano del expediente "2019" y numero expediente "1"
    Cuando agregar area origina proceso "Subdirección de vigilancia en Salud Publica"
    #Cuando agregar estado expediente "Expediente Creado en Direccion para reparto" y estado cobro coactivo "ACUERDOS DE PAGO"
    Entonces seleccionar boton "buscar"

    Dado seleccionar expediente
    Cuando se visualiza la informacion del expediente
    Entonces seleccionar boton "pago y liquidacion"

    #pagototal

    Dado verificar numero expediente y ano del expediente
    Cuando verificar valor capital y valor interes
    Entonces seleccionar boton "Registrar pagos"

    #Apregar pago

    Dado ingresar fecha de pago "7122022" y valor total pago
    Cuando seleccionar boton "Cerrar"
    Entonces seleccionar boton "Salir"
