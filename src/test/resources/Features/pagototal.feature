# language: es
@pagototal
Característica: El usuario podra agregar pagos

  Antecedentes:
  Los usuario podra agregar pagos

  Escenario:  podra agregar pagos

    #login

    Dado ingresar al ambiente
    Cuando ingresar usuario "coordinadorcc" y contrasena "123$123"
    Entonces se visualiza la pantalla de inicio

    #Buscar un expediente

    Dado seleccionar boton "Buscar"
    Cuando agregar ano del expediente "2019" y numero expediente "1"
    Entonces agregar area origina proceso "Subdirección de vigilancia en Salud Publica"
    #Cuando agregar estado expediente "Expediente Creado en Direccion para reparto" y estado cobro coactivo "ACUERDOS DE PAGO"

    Dado seleccionar boton "buscar"
    Cuando seleccionar expediente
    Entonces se visualiza la informacion del expediente

    #pagototal

    Dado seleccionar boton "pago y liquidacion"
    Cuando verificar numero expediente y ano del expediente
    Entonces verificar valor capital y valor interes

    #Apregar pago

    Dado seleccionar boton "Registrar pagos"
    Cuando ingresar fecha de pago "07122022" y valor total pago
    Entonces seleccionar boton Calcular valores

    Dado agregar numero CIB y Numero consignacion "1111"
    Cuando ingresar fecha CIB "12122022"
    Entonces seleccionar boton "Guardar pago"

    Dado seleccionar boton "Salir"
