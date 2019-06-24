package algomon.escenas;

import algomon.aplicacion.Escenario;
import algomon.aplicacion.Imagen;
import algomon.barraMenu.BarraDeMenu;
import algomon.cajas.CajaDeEleccionDeAlgomones;
import algomon.entrenador.Entrenador;
import algomon.eventos.BotonAceptarEventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class EscenaElegirAlgomones implements Escena<EscenaElegirAlgomones> {
    private Scene escenaEleccionAlgomones;
    private Escena<?> escenaSiguiente;
    private Button botonAceptar;
    private Entrenador entrenador;
    private CajaDeEleccionDeAlgomones unaCajaDeEleccionDeAlgomones;

    public EscenaElegirAlgomones(Entrenador unEntrenador) {
        this.entrenador = unEntrenador;
    }

    public void inicializarEscena() {
        StackPane stackPane = new StackPane();

        Imagen imagenDeFondo = new Imagen("file:files/elegiralgomones.jpg", 1280, 720, false, true);
        stackPane.setBackground(imagenDeFondo.getAsBackgroundImage());

        this.unaCajaDeEleccionDeAlgomones = new CajaDeEleccionDeAlgomones(this.entrenador);

        this.botonAceptar = new Button();
        BotonAceptarEventHandler miBotonAceptarEventHandler = new BotonAceptarEventHandler(this);
        this.botonAceptar.setOnAction(miBotonAceptarEventHandler);

        BarraDeMenu barraDeMenu = new BarraDeMenu();

        VBox cajaVertical = new VBox(10);
        cajaVertical.getChildren().add(barraDeMenu.getBarraDeMenu());
        cajaVertical.getChildren().add(this.unaCajaDeEleccionDeAlgomones.getCaja());
        cajaVertical.getChildren().add(this.botonAceptar);

        stackPane.getChildren().add(cajaVertical);
        this.escenaEleccionAlgomones = new Scene(stackPane);
    }

    public EscenaElegirAlgomones getEscena() {
        return this;
    }

    public void disparar() {
        Escenario.stage.setTitle("Elegir Algomones");
        Escenario.stage.setScene(this.escenaEleccionAlgomones);
    }

    public Button getBotonAceptar() {
        return this.botonAceptar;
    }

    public Entrenador getEntrenador() {
        return this.entrenador;
    }

    public void setEscenaSiguiente(Escena<?> unaEscena) {
        this.escenaSiguiente = unaEscena;
    }

    public Escena<?> getEscenaSiguiente() {
        return this.escenaSiguiente;
    }
}
