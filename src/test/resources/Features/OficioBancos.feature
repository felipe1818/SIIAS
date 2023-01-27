# language: es
@OficioRevisionBanco
Característica: Oficio Revision Banco
  Como un usuario de la entidad cuando ingrese credenciales entonces ingreso al aplicativo.

  Antecedentes:
     #Los usuario podran generar un reporte

  Escenario: usuario podra generar un reporte

    #login

    Dado ingresar usuario "coordinadorcc" y contrasena "123$123"
    Cuando se visualiza la pantalla de inicio
    Entonces seleccionar boton "Buscar"


    #Buscar un expediente

    Dado agregar ano del expediente "2019" y numero expediente "7"
    Cuando agregar area origina proceso "Subdirección de vigilancia en Salud Publica"
    #Cuando agregar estado expediente "Expediente Creado en Direccion para reparto" y estado cobro coactivo "ACUERDOS DE PAGO"
    Entonces seleccionar boton "buscar"

    Dado seleccionar expediente
    Cuando se visualiza la informacion del expediente
    Entonces seleccionar boton "Generar plantilla"

    #Generar plantilla

    Dado se visualiza pantalla generar plantilla
    Cuando agregar tipo de plantilla "Comunicación" y tipo de documento "Comunicación a Bancos"
    Entonces agregar numero de folios "2"

    Dado seleccionar boton "Seleccionar todos"
    Cuando seleccionar boton "Asociar expediente"
    #Entonces agregar ano expediente "2020" y numero del expedente "14"

    #Dado seleccionar direccion area origen "Subdirección de vigilancia en Salud Publica"
    #Cuando seleccionar boton "Consultar"
    Entonces agregar quien revisa "Abogado Juridica" quien firma "Director Prueba"

    Dado seleccionar boton "Generar documento"
    Cuando descargar archivo
