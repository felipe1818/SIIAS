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

    @Dado("ingresar usuario {string} y contrasena {string}")
    public void ingresarusuariocontrasena(String usuario, String contrasena) throws Exception {
        functions.switchToNewTab("http://192.168.1.199/SIIAS/inicio/login.aspx", "SIIAS");
        //functions.switchToNewTab("http://dev.saludcapital.gov.co/SiiasPruebas2/inicio/login.aspx", "SIIAS");
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



}
