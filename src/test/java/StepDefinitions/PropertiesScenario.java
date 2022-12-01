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
        functions.switchToNewTab("http://dev.saludcapital.gov.co/SiiasPruebas2/inicio/login.aspx", "SIIAS");
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

    @Cuando("se visualiza la información del expediente")
    public void sevisualizainformaciónexpediente() throws IOException {
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
        functions.iClicInElement("quiernresiva");
        functions.iSelectContainsText("listadespegable", quiernresiva);
        functions.iClicInElement("Encabezado");
        functions.iClicInElement("quienfirma");
        functions.iSelectContainsText("listadespegable", quienfirma);
    }

    @Dado("descargar archivo")
    public void descargararchivo() throws Exception {
        functions.iLoadTheDOMInformation("Princioal.json");
        functions.iClicInElement("DescargarDocumento");
        functions.attachScreenShot();
        functions.iClicInElement("Salir");
    }

}
