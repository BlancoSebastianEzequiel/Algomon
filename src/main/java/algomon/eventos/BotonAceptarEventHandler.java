package algomon.eventos;

import algomon.escenas.Escena;
import algomon.escenas.EscenaElegirAlgomones;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class BotonAceptarEventHandler implements EventHandler<ActionEvent> {
    private EscenaElegirAlgomones escenaElegirAlgomones;

    public BotonAceptarEventHandler(EscenaElegirAlgomones unaEscenaElegirAlgomones) {
        this.escenaElegirAlgomones = unaEscenaElegirAlgomones;
        this.escenaElegirAlgomones.getBotonAceptar().setText("aceptar");
    }

    public void handle(ActionEvent event) {
        if (this.escenaElegirAlgomones.getEntrenador().getCantidadDePokemones() == 3) {
            Escena<?> unaEscena =  this.escenaElegirAlgomones.getEscenaSiguiente();
            unaEscena.inicializarEscena();
            unaEscena.disparar();
        }
    }
}
