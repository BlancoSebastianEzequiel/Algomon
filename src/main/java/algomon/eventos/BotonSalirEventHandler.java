package algomon.eventos;

import algomon.aplicacion.Escenario;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BotonSalirEventHandler implements EventHandler<ActionEvent> {
    private Button salir;
    private Stage stage;

    public BotonSalirEventHandler(Button salir, Stage stage) {
        this.salir = salir;
        this.salir.setText("Salir");
        this.stage = stage;
    }

    public void handle(ActionEvent arg0) {
        this.stage.close();
        Escenario.stage.close();
    }
}
