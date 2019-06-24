package algomon.escenas;

import java.util.LinkedList;

import algomon.aplicacion.Imagen;
import algomon.entrenador.Entrenador;
import algomon.eventos.ElegirEventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import algomon.pokemon.Pokemon;

public class EscenaCambiarPokemon {
    private Stage stage;
    private Entrenador entrenador;
    private EscenaBatalla escenaBatalla;

    public EscenaCambiarPokemon(Entrenador entrenador, EscenaBatalla escenaBatalla) {
        this.stage = new Stage();
        this.entrenador = entrenador;
        this.escenaBatalla = escenaBatalla;
        this.inicializar();
    }

    private void inicializar() {
        this.stage.setHeight(200);
        this.stage.setWidth(500);
        StackPane layout = new StackPane();
        Scene escena = new Scene(layout);

        VBox cajaV1 = new VBox(5);
        HBox cajaH = new HBox(5);

        LinkedList<Pokemon> pokemons = this.entrenador.getPokemons();
        cajaH.setAlignment(Pos.CENTER);

        for (Pokemon pokemon: pokemons) {
            VBox cajaV2 = new VBox(5);
            Imagen imagenPokemon = new Imagen("file:files/" + pokemon.getNombre() + ".gif", 100, 100, false, true);
            Button elegir = new Button();
            ElegirEventHandler botonElegirEventHandler = new
                    ElegirEventHandler(elegir, this.entrenador, pokemon, cajaV1, this.escenaBatalla, this.stage);
            elegir.setOnAction(botonElegirEventHandler);
            cajaV2.getChildren().addAll(imagenPokemon.getImagenView(), elegir);
            cajaH.getChildren().add(cajaV2);
        }

        cajaV1.setAlignment(Pos.CENTER);
        cajaV1.getChildren().add(cajaH);
        layout.getChildren().add(cajaV1);
        this.stage.setScene(escena);
    }

    public void cambiarPokemon() {
        this.stage.show();
    }
}
