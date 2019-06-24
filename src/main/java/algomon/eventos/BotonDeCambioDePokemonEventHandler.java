package algomon.eventos;

import algomon.escenas.EscenaCambiarPokemon;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class BotonDeCambioDePokemonEventHandler implements EventHandler<ActionEvent> {
    private Button botonCambioDePokemon;
    // private EscenaBatalla suEscena;
    private EscenaCambiarPokemon cambioDePokemon;

    public BotonDeCambioDePokemonEventHandler(Button botonDeCambioDePokemon, EscenaCambiarPokemon cambioDePokemon) {
        this.botonCambioDePokemon = botonDeCambioDePokemon;
        this.botonCambioDePokemon.setText("Cambiar Pokemon");
        // this.suEscena = escenaBatalla;
        this.cambioDePokemon = cambioDePokemon;
    }

    public void handle(ActionEvent arg0) {
        this.cambioDePokemon.cambiarPokemon();
    }
}
