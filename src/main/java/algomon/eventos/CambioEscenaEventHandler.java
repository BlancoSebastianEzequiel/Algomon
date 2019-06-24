package algomon.eventos;

import algomon.escenas.Escena;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CambioEscenaEventHandler implements EventHandler<ActionEvent> {
    private Escena<?> escena;

    public CambioEscenaEventHandler(Escena<?> unaEscena) {
        this.escena = unaEscena;
    }

    public void handle(ActionEvent event) {
        this.escena.disparar();
    }
}
