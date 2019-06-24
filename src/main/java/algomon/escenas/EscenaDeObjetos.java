package algomon.escenas;

import java.util.LinkedList;

import algomon.aplicacion.Imagen;
import algomon.elemento.Elemento;
import algomon.entrenador.Entrenador;
import algomon.eventos.UsarElementoEventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EscenaDeObjetos {
    private Stage stage;
    private Entrenador entrenador;
    private EscenaBatalla escenaBatalla;

    public EscenaDeObjetos(Entrenador entrenador, EscenaBatalla escenaBatalla) {
        this.stage = new Stage();
        this.entrenador = entrenador;
        this.escenaBatalla = escenaBatalla;
        this.inicializar();
    }

    private void inicializar() {
        this.stage.setWidth(700);
        this.stage.setHeight(200);

        StackPane layout = new StackPane();
        Scene escena = new Scene(layout);

        VBox cajaV1 = new VBox(5);
        HBox cajaH = new HBox(5);

        cajaH.setAlignment(Pos.CENTER);

        LinkedList<Elemento> elementos = this.entrenador.getElementos();

        for (Elemento elemento: elementos) {
            VBox cajaV2 = new VBox(5);
            Imagen imagenElemento = new Imagen("file:files/" + elemento.getNombre() + ".jpg", 100, 100, false, true);
            Button usarElemento = new Button();
            UsarElementoEventHandler usarElementoEventHandler = new
                    UsarElementoEventHandler(usarElemento, elemento, this.escenaBatalla, this.stage);
            usarElemento.setOnAction(usarElementoEventHandler);
            cajaV2.getChildren().addAll(imagenElemento.getImagenView(), usarElemento);
            cajaH.getChildren().add(cajaV2);
        }

        cajaV1.setAlignment(Pos.CENTER);
        cajaV1.getChildren().add(cajaH);
        layout.getChildren().add(cajaV1);

        this.stage.setScene(escena);
    }

    public void usarObjetos() {
        this.stage.show();
    }
}
