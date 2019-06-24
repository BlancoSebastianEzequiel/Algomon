package algomon.cajas;

import algomon.aplicacion.Imagen;
import algomon.entrenador.Entrenador;
import algomon.eventos.BotonCaracteristicasAlgomonEventHandler;
import algomon.eventos.BotonDeSelecionDePokemonEventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import algomon.pokemon.Pokemon;

public class CajaAlgomon {
    private VBox cajaVertical;
    private Entrenador entrenador;
    private Pokemon pokemon;
    private Button botonDeSelecion;
    private Imagen imagenTilde;

    public CajaAlgomon(Pokemon unPokemon, Entrenador unEntrenador) {
        this.entrenador = unEntrenador;
        this.pokemon = unPokemon;
        this.inicializar();
    }

    protected void inicializar() {
        this.cajaVertical = new VBox(5);
        HBox cajaDeBotonesHorizontal = new HBox(25);

        Imagen imagenDelPokemon = new Imagen("file:files/" + this.pokemon.getNombre() + ".gif", 200, 140, false, true);

        this.botonDeSelecion = new Button();
        BotonDeSelecionDePokemonEventHandler botonDeSelecionEventHandler = new BotonDeSelecionDePokemonEventHandler(this);
        this.botonDeSelecion.setOnAction(botonDeSelecionEventHandler);

        Button botonCaracteristicas = new Button();
        BotonCaracteristicasAlgomonEventHandler unBotonCaracteristicasAlgomonEventHandler = new
                BotonCaracteristicasAlgomonEventHandler(botonCaracteristicas, this.pokemon);
        botonCaracteristicas.setOnAction(unBotonCaracteristicasAlgomonEventHandler);

        cajaDeBotonesHorizontal.getChildren().addAll(this.botonDeSelecion, botonCaracteristicas);

        this.imagenTilde = new Imagen("file:files/tilde.png", 40, 20, false, true);

        this.cajaVertical.getChildren().addAll(imagenDelPokemon.getImagenView(), cajaDeBotonesHorizontal);
    }

    public Entrenador getEntrenador() {
        return this.entrenador;
    }

    public Pokemon getPokemon() {
        return this.pokemon;
    }

    public Button getBotonDeSelecion() {
        return this.botonDeSelecion;
    }

    public VBox getCaja() {
        return this.cajaVertical;
    }

    public void agregarTilde() {
        this.cajaVertical.getChildren().add(this.imagenTilde.getImagenView());
    }

    public void sacarTilde() {
        this.cajaVertical.getChildren().remove(this.imagenTilde.getImagenView());
    }
}
