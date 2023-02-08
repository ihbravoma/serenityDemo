package com.co.serenitydemo.stepdefinitions;

import com.co.serenitydemo.exceptions.ClienteNoCreado;
import com.co.serenitydemo.exceptions.ClienteNoEditado;
import com.co.serenitydemo.questions.ClienteCreado;
import com.co.serenitydemo.questions.ClienteEditado;
import com.co.serenitydemo.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.co.serenitydemo.exceptions.ClienteNoCreado.MENSAJE_CLIENTE_NO_CREADO_CORRECTAMENTE;
import static com.co.serenitydemo.exceptions.ClienteNoEditado.MENSAJE_CLIENTE_NO_EDITADO_CORRECTAMENTE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SerenityDemoStepDefinition {

    @Managed(driver = "chrome")
    WebDriver suNavegador;

    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que \"([^\"]*)\" ingresa a la aplicacion$")
    public void queIngresaALaAplicacion(String actor) {
        theActorCalled(actor).can(BrowseTheWeb.with(suNavegador));
        theActorInTheSpotlight().wasAbleTo(Open.url("https://serenity.is/demo/"));

    }

    @Cuando("^introduce las credenciales$")
    public void introduceLasCredenciales(List<List<String>> credenciales) {
        theActorInTheSpotlight().attemptsTo(IntroducirCredenciales.delAdministrador(credenciales));
    }

    @Y("^accede a la seccion de Clientes$")
    public void accedeALaSeccionDeClientes() {
        theActorInTheSpotlight().attemptsTo(AccederAlModuloCliente.deLaAplicacion());
    }

    @Y("^diligencia los datos con la siguiente informacion:$")
    public void diligenciaLosDatosConLaSiguienteInformacion(List<List<String>> datosCliente) {
        theActorInTheSpotlight().attemptsTo(CrearUnCliente.nuevo(datosCliente));
    }

    @Entonces("^se debe visualizar la creacion del cliente$")
    public void seDebeVisualizarLaCreacionDelCliente() {
        theActorInTheSpotlight()
                .should(seeThat(ClienteCreado.exitosamente())
                        .orComplainWith(ClienteNoCreado.class, MENSAJE_CLIENTE_NO_CREADO_CORRECTAMENTE));
    }

    @Y("^selecciona el cliente \"([^\"]*)\"$")
    public void seleccionaElCliente(String clienteID) {
        theActorInTheSpotlight().attemptsTo(SeleccionarCliente.paraEditar(clienteID));
    }

    @Y("^edita la siguiente informacion:$")
    public void editaLaSiguienteInformacion(List<List<String>> datosCliente) {
        theActorInTheSpotlight().attemptsTo(EditarCliente.informacion(datosCliente));
    }

    @Entonces("^se debe visualizar los cambios realizados$")
    public void seDebeVisualizarLosCambiosRealizados() {
        theActorInTheSpotlight()
                .should(seeThat(ClienteEditado.exitosamente())
                        .orComplainWith(ClienteNoEditado.class, MENSAJE_CLIENTE_NO_EDITADO_CORRECTAMENTE));
    }

}
