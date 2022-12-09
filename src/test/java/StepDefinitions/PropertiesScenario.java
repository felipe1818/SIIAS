package StepDefinitions;

import Functions.SeleniumFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.E;
import io.cucumber.java.es.Entonces;
import org.checkerframework.checker.units.qual.C;

import java.io.IOException;


public class PropertiesScenario {

    SeleniumFunctions functions = new SeleniumFunctions();


    @Dado("ingresar al ambiente")
    public void ingresarambiente(){
        functions.switchToNewTab("http://192.168.1.199/SIIAS/inicio/login.aspx", "SIIAS");
        //functions.switchToNewTab("http://dev.saludcapital.gov.co/SiiasPruebas2/inicio/login.aspx", "SIIAS");
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
        functions.iClicInElement("cerrarventana");
        functions.attachScreenShot();
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
        functions.scrollToElement("seleccionar");
        functions.iClicInElement("seleccionar");
        functions.attachScreenShot();
        functions.iWaitTime(5);

    }

    @Cuando("se visualiza la informacion del expediente")
    public void sevisualizainformacionexpediente() throws IOException {
        functions.attachScreenShot();
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
        functions.scrollToElement("ingreso acuerdo pago");
        functions.iClicInElement("ingreso acuerdo pago");
        functions.attachScreenShot();
    }

    @Cuando("agregar fehca inicial {string} y fecha final {string}")
    public void agregarfehcainicialfinal(String fechainicial, String fechafinal) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("fechainicial", fechainicial);
        functions.iSetElementWithText("fechafinal", fechafinal);
    }

    @Dado("descargar archivos reporte")
    public void descargararchivoreporte() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("descargar");
        functions.iWaitTime(5);
        functions.iClicInElement("Salir");
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
        functions.checkPartialTextElementPresent("", "");

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

}
