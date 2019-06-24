package algomon.eventos;

import algomon.escenas.EscenaDeObjetos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonDeUsarObjetoEventHandler implements EventHandler<ActionEvent> {
    private Button botonUsarObjeto;
    private EscenaDeObjetos escenaDeObjetos;

    public BotonDeUsarObjetoEventHandler(Button botonDeUsarObjeto, EscenaDeObjetos escenaDeObjetos) {
        this.botonUsarObjeto = botonDeUsarObjeto;
        this.botonUsarObjeto.setText("Objetos");
        this.escenaDeObjetos = escenaDeObjetos;
    }

    public void handle(ActionEvent event) {
        this.escenaDeObjetos.usarObjetos();
    }
}
