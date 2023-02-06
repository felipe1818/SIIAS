#language: es
@Admiciones
Característica: El usuario envias el expediente a cobro coactivo

  Antecedentes:
  Los usuario envian expediente

  Escenario: Los usuario envian expediente

  @AdmicionesFase1
  Escenario: Los usuario envian expediente

    Dado ingresar al ambiente
    Cuando ingresar usuario "coordinadorsp" y contrasena "321$321"
    Entonces se visualiza la pantalla de inicio

    Dado seleccionar boton "Buscar"
    Cuando agregar ano del expediente "2018" y numero expediente "10003"
    Entonces seleccionar boton "buscar"

    Dado seleccionar expediente
    Cuando se visualiza la informacion del expediente
    Entonces seleccionar boton "Actos adminsitrativos"

    Dado seleccionar acto administrativo
    Cuando seleccionar boton "Recurso"
    Entonces seleccionar recurso

    Dado seleccionar boton "Cargar archivo"
    Cuando cargar archivo pdf
    Entonces validar que el archivo se haya creado

    Dado Generamos fecha ejecutoria "01022023"
    Cuando seleccionar boton "Bitacora"
    Entonces seleccionar boton "Envio cobro"

    Dado Validar que el expediente este pendiente para ser enviado a cobro coativo

  @AdmicionesFase2
  Escenario: Los usuario envian expediente

    Dado ingresar al ambiente
    Cuando ingresar usuario "coordinadorsp" y contrasena "321$321"
    Entonces se visualiza la pantalla de inicio

    Dado seleccionar boton "Bitacora"
    Cuando seleccionar boton "Expedientes enviados"
    Entonces agregamos fecha inicial "01022023" y fecha final "01022023"

    Dado seleccionar boton "Buscar"
    Cuando obtenemos numero radicado
    Entonces seleccionar boton "Buscar expediente"

    Dado agregar ano del expediente "2018" y numero expediente "10003"
    Cuando seleccionar boton "Buscar"
    Entonces verificar que el estado haya cambiado a "EN REVISION COBRO COACTIVO"

    Dado seleccionar boton "Salir"
    Cuando ingresar usuario "coordinadorcc" y contrasena "123$123"
    Entonces se visualiza la pantalla de inicio

    Dado seleccionar boton "Verificar"
    Cuando seleccionar boton "Requisitos"
    Entonces ingresar al ultimo paginado

    Dado ingresar al radicado
    Cuando Datos personales "Datos No" Documentos "Documentos No"
    Entonces Fecha ejecutoria "Fecha No" Multa "Multa No"

    Dado Elementos de la obligacion "obligacion No" agregar motivo devolucion "Prueba"
    Cuando seleccionar boton "Aceptar"
    Entonces seleccionar boton "Verificar"

    Dado seleccionar boton "Devolucion"
    Cuando devolver expediente a salud publica
    Entonces seleccionar boton "Salir"

    Dado ingresar usuario "coordinadorsp" y contrasena "321$321"
    Cuando se visualiza la pantalla de inicio
    Entonces seleccionar boton "Buscar expediente"

    Dado agregar ano del expediente "2018" y numero expediente "10003"
    Cuando seleccionar boton "Buscar"
    Entonces verificar que el estado haya cambiado a "DEVUELTO AL AREA MISIONAL"

    Dado seleccionar boton "Bitacora"
    Cuando seleccionar boton "Envio cobro"
    Entonces seleccionar boton "Ver expedientes devueltos"

    Dado ingresar filtro del expediente
    Cuando visualizar los ajustes y ingresar al expediente
    Entonces editar fecha ejecutoria "01022023"

    Dado seleccionar boton "Bitacora"
    Cuando seleccionar boton "Envio cobro"
    Entonces seleccionar boton "Ver expedientes devueltos"

    Dado ingresar filtro del expediente
    Cuando reenviar expediente a cobro coativo
    Entonces seleccionar boton "Salir"

    Dado ingresar usuario "coordinadorcc" y contrasena "123$123"
    Cuando se visualiza la pantalla de inicio
    Entonces seleccionar boton "Verificar"

    Dado seleccionar boton "Requisitos"
    Cuando ingresar al ultimo paginado
    Entonces ingresar al radicado

    Dado Datos personales "Datos Si" Documentos "Documentos Si"
    Cuando Fecha ejecutoria "Fecha Si" Multa "Multa Si"
    Entonces Elementos de la obligacion "obligacion Si" agregar motivo devolucion "Prueba"

    Dado seleccionar boton "Aceptar"
    Cuando seleccionar boton "Buscar expediente"
    Entonces agregar ano del expediente "2018" y numero expediente "10003"

    Dado seleccionar boton "Buscar"
    Cuando verificar que el estado haya cambiado a "C01-Expediente para reparto" y el area a "FIN"