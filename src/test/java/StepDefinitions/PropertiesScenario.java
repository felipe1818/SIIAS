package StepDefinitions;

import Functions.SeleniumFunctions;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


public class PropertiesScenario {

    SeleniumFunctions functions = new SeleniumFunctions();


    @Dado("ingresar al ambiente")
    public void ingresarambiente(){
        //functions.switchToNewTab("http://192.168.1.199/SIIAS/inicio/login.aspx", "SIIAS");
        functions.switchToNewTab("http://dev.saludcapital.gov.co/SiiasPruebas2/inicio/login.aspx", "SIIAS");
    }

    @Dado("ingresar usuario {string} y contrasena {string}")
    public void ingresarusuariocontrasena(String usuario, String contrasena) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("usuario", usuario);
        functions.iSetElementWithText("contrasena", contrasena);
        functions.attachScreenShot();
        functions.iClicInElement("iniciarsesion");
        functions.attachScreenShot();
    }

    @Cuando("se visualiza la pantalla de inicio")
    public void visualizapantallainicio() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try{
            functions.iClicInElement("cerrarventana");
            functions.attachScreenShot();
        }catch (Exception e){
            System.out.print("No se encontro pestaña");
        }
    }

    @Entonces("seleccionar boton {string}")
    public void seleccionarboton(String boton) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iWaitTime(2);
        functions.scrollToElement(boton);
        functions.iClicInElement(boton);
        functions.attachScreenShot();
    }

    @Dado("agregar ano del expediente {string} y numero expediente {string}")
    public void agregaranoynumeroexpediente(String anoExpedien, String numeroExpedien) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("anoExpedien");
        functions.iSelectContainsText("listadespegable", anoExpedien);
        functions.iSetElementWithText("numeroExpedien", numeroExpedien);

        functions.iSaveTextOfElementInScenario("AnoExp", "anoExpedien");
        functions.iSaveTextOfElementInScenario("Expediente", "numeroExpedien");
        functions.attachScreenShot();

    }

    @Cuando("agregar estado expediente {string} y estado cobro coactivo {string}")
    public void agregarestadocobrocoactivo(String estadoExpedi, String estadoCobroCo) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("estadoExpedi");
        functions.iSelectContainsText("listadespegable", estadoExpedi);
        functions.iClicInElement("estadoCobroCo");
        functions.iSelectContainsText("listadespegable", estadoCobroCo);
        functions.attachScreenShot();
    }

    @Cuando("agregar area origina proceso {string}")
    public void agregarareaorignaproceso(String areaproceso) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("areaproceso");
        functions.iSelectContainsText("listadespegable", areaproceso);
    }

    @Entonces("seleccionar expediente")
    public void seleccionarexpediente() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try {
            functions.iWaitTime(5);
            functions.scrollToElement("seleccionarexpe");
            functions.iClicInElement("seleccionarexpe");
            functions.attachScreenShot();
        }catch (Exception e){
            functions.iClicInElement("Salir");
        }


    }

    @Cuando("se visualiza la informacion del expediente")
    public void sevisualizainformacionexpediente() throws Exception {
        try {
            functions.attachScreenShot();
        }catch (Exception e){
            functions.iClicInElement("Salir");
        }
    }

    @Dado("se visualiza pantalla generar plantilla")
    public void sevisualizapantallagenerar() throws IOException {
        functions.attachScreenShot();
    }

    @Cuando("agregar tipo de plantilla {string} y tipo de documento {string}")
    public void agregartipodocumentotipoplantilla(String tipoPlantilla, String tipoDocumento) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("tipoPlantilla");
        functions.iSelectContainsText("listadespegable", tipoPlantilla);
        functions.iWaitTime(5);
        functions.iClicInElement("tipoDocumento");
        functions.iSelectContainsText("listadespegable", tipoDocumento);
        functions.attachScreenShot();
    }

    @Entonces("agregar numero de folios {string}")
    public void agregarnumerofolios(String numeroFolio) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("numeroFolio", numeroFolio);
    }

    @Dado("agregar ano expediente {string} y numero del expedente {string}")
    public void agregaranonumeroexpedoente(String anoexpedeinet, String numeroexpeti) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("anoexpedeinet", anoexpedeinet);
        functions.iSetElementWithText("numeroexpeti", numeroexpeti);
        functions.attachScreenShot();
    }

    @Cuando("seleccionar direccion area origen {string}")
    public void seleccionardireccionareaorigen(String direccionArea) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("direccionArea");
        functions.iSelectContainsText("listadespegable", direccionArea);
        functions.attachScreenShot();
    }

    @Entonces("agregar quien revisa {string} quien firma {string}")
    public void agregarquienresivaquienfirma(String quiernresiva, String quienfirma) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iWaitTime(1);
        functions.scrollToElement("quiernresiva");
        functions.iClicInElement("quiernresiva");
        functions.iSelectContainsText("listadespegables", quiernresiva);
        functions.scrollToElement("Encabezado");
        functions.iClicInElement("Encabezado");
        functions.scrollToElement("quienfirma");
        functions.iClicInElement("quienfirma");
        functions.iSelectContainsText("listadespegable", quienfirma);
    }

    @Dado("descargar archivo")
    public void descargararchivo() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("DescargarDocumento");
        functions.iClicInElement("DescargarDocumento");
        functions.attachScreenShot();
        functions.iClicInElement("Salir");
    }

    @Dado("seleccionar el reporte Listado general")
    public void seleccionarreporte() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("reporte");
        functions.iClicInElement("reporte");
        functions.attachScreenShot();
    }

    @Dado("seleccionar boton Generar reporte")
    public void seleccionarbotongenerar() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("Generar reporte");
        functions.iClicInElement("Generar reporte");
        //functions.iWaitTime(40);
        functions.attachScreenShot();
    }@Dado("seleccionar boton Descargar reporte")
    public void seleccionarbotongenera() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("Descargar reporte");
        functions.iClicInElement("Descargar reporte");
        functions.iWaitTime(2);
        functions.attachScreenShot();
        functions.iClicInElement("Salir");
    }

    @Dado("seleccionar el reporte ingreso acuerdo pago")
    public void seleccionarreporteingresopago() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try{
            functions.scrollToElement("ingreso acuerdo pago");
            functions.iClicInElement("ingreso acuerdo pago");
            functions.attachScreenShot();
        }catch (Exception e){
            functions.scrollToElement("Salir");
            functions.iClicInElement("Salir");
        }
    }

    @Cuando("agregar fehca inicial {string} y fecha final {string}")
    public void agregarfehcainicialfinal(String fechainicial, String fechafinal) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try{
            functions.iSetElementWithText("fechainicial", fechainicial);
            functions.iSetElementWithText("fechafinal", fechafinal);
            functions.iClicInElement("Visualizar reporte");
            functions.iWaitTime(10);
        }catch (Exception e){
            functions.scrollToElement("Salir");
            functions.iClicInElement("Salir");
        }
    }

    @Dado("descargar archivos reporte")
    public void descargararchivoreporte() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try {
            functions.iClicInElement("descargar");
            functions.iWaitTime(5);
            functions.iClicInElement("Salir");
        }catch (Exception e){
            functions.scrollToElement("Salir");
            functions.iClicInElement("Salir");
        }
    }

    @Dado("verificar numero expediente y ano del expediente")
    public void verificarnumeroexpedienteanoexpediente() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("nexpediete");
        functions.checkIfElementIsPresent("(//span[contains(.,'A')])[1]");
        functions.checkIfElementIsPresent("(//span[contains(.,'expediente')])[1]");
        functions.attachScreenShot();
        //functions.iSaveTextOfElementInScenario("nexpediete", "elemento1");
        //functions.iSetElementWithKeyValue("elemento1", "nexpediete");

    }

    @Cuando("verificar valor capital y valor interes")
    public void verificarvalorcapitalvalorinteres() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("valorcapital");
        functions.checkIfElementIsPresent("//span[contains(.,'Valor capital')]");
        functions.checkIfElementIsPresent("//span[contains(.,'Valor inter')]");
        functions.iSaveTextOfElementInScenario("Vcapital", "valorcapital");
    }

    @Entonces("ingresar fecha de pago {string} y valor total pago")
    public void ingresarfechapagovalorpago(String fechapago) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try {
            functions.iClicInElement("fechapago");
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSetElementWithText("fechapago", fechapago);
            functions.iSetElementWithKeyValue("valortotal", "Vcapital");
            functions.iWaitTime(5);
            functions.attachScreenShot();
        }catch (Exception e){
            functions.iClicInElement("Salir");
        }
    }

    @Entonces("agregar ano y numero expediente")
    public void agregaranonumeroexpediente() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("ano");
        functions.iSetElementWithKeyValue("ano", "anoexp");
        functions.iClicInElement("numeroexpediente");
        functions.iSetElementWithKeyValue("numeroexpediente", "#exp");
        functions.attachScreenShot();
    }

    @Dado("validar alerta")
    public void validaralerta() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.checkIfElementIsPresent("//div//span[contains(.,'Se ha')]");
        functions.attachScreenShot();
    }

    @Entonces("visualizar detalle devolucion")
    public void visualizardetalledevolucion() throws Exception {
        String anoexpediente = functions.ScenaryData.get("anoexp");
        String numeroExpediente = functions.ScenaryData.get("#exp");
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToHorizontal("detalledevolucion");
        functions.iClicInElement("detalledevolucion");
        functions.checkIfElementIsPresent("//input[@value='"+anoexpediente+"']");
        functions.checkIfElementIsPresent("//input[@value='"+numeroExpediente+"']");
        functions.attachScreenShot();
    }

    @Dado("agregamos fecha inicial {string} y fecha final {string}")
    public void agregamosfehcainicialfechafinal(String fechainicial, String fechafinal) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("fechainicia");
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSetElementWithText("fechainicia", fechainicial);
        functions.iClicInElement("fechafina");
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSetElementWithText("fechafina", fechafinal);
        functions.attachScreenShot();
    }

    @Cuando("seleccionamos expediente a visualizar")
    public void seleccionamosexpedientevisualizar() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("expediente");
        functions.attachScreenShot();
    }

    @Entonces("volvemos al reporte")
    public void volvemosexpedientecerramossesion() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("volverreporte");
    }

    @Dado("seleccionar radicado {string}")
    public void seleccionarradicado(String numero) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("//a[@href=\"javascript:__doPostBack('ctl00$formularios$gdvRadicadoExpediente','Select$"+numero+"')\"]");
        functions.attachScreenShot();
    }

    @Cuando("seleccionar expediente {string}")
    public void seleccionarexpediente(String numero) throws Exception {
        functions.iClicInElement("//a[@href=\"javascript:__doPostBack('ctl00$formularios$gdvExpedientes','Select$"+numero+"')\"]");
        functions.attachScreenShot();
    }

    @Cuando("visualizar pantalla requisitos")
    public void visualizarpantallarequisito() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.attachScreenShot();
    }

    @Dado("Datos personales {string} Documentos {string}")
    public void datospersonalesdocumentos(String datos, String documentos) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement(datos);
        functions.iClicInElement(datos);
        functions.iClicInElement(documentos);
    }

    @Cuando("Fecha ejecutoria {string} Multa {string}")
    public void fechaejecutoriamulta(String ejecutoria, String multa) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement(ejecutoria);
        functions.iClicInElement(multa);
    }

    @Entonces("Elementos de la obligacion {string} agregar motivo devolucion {string}")
    public void elementoobligatorioagregarmotivo(String elementoobligacion, String motivoDevolucion) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement(elementoobligacion);
        functions.iSetElementWithText("motivoDevolucion", motivoDevolucion);
        functions.attachScreenShot();
    }

    @Entonces("seleccionar expediente y revisar detalle devolucion")
    public void seleccionarexpedientedevolverexpediente() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("selctdevolucion");
        functions.iSaveTextOfElementInScenario("anoexp", "//td[4]");
        functions.iSaveTextOfElementInScenario("#exp", "//td[3]");
        functions.scrollToHorizontal("detalledevolucion");
        functions.iClicInElement("detalledevolucion");
    }

    @Cuando("visualiza expediente")
    public void visualizexpediente() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.attachScreenShot();
        functions.iClicInElement("Cerrar");
    }

    @Dado("agregar numero CIB y Numero consignacion {string}")
    public void agregarnumeroCIBnumeroconsignacion(String numero) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try{
            functions.iSetElementWithText("CIB", numero);
            functions.iSetElementWithText("consignacion", numero);
            functions.attachScreenShot();
        }catch (Exception e){
            functions.attachScreenShot();
            functions.iClicInElement("Salir");
        }
    }

    @Cuando("ingresar fecha CIB {string}")
    public void ingresarfehcaCIB(String fecha) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try{
            functions.iClicInElement("fechaCIB");
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSetElementWithText("fechaCIB", fecha);
        }catch (Exception e){
            functions.iClicInElement("Salir");
        }
    }

    @Entonces("seleccionar boton Calcular valores")
    public void seleccionarbotoncalcularvalores() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("Calcular valores");
        functions.iWaitTime(5);
    }

    @Cuando("Agregamos numero de acta {string}")
    public void agregamosnumeroacta(String numeroacta) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("numeroacta", numeroacta);
    }

    @Entonces("seleccionamos acta")
    public void seleccionamosacta() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("actaselect");
        functions.iWaitTime(2);
    }

    @Dado("visualizar el archivo")
    public void visualizararchivo() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("verarchivo");
        functions.iWaitTime(5);
    }

    @Cuando("visualizar archivo cargado")
    public void visualizararchivocargado() throws IOException, InterruptedException {
        functions.attachScreenShot();
        functions.iWaitTime(5);
        functions.switchToTab("SIIAS");

    }

    @Dado("seleccionamos coincidencia")
    public void selecionarcoincidencia() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("coincidencia");
        functions.iWaitTime(2);
    }

    @Entonces("Validar que se haya creado el expediente")
    public void validarquesehayacreado() throws Exception {
        functions.attachScreenShot();
        functions.iSaveTextOfElementInScenario("Numeroinvestigacion", "//input[@id='ctl00_formularios_txtNumeroExpedienteID']");
        functions.iSaveTextOfElementInScenario("Anoinvestigacion", "//select/option[@selected='selected']");
    }

    @Cuando("buscar expediente creado")
    public void buscarexpedientecreado() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithKeyValue("anoExpedien", "Anoinvestigacion");
        functions.iSetElementWithKeyValue("numeroExpedien", "Numeroinvestigacion");
    }

    @Entonces("seleccionar acta asociada al expediente")
    public void seleccionaractaasociadaexpediente() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("seleccionaracta");
    }

    @Dado("desvincular acta")
    public void desvincularacta() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("desvincular");
        functions.AcceptAlert();
        functions.iSaveTextOfElementInScenario("numeroacta", "actanumero");
    }

    @Entonces("buscar numero de acta")
    public void buscarnumeroacta() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithKeyValue("numeroacta", "numeroacta");
        functions.iClicInElement("Buscar acta");
    }

    @Dado("validar que no se visualize el acta")
    public void valdiarnovisualizeacta() throws Exception {
        try{
            functions.iLoadTheDOMInformation("Principal.json");
            functions.scrollToElement("actaselect");
            functions.iWaitTime(2);
            functions.attachScreenShot();
        }catch (Exception e){
            functions.iClicInElement("Salir");
        }
    }

    @Dado("seleccionar acto administrativo")
    public void seleccioanractoadminstrativo() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try{
            functions.scrollToElement("seleccionarActoadmin");
            functions.iClicInElement("seleccionarActoadmin");
        }catch (Exception e){
            //Crear actas admiciones
            functions.scrollToElement("BtnAgregar");
            functions.iClicInElement("BtnAgregar");
            //agregar tipo acta
            functions.scrollToElement("TipoActo");
            functions.iClicInElement("TipoActo");
            functions.iSelectContainsText("listadespegable", "fallo");
            //seleccionar sancion
            functions.iClicInElement("Sancionpecuniaria");
            //agregar fecha acta
            functions.scrollToElement("FechaActo");
            functions.iClicInElement("FechaActo");
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSendKeyLeftToPerform();
            functions.iSetElementWithText("FechaActo", "01022023");
            //agregar numero acta
            functions.scrollToElement("NumeroActo");
            functions.iSetElementWithText("NumeroActo", "11232");
            //agregar abogado
            functions.scrollToElement("AbogadoQuienGenera");
            functions.iClicInElement("AbogadoQuienGenera");
            functions.iSelectContainsText("listadespegable", "Alba");
            //Agregar observaciones
            functions.scrollToElement("descripcion");
            functions.iSetElementWithKeyValue("descripcion", "Prueba");
            //Firmas

            functions.scrollToElement("QuienRevisa");
            functions.iClicInElement("QuienRevisa");
            functions.iSelectContainsText("listadespegable", "Ardila");

            functions.scrollToElement("QuienAprueba");
            functions.iClicInElement("QuienAprueba");
            functions.iSelectContainsText("listadespegable", "Lozano");

            functions.scrollToElement("QuienFirma");
            functions.iClicInElement("QuienFirma");
            functions.iSelectContainsText("listadespegable", "Lozano");

            functions.scrollToElement("seleccionarinvestigado");
            functions.iClicInElement("seleccionarinvestigado");

            functions.scrollToElement("ValorMulta");
            functions.iSetElementWithText("ValorMulta", "500000");
            functions.scrollToElement("BtnGuardar");
            functions.iClicInElement("BtnGuardar");

            functions.iWaitTime(5);
            functions.attachScreenShot();

            functions.scrollToElement("BtnVolver");
            functions.iClicInElement("BtnVolver");

            functions.scrollToElement("seleccionarActoadmin");
            functions.iClicInElement("seleccionarActoadmin");
        }
    }

    @Cuando("seleccionar recurso")
    public void seleccioanrrecurso() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        try{
            functions.scrollToElement("seleccionarecurso");
            functions.iClicInElement("seleccionarecurso");
            functions.iWaitTime(2);
            functions.iSaveTextOfElementInScenario("TipoRecurso", "TipoRecursos");
            String TipoRecurso = functions.ScenaryData.get("TipoRecurso");

            if (TipoRecurso.equals("Queja")){
                functions.scrollToElement("TipoRecursos");
                functions.iClicInElement("TipoRecursos");
                functions.iSelectContainsText("listadespegable", "Reposici");
                functions.iWaitTime(5);
                functions.scrollToElement("BtnEliminar");
                functions.iClicInElement("BtnEliminar");
                functions.AcceptAlert();
                functions.iWaitTime(5);
                functions.scrollToElement("BtnVolverExpediente");
                functions.iClicInElement("BtnVolverExpediente");
            }else{
                functions.scrollToElement("BtnVolverExpediente");
                functions.iClicInElement("BtnVolverExpediente");
            }
        }catch (Exception e){
            //functions.iClicInElement("SeleccionarSancionado");
            //functions.scrollToElement("TipoRecursos");
            //functions.iClicInElement("TipoRecursos");
            //functions.iSelectContainsText("listadespegable", "Reposici");

            //functions.iSetElementWithText("NumeroRadicado", "112233");

            //functions.scrollToElement("FechaRadicado");
            //functions.iClicInElement("FechaRadicado");
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSendKeyLeftToPerform();
            //functions.iSetElementWithText("FechaRadicado", "01022023");

            //functions.scrollToElement("BtnAgregar");
            //functions.iClicInElement("BtnAgregar");
            functions.iWaitTime(2);
            functions.scrollToElement("BtnVolverExpediente");
            functions.iClicInElement("BtnVolverExpediente");


        }
    }

    @Cuando("cargar archivo pdf")
    public void cargararchivopdf() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.SaveInScenarioFile("documento", "pdf");
        functions.iSetElementWithKeyValue("CargarArchivo", "documento");

        functions.scrollToElement("TipoArchivo");
        functions.iClicInElement("TipoArchivo");
        functions.iSelectContainsText("listadespegable", "Para Cobro Coactivo");

        functions.scrollToElement("DescripcionArchivo");
        functions.iSetElementWithText("DescripcionArchivo", "Prueba");

        functions.scrollToElement("BtnGuardar");
        functions.iClicInElement("BtnGuardar");

        functions.scrollToElement("BtnVolver");
        functions.iClicInElement("BtnVolver");
    }

    @Entonces("validar que el archivo se haya creado")
    public void validararchivocreado() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("VerArchivo");
        functions.iClicInElement("VerArchivo");
        functions.checkIfElementIsPresent("//th[contains(.,'Tipo archivo')]/../../tr/td[contains(.,'Para Cobro Coactivo')]");
        functions.scrollToElement("BtnVolver");
        functions.iClicInElement("BtnVolver");

    }

    @Dado("Generamos fecha ejecutoria {string}")
    public void generamosfechaejecutoria(String fechaejecutoria) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("FechaEjecutoria");
        functions.iClicInElement("FechaEjecutoria");
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSetElementWithText("FechaEjecutoria", fechaejecutoria);

        functions.iClicInElement("Calcular");
        functions.iWaitTime(5);
        functions.scrollToElement("AcualizarInvesigcion");
        functions.iClicInElement("AcualizarInvesigcion");
        functions.iWaitTime(5);
    }
    @Dado("Validar que el expediente este pendiente para ser enviado a cobro coativo")
    public void validarexpedientependienteenviadocabrocoativo() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("EnviarExpediente");
        String Expediente = functions.ScenaryData.get("Expediente");
        String AnoExp = functions.ScenaryData.get("AnoExp");
        functions.iSelectContainsKey("//th[contains(.,'# Exp.')]/../../tr/td", "Expediente");
    }

    @Dado("verificar que el estado haya cambiado a {string}")
    public void verifcarestadoexpedinete(String estadoexpedente) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.checkIfElementIsPresent("(//td[contains(.,'"+estadoexpedente+"')])[2]");
    }

    @Cuando("verificar que el estado haya cambiado a {string} y el area a {string}")
    public void verificarestadocambiadoestadoyarea(String EstadoExpediente, String AreaResponsable) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.checkIfElementIsPresent("//td[contains(.,'"+EstadoExpediente+"')]/../td[contains(.,'"+AreaResponsable+"')]");
    }

    @Cuando("obtenemos numero radicado")
    public void obtenrenumeroradicado() throws Exception {
        functions.iSaveTextOfElementInScenario("radicado", "//td");
    }

    @Entonces("ingresar al ultimo paginado")
    public void ingresarultimopagiando() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSaveTextOfElementInScenario("paginado", "//tr/td/table");
        try{
            for(int i = 0; i < 100; i++){
                functions.iClicInElement("//a[contains(.,'"+i+"')]");
            }
        }catch (Exception e){
            System.out.print("Ingresamos al ultimo paginado");
            try{
                for(int i = 1; i <= 10; i++){
                    functions.iSaveTextOfElementInScenario("NumeroRadicado","(//tr/td[contains(.,'VSP')]/../td[2])["+i+"]");
                }
            }catch (Exception I){
                String NumeroRadicado = functions.ScenaryData.get("NumeroRadicado");
                System.out.print(NumeroRadicado);
            }
        }
        
    }

    @Dado("ingresar al radicado")
    public void ingresarradicado() throws Exception {
        String NumeroRadicado = functions.ScenaryData.get("NumeroRadicado");
        String Radicado = functions.ScenaryData.get("radicado");
        String Expediente = functions.ScenaryData.get("Expediente");
        try{
            functions.scrollToElement("//td[contains(.,'"+Radicado+"')]/../td/a");
            functions.iClicInElement("//td[contains(.,'"+Radicado+"')]/../td/a");
            functions.scrollToElement("//td[contains(.,'"+Expediente+"')]/../td/a");
            functions.iClicInElement("//td[contains(.,'"+Expediente+"')]/../td/a");

        }catch (Exception e){
            functions.scrollToElement("//td[contains(.,'"+NumeroRadicado+"')]/../td/a");
            functions.iClicInElement("//td[contains(.,'"+NumeroRadicado+"')]/../td/a");
            functions.scrollToElement("//td[contains(.,'"+Expediente+"')]/../td/a");
            functions.iClicInElement("//td[contains(.,'"+Expediente+"')]/../td/a");
        }
    }

    @Cuando("devolver expediente a salud publica")
    public void devolverexpedeintesaludpublica() throws Exception {
        String Radicado = functions.ScenaryData.get("radicado");
        String Expediente = functions.ScenaryData.get("Expediente");
        functions.iClicInElement("//td[contains(.,'"+Radicado+"')]/../td[contains(.,'"+Expediente+"')]/../td/input");
        functions.iWaitTime(2);
        functions.iClicInElement("Devolver expediente");
        functions.iClicInElement("//button[contains(.,'Cerrar')]");
    }

    @Entonces("ingresar filtro del expediente")
    public void ingresarfiltroexpediente() throws Exception {
        functions.iSetElementWithKeyValue("ano", "AnoExp");
        functions.iSetElementWithKeyValue("numeroexpediente", "Expediente");
        functions.iClicInElement("Buscar");

    }

    @Dado("visualizar los ajustes y ingresar al expediente")
    public void visualizarajustesingresarexpediente() throws Exception {
        String Radicado = functions.ScenaryData.get("radicado");
        String Expediente = functions.ScenaryData.get("Expediente");
        functions.iClicInElement("//td[contains(.,'"+Radicado+"')]/../td[contains(.,'"+Expediente+"')]/../td/a[contains(.,'Detalle')]");
        functions.iWaitTime(2);
        functions.attachScreenShot();
        functions.iClicInElement("Cerrar");
        functions.iClicInElement("//td[contains(.,'"+Radicado+"')]/../td[contains(.,'"+Expediente+"')]/../td/a[contains(.,'Ver Expediente')]");
        functions.iWaitTime(2);
    }

    @Dado("editar fecha ejecutoria {string}")
    public void editarfechaejecutoria(String fechaejecutoria) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("EditarFechaEjecutoria");
        functions.iWaitTime(2);
        functions.scrollToElement("FechaEjecutoria");
        functions.iClicInElement("FechaEjecutoria");
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSendKeyLeftToPerform();
        functions.iSetElementWithText("FechaEjecutoria", fechaejecutoria);
        functions.iClicInElement("Calcular");
        functions.iWaitTime(5);
        functions.iClicInElement("GuardarFechaEjecutoria");
    }

    @Entonces("reenviar expediente a cobro coativo")
    public void reenviarexpedeintecobrocoativo() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        String Radicado = functions.ScenaryData.get("radicado");
        String Expediente = functions.ScenaryData.get("Expediente");
        functions.iClicInElement("//td[contains(.,'"+Radicado+"')]/../td[contains(.,'"+Expediente+"')]/../td/input");
        functions.iClicInElement("enviar Expediente");
    }
}
