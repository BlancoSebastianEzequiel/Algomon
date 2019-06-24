package algomon.eventos;

import algomon.entrenador.Entrenador;
import algomon.escenas.Escena;
import algomon.escenas.EscenaNombrarJugador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ElegirAlgomonesEventHandler implements EventHandler<ActionEvent> {
    private Button botonElegirAlgomones;
    private EscenaNombrarJugador escenaNombrarJugador;

    public ElegirAlgomonesEventHandler(EscenaNombrarJugador unaEscenaNombrarJugador) {
        this.botonElegirAlgomones = unaEscenaNombrarJugador.getBotonCrear();
        this.botonElegirAlgomones.setText("crear");
        this.escenaNombrarJugador = unaEscenaNombrarJugador;
    }

    public void handle(ActionEvent event) {
        String nombreEntrenador = this.escenaNombrarJugador.getTextoDeCampo();
        if (nombreEntrenador.isEmpty()) {
            this.escenaNombrarJugador.borrarTextoDeValidacion();
            this.escenaNombrarJugador.agragarTextoDeValidacion();
        } else {
            Entrenador unEntrenador = this.escenaNombrarJugador.getEntrenador();
            unEntrenador.setNombre(nombreEntrenador);
            Escena<?> unaEscena =  this.escenaNombrarJugador.getEscenaSiguiente();
            unaEscena.inicializarEscena();
            unaEscena.disparar();
        }
    }
}
