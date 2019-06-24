package algomon.aplicacion;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import algomon.pokemon.Pokemon;

public class CaracteristicasDeAlgomon {
    private Pokemon pokemon;

    public CaracteristicasDeAlgomon(Pokemon unPokemon) {
        this.pokemon = unPokemon;
        Stage stage = new Stage();
        stage.setTitle("Caracteristicas de " + this.pokemon.getNombre());
        stage.setHeight(634);
        stage.setWidth(900);

        StackPane layout = new StackPane();
        Scene escenaCaracteristicasDeAlgomon = new Scene(layout);
        stage.setScene(escenaCaracteristicasDeAlgomon);
        Imagen imagenDeFondo = new Imagen("file:files/" + this.pokemon.getNombre() + "caracteristicas.jpg", 900, 634, false, true);
        layout.setBackground(imagenDeFondo.getAsBackgroundImage());
        stage.show();
    }
}
