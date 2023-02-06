# language: es
@expedientedevuelto
Característica: El usuario devolver expedientes

  Antecedentes:
  Los usuario podra visualizar devolver expediente

  Escenario: usuario podra devolver expediente

    #login

    Dado ingresar al ambiente
    Cuando ingresar usuario "coordinadorcc" y contrasena "123$123"
    Entonces se visualiza la pantalla de inicio

    Dado seleccionar boton "Verificar"
    Cuando seleccionar boton "Requisitos"
    Entonces seleccionar radicado "0"

    #Aprobar o devolver expediente

    Dado seleccionar expediente "0"
    Cuando visualizar pantalla requisitos
    Entonces Datos personales "Datos No" Documentos "Documentos No"

    Dado Fecha ejecutoria "Fecha No" Multa "Multa No"
    Cuando Elementos de la obligacion "obligacion No" agregar motivo devolucion "Prueba"
    Entonces seleccionar boton "Aceptar"
    
    Dado seleccionar boton "Verificar"
    Cuando seleccionar boton "Devolucion"
    Entonces seleccionar expediente y revisar detalle devolucion

    Dado seleccionar boton "cerrar"
    Cuando seleccionar boton "Devolver expediente"
    Entonces visualiza expediente

    #

    Dado seleccionar boton "Salir"
    Cuando ingresar usuario "coordinadorsp" y contrasena "123$123"
    Entonces se visualiza la pantalla de inicio

    Dado seleccionar boton "Bitacora"
    Cuando seleccionar boton "Envio cobro"
    Entonces seleccionar boton "Ver expedientes devueltos"

    Dado agregar ano y numero expediente
    Cuando seleccionar boton "Buscar"
    Entonces seleccionar boton "Seleccionar todo"

    Dado visualizar detalle devolucion
    Cuando seleccionar boton "Cerrar"
    Entonces seleccionar boton "enviar Expediente"

    Dado validar alerta
    Cuando seleccionar boton "Bitacora"
    Entonces seleccionar boton "Expedientes enviados"

    Dado agregamos fecha inicial "01112022" y fecha final "07122022"
    Cuando seleccionar boton "Buscar"
    Entonces seleccionamos expediente a visualizar

    Dado volvemos al reporte
    Cuando seleccionar boton "Bitacora"
    Entonces seleccionar boton "Bandeja de salida"

    Dado seleccionar boton "Salir"