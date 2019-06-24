package algomon.eventos;

import algomon.entrenador.Entrenador;
import algomon.escenas.EscenaBatalla;
import algomon.excepciones.PokemonSeDebilitoException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import algomon.juego.Juego;
import algomon.pokemon.Pokemon;

public class ElegirEventHandler implements EventHandler<ActionEvent> {
    private Button botonElegir;
    private Entrenador entrenador;
    private Pokemon pokemon;
    private EscenaBatalla escenaBatalla;
    private VBox caja;
    private Label adevertencia;
    private Stage stage;

    public ElegirEventHandler(
            Button elegir, Entrenador entrenador, Pokemon pokemon, VBox cajaVertical, EscenaBatalla escenaBatalla, Stage stage) {
        this.botonElegir = elegir;
        this.entrenador = entrenador;
        this.pokemon = pokemon;
        this.caja = cajaVertical;
        this.escenaBatalla = escenaBatalla;
        this.stage = stage;
        this.botonElegir.setText("Elegir");
        this.adevertencia = new Label();
        this.adevertencia.setText("Ese Algomon Esta Incapasitado, por favor elija otro");
    }

    public void handle(ActionEvent arg0) {
        if (pokemon != entrenador.getPokemonActual()) {
            try {
                Juego.cambiarPokemon(this.pokemon.getNombre());
                this.escenaBatalla.getEscenaSiguiente().disparar();
                Juego.cambioDeTurno();
                this.stage.close();
            } catch (PokemonSeDebilitoException e) {
                this.caja.getChildren().add(this.adevertencia);
                e.printStackTrace();
            }
        }
    }
}
