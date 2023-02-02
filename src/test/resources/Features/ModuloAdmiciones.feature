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

    Dado Generamos fecha ejecutoria
    Cuando seleccionar boton "Bitacora"
    Entonces seleccionar boton "Envio cobro"

    Dado Validar que el expediente este pendiente para ser enviado a cobro coativo

  @AdmicionesFase2
  Escenario: Los usuario envian expediente

    Dado ingresar al ambiente
    Cuando ingresar usuario "coordinadorsp" y contrasena "321$321"
    Entonces se visualiza la pantalla de inicio

