package algomon.aplicacion;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Instruciones {
    private static void crearStageDeInstruciones(Stage stage) {
        stage.setTitle("Instruciones");
        stage.setHeight(600);
        stage.setWidth(800);

        StackPane layout = new StackPane();
        Scene escenaInstruciones = new Scene(layout);
        Imagen imagenDeFondo = new Imagen("file:files/instrucciones.png", 800, 600, false, true);
        layout.setBackground(imagenDeFondo.getAsBackgroundImage());

        Label label = new Label();
        String instruciones = " ";
        label.setText(instruciones);
        layout.getChildren().add(label);

        VBox segundaCaja = new VBox(10);
        segundaCaja.setAlignment(Pos.BOTTOM_LEFT);
        layout.getChildren().add(segundaCaja);

        stage.setScene(escenaInstruciones);
        stage.show();
    }

    public static void start() {
        Stage stage = new Stage();
        crearStageDeInstruciones(stage);
    }
}
