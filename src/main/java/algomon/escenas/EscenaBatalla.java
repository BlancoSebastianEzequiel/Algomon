package algomon.escenas;

import java.util.List;

import algomon.aplicacion.Escenario;
import algomon.aplicacion.Imagen;
import algomon.aplicacion.Musica;
import algomon.ataque.Ataque;
import algomon.barraMenu.BarraDeMenu;
import algomon.entrenador.Entrenador;
import algomon.eventos.BotonDeAtaqueEventHandler;
import algomon.eventos.BotonDeCambioDePokemonEventHandler;
import algomon.eventos.BotonDeUsarObjetoEventHandler;
import algomon.pokemon.Pokemon;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class EscenaBatalla implements Escena<EscenaBatalla> {
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private Pokemon pokemonEntrenador1;
    private Pokemon pokemonEntrenador2;
    private List<Ataque> ataquesPokemonEntrenador1;
    private Scene escenaBatalla;
    private Escena<?> escenaSiguiente;
    private Imagen imagenPokemon1;
    private Imagen imagenPokemon2;
    private Button botonDeAtaque1;
    private Button botonDeAtaque2;
    private Button botonDeAtaque3;
    private Button botonDeCambioDePokemon;
    private Button botonDeUsarObjeto;
    private EscenaCambiarPokemon cambioDePokemon;
    private EscenaDeObjetos escenaDeObjetos;

    public EscenaBatalla(Entrenador entrenador1, Entrenador entrenador2) {
        Musica.parar();
        new Musica("files/107-battle-vs-wild-pokemon-.wav");
        Musica.play();
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void inicializarEscena() {
        this.cambioDePokemon = new EscenaCambiarPokemon(entrenador1, this);
        this.escenaDeObjetos = new EscenaDeObjetos(entrenador1, this);

        BorderPane layout = new BorderPane();

        this.pokemonEntrenador1 = this.entrenador1.getPokemonActual();
        this.pokemonEntrenador2 = this.entrenador2.getPokemonActual();

        BarraDeMenu barraDeMenu = new BarraDeMenu();

        this.imagenPokemon1 = new Imagen("file:files/" + this.pokemonEntrenador1.getNombre() + "back" + ".gif", 200, 112, false, true);
        this.imagenPokemon2 = new Imagen("file:files/" + this.pokemonEntrenador2.getNombre() + ".gif", 120, 68, false, true);

        this.ataquesPokemonEntrenador1 = this.pokemonEntrenador1.getAtaques();

        VBox cajaDePokemonsConNombre1 = new VBox(10);
        Label nombrePlayer1 = new Label();
        nombrePlayer1.setText(this.entrenador1.getNombre() + " TurnoActual");
        nombrePlayer1.setTextFill(Color.web("#FF0000"));
        cajaDePokemonsConNombre1.setAlignment(Pos.BOTTOM_CENTER);
        cajaDePokemonsConNombre1.getChildren().add(nombrePlayer1);
        cajaDePokemonsConNombre1.getChildren().add(this.imagenPokemon1.getImagenView());

        VBox cajaDePokemonsConNombre2 = new VBox(10);
        Label nombrePlayer2 = new Label();
        nombrePlayer2.setText(this.entrenador2.getNombre());
        nombrePlayer2.setTextFill(Color.web("#0076a3"));
        cajaDePokemonsConNombre2.setAlignment(Pos.BOTTOM_CENTER);
        cajaDePokemonsConNombre2.getChildren().add(nombrePlayer2);
        cajaDePokemonsConNombre2.getChildren().add(this.imagenPokemon2.getImagenView());

        HBox cajaDePokemonsDelCentro = new HBox(200);
        cajaDePokemonsDelCentro.setAlignment(Pos.BOTTOM_CENTER);
        cajaDePokemonsDelCentro.getChildren().add(cajaDePokemonsConNombre1);
        cajaDePokemonsDelCentro.getChildren().add(cajaDePokemonsConNombre2);

        Imagen imagen = new Imagen("file:files/Escenario2.png", 800, 600, false, true);
        layout.setBackground(imagen.getAsBackgroundImage());

        layout.setCenter(cajaDePokemonsDelCentro);
        layout.setTop(barraDeMenu.getBarraDeMenu());

        Imagen imagenDeFondoDeLaColumnaDeDatos = new Imagen("file:files/imagenDeFondoDeLaColumnaDeDatos.png");
        VBox cajaDatosOponente = this.cajaDeDatos(this.entrenador2);
        VBox cajaDeAciones = this.setAccionesEnLaEscena();
        VBox cajaColumnaDeDatos = new VBox(30);
        cajaColumnaDeDatos.setAlignment(Pos.CENTER_LEFT);
        cajaColumnaDeDatos.getChildren().add(cajaDatosOponente);
        cajaColumnaDeDatos.getChildren().add(cajaDeAciones);
        StackPane panelDeDatos = new StackPane();
        panelDeDatos.setAlignment(Pos.BOTTOM_LEFT);
        panelDeDatos.getChildren().add(imagenDeFondoDeLaColumnaDeDatos.getImagenView());
        panelDeDatos.getChildren().add(cajaColumnaDeDatos);

        layout.setBottom(panelDeDatos);

        this.escenaBatalla = new Scene(layout);
    }

    private VBox cajaDeDatos(Entrenador unEntrenador) {
        VBox caja = new VBox(0.001);

        Pokemon unPokemon = unEntrenador.getPokemonActual();

        Label datosDelOponente = new Label();
        datosDelOponente.setText("Datos de : " + unEntrenador.getNombre() + ", Pokemon Actual: " + unPokemon.getNombre());
        datosDelOponente.setTextFill(Color.BLACK);

        Label hpMax = new Label();
        hpMax.setText("HPMax: " + String.valueOf((int)unPokemon.getHPMax()));
        hpMax.setTextFill(Color.BLACK);

        Label hp = new Label();
        hp.setText("HP: " + String.valueOf((int)unPokemon.getHP()));
        hp.setTextFill(Color.BLACK);

        Label puntuacion = new Label();
        puntuacion.setText("Puntuacion: " + String.valueOf(unEntrenador.getPuntuacion()));
        puntuacion.setTextFill(Color.BLACK);

        HBox cajaDeDatoDeHp = new HBox(10);
        cajaDeDatoDeHp.getChildren().addAll(hp, hpMax, puntuacion);

        Label estado = new Label();
        estado.setText("EstadoDelPokemonActual: " + unPokemon.getNombreDelModoActual());
        estado.setTextFill(Color.BLACK);

        caja.setAlignment(Pos.CENTER_LEFT);
        caja.getChildren().addAll(datosDelOponente, cajaDeDatoDeHp, estado);
        return caja;
    }

    private VBox setAccionesEnLaEscena() {
        VBox cajaVertical = new VBox(5);
        cajaVertical.setAlignment(Pos.CENTER_LEFT);

        HBox cajaDeAtaques = new HBox(10);
        HBox cajaDeOtrasAcciones = new HBox(10);

        VBox datosActual = this.cajaDeDatos(this.entrenador1);

        this.botonDeAtaque1 = new Button();
        this.botonDeAtaque2 = new Button();
        this.botonDeAtaque3 = new Button();

        BotonDeAtaqueEventHandler botonDeAtaque1EventHandler = new
                BotonDeAtaqueEventHandler(botonDeAtaque1, this.ataquesPokemonEntrenador1.get(0), this);
        BotonDeAtaqueEventHandler botonDeAtaque2EventHandler = new
                BotonDeAtaqueEventHandler(botonDeAtaque2, this.ataquesPokemonEntrenador1.get(1), this);
        BotonDeAtaqueEventHandler botonDeAtaque3EventHandler = new
                BotonDeAtaqueEventHandler(botonDeAtaque3, this.ataquesPokemonEntrenador1.get(2), this);

        botonDeAtaque1.setOnAction(botonDeAtaque1EventHandler);
        botonDeAtaque2.setOnAction(botonDeAtaque2EventHandler);
        botonDeAtaque3.setOnAction(botonDeAtaque3EventHandler);

        cajaDeAtaques.getChildren().addAll(this.botonDeAtaque1, this.botonDeAtaque2, this.botonDeAtaque3);

        this.botonDeCambioDePokemon = new Button();
        this.botonDeUsarObjeto = new Button();

        BotonDeCambioDePokemonEventHandler botonDeCambioDePokemonEcentHandler = new
                BotonDeCambioDePokemonEventHandler(botonDeCambioDePokemon, this.cambioDePokemon);
        BotonDeUsarObjetoEventHandler botonDeUsarObjetoEventHandler = new
                BotonDeUsarObjetoEventHandler(botonDeUsarObjeto, this.escenaDeObjetos);
        botonDeCambioDePokemon.setOnAction(botonDeCambioDePokemonEcentHandler);
        botonDeUsarObjeto.setOnAction(botonDeUsarObjetoEventHandler);

        cajaDeOtrasAcciones.getChildren().addAll(this.botonDeCambioDePokemon, this.botonDeUsarObjeto);

        cajaVertical.getChildren().addAll(datosActual, cajaDeAtaques, cajaDeOtrasAcciones);
        return cajaVertical;
    }

    public void disparar() {
        this.inicializarEscena();
        Escenario.stage.setScene(this.escenaBatalla);
    }

    public EscenaBatalla getEscena() {
        return this;
    }

    public void setEscenaSiguiente(Escena<?> unaEscena) {
        this.escenaSiguiente = unaEscena;
    }

    public Escena<?> getEscenaSiguiente() {
        return this.escenaSiguiente;
    }

    public Pokemon getPokemonOponente() {
        return this.pokemonEntrenador2;
    }
}
