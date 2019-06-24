package algomon.aplicacion;

import java.net.URL;

import algomon.eventos.BotonInstrucionesEventHandler;
import algomon.eventos.BotonJugarEventHandler;
import algomon.eventos.BotonSalirEventHandler;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Algomon extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage unStage) throws Exception {

        new Escenario(unStage);
        this.inicializarStage(Escenario.stage);
    }

    private void inicializarStage(Stage stage) {
        stage.setTitle("algomon");
        stage.setHeight(600);
        stage.setWidth(800);

        StackPane layout = new StackPane();
        Scene escenaInicial = new Scene(layout);
        stage.setScene(escenaInicial);

        // ClassLoader classLoader = getClass().getClassLoader();
        // URL resource = classLoader.getResource("files/opening.mp3");
        // System.out.println("URL: "+ resource);
        // new Musica(resource.toString());
        // Musica.play();

        Imagen imagenDeFondo = new Imagen("file:files/inicio.jpg", 800, 600, false, true);
        layout.setBackground(imagenDeFondo.getAsBackgroundImage());

        Button botonJugar = new Button();
        BotonJugarEventHandler botonJugarEventHandler = new BotonJugarEventHandler(botonJugar);
        botonJugar.setOnAction(botonJugarEventHandler);

        Button instruciones = new Button();
        BotonInstrucionesEventHandler botonInstrucionesEventHandler = new BotonInstrucionesEventHandler(instruciones);
        instruciones.setOnAction(botonInstrucionesEventHandler);

        Button salir = new Button();
        BotonSalirEventHandler botonSalirEventHandler = new BotonSalirEventHandler(salir, stage);
        salir.setOnAction(botonSalirEventHandler);

        VBox  box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_LEFT);
        box.getChildren().add(botonJugar);
        box.getChildren().add(instruciones);
        box.getChildren().add(salir);
        layout.getChildren().add(box);

        stage.show();
    }
}
