package algomon.eventos;

import algomon.entrenador.Entrenador;
import algomon.escenas.EscenaElegirJugadoresYAlgomones;
import algomon.escenas.PasajeALasPeleas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonJugarEventHandler implements EventHandler<ActionEvent> {
    private Button botonJugar;

    public BotonJugarEventHandler(Button botonJugar) {
        this.botonJugar = botonJugar;
        this.botonJugar.setText("Jugar");
    }

    public void handle(ActionEvent event) {
        EscenaElegirJugadoresYAlgomones unaEscenaElegirJugadoresYAlgomones = new EscenaElegirJugadoresYAlgomones();
        unaEscenaElegirJugadoresYAlgomones.inicializarEscena();

        Entrenador primerEntrenador = unaEscenaElegirJugadoresYAlgomones.getPrimerEntrenador();
        Entrenador segundoEntrenador = unaEscenaElegirJugadoresYAlgomones.getSegundoEntrenador();
        PasajeALasPeleas pasajeALasPeleas = new PasajeALasPeleas(primerEntrenador, segundoEntrenador);
        unaEscenaElegirJugadoresYAlgomones.setEscenaSiguiente(pasajeALasPeleas);

        unaEscenaElegirJugadoresYAlgomones.disparar();
    }
}
