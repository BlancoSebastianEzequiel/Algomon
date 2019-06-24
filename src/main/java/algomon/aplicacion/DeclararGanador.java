package algomon.aplicacion;

import algomon.entrenador.Entrenador;
import algomon.eventos.BotonSalirEventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DeclararGanador {
    private static void crearStageDeGanador(Stage stage, Entrenador unEntrenador) {
        stage.setTitle( unEntrenador.getNombre() + " es el ganador!!");
        stage.setHeight(600);
        stage.setWidth(800);

        StackPane layout = new StackPane();
        Scene escenaInstruciones = new Scene(layout);
        stage.setScene(escenaInstruciones);

        Musica.parar();
        new Musica("files/108-victory-vs-wild-pokemon-.wav");
        Musica.play();

        Imagen imagenDeFondo = new Imagen("file:files/finCombate.jpg", 800, 600, false, true);
        layout.setBackground(imagenDeFondo.getAsBackgroundImage());

        Label label = new Label();
        label.setText(unEntrenador.getNombre() + " HA GANADO!!!!");
        label.setTextFill(Color.BLACK);
        label.setFont(Font.font(20));
        label.setAlignment(Pos.CENTER);
        layout.getChildren().add(label);

        Button salir = new Button();
        BotonSalirEventHandler miBotonSalirEventHandler = new BotonSalirEventHandler(salir, stage);
        salir.setOnAction(miBotonSalirEventHandler);

        VBox segundaCaja = new VBox(10);
        segundaCaja.setAlignment(Pos.BOTTOM_LEFT);
        segundaCaja.getChildren().add(salir);
        layout.getChildren().add(segundaCaja);

        stage.show();
    }

    public static void start(Entrenador unEntrenador) {

        Stage stage = new Stage();
        crearStageDeGanador(stage, unEntrenador);
    }
}
