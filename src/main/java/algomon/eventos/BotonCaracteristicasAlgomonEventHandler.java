package algomon.eventos;

import algomon.aplicacion.CaracteristicasDeAlgomon;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import algomon.pokemon.Pokemon;

public class BotonCaracteristicasAlgomonEventHandler implements EventHandler<ActionEvent> {
    private Button botonCaracteristicas;
    private Pokemon pokemon;

    public BotonCaracteristicasAlgomonEventHandler(Button unBotonCaracteristicas, Pokemon unPokemon) {
        this.botonCaracteristicas = unBotonCaracteristicas;
        this.botonCaracteristicas.setText("Caracteristicas");
        this.pokemon = unPokemon;
    }

    public void handle(ActionEvent event) {
        new CaracteristicasDeAlgomon(this.pokemon);
    }
}
