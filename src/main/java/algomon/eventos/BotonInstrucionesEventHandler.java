package algomon.eventos;

import algomon.aplicacion.Instruciones;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonInstrucionesEventHandler implements EventHandler<ActionEvent> {
    private Button botonInstruciones;

    public BotonInstrucionesEventHandler( Button instruciones) {
        this.botonInstruciones = instruciones;
        this.botonInstruciones.setText("Instruciones");
    }

    public void handle(ActionEvent arg0) {
        Instruciones.start();
    }
}
