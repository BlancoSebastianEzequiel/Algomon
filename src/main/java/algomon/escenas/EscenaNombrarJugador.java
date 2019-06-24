package algomon.escenas;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import algomon.aplicacion.Escenario;
// import javafx.scene.effect.Glow;
import algomon.aplicacion.Imagen;
import algomon.barraMenu.BarraDeMenu;
import algomon.entrenador.Entrenador;
import algomon.eventos.ElegirAlgomonesEventHandler;

public class EscenaNombrarJugador implements Escena<EscenaNombrarJugador> {
    private Entrenador nuevoEntrenador;
    private TextField campoNombreJugador;
    private Button botonCrear;
    private String nombreEscena;
    private Escena<?> escenaSiguiente;
    private Scene escenaNuevoJugador;
    private VBox boxVertical;
    private Text textoDeValidacion;

    public EscenaNombrarJugador(String unNombreEscena, Entrenador unEntrenador) {
        this.nombreEscena = unNombreEscena;
        this.nuevoEntrenador = unEntrenador;
    }

    public void inicializarEscena() {
        BorderPane borderPane = new BorderPane();
        Imagen imagen = this.inicializarImagen();
        borderPane.setBackground(imagen.getAsBackgroundImage());

        Text primerTextoIntroduccion = this.inicializarPrimerTextoIntroduccion();
        Text segundoTextoIntroduccion = this.inicializarSegundoTextoIntroduccion();

        this.campoNombreJugador = new TextField();

        this.botonCrear = new Button();
        ElegirAlgomonesEventHandler elegirAlgomones = new ElegirAlgomonesEventHandler(this);
        this.botonCrear.setOnAction(elegirAlgomones);

        this.textoDeValidacion = this.inicializarTextoDeValidacion();

        HBox boxHorizontal = this.inicializarBoxHorizontal(segundoTextoIntroduccion);
        this.boxVertical = inicializarBoxVertical(primerTextoIntroduccion, boxHorizontal);
        BarraDeMenu barraDeMenu = new BarraDeMenu();

        borderPane.setCenter(this.boxVertical);
        borderPane.setTop(barraDeMenu.getBarraDeMenu());

        this.escenaNuevoJugador = new Scene(borderPane);
    }

    public Entrenador getEntrenador() {
        return this.nuevoEntrenador;
    }

    public void setEntrenador(Entrenador unEntrenador) {
        this.nuevoEntrenador = unEntrenador;
    }

    public String getTextoDeCampo() {
        return this.campoNombreJugador.getText();
    }

    private Imagen inicializarImagen() {
        return new Imagen("file:files/logo.png", 1280, 720, false, true);
    }

    private Text inicializarPrimerTextoIntroduccion() {
        Text primerTextoIntroduccion = new Text(25, 25, this.nombreEscena);
        primerTextoIntroduccion.setFill(Color.BLACK);
        primerTextoIntroduccion.setFont(Font.font(20));
        return primerTextoIntroduccion;
    }

    private Text inicializarSegundoTextoIntroduccion() {
        Text segundoTextoIntroduccion = new Text(25, 25, "Intrduzca el Nombre: ");
        segundoTextoIntroduccion.setFill(Color.BLACK);
        segundoTextoIntroduccion.setFont(Font.font(20));
        return segundoTextoIntroduccion;
    }

    private Text inicializarTextoDeValidacion() {
        Text textoDeValidacion = new Text(25, 25, "ATENCION: DEBE INTRODUCIR UN NOMBRE");
        textoDeValidacion.setFill(Color.BLACK);
        textoDeValidacion.setFont(Font.font(20));
        return textoDeValidacion;
    }

    public void agragarTextoDeValidacion() {
        this.boxVertical.getChildren().add(this.textoDeValidacion);
    }

    public void borrarTextoDeValidacion() {
        this.boxVertical.getChildren().remove(this.textoDeValidacion);
    }

    private HBox inicializarBoxHorizontal(Text segundoTextoIntroduccion) {
        HBox boxHorizontal = new HBox();
        boxHorizontal.setAlignment(Pos.CENTER);
        boxHorizontal.getChildren().addAll(segundoTextoIntroduccion, this.campoNombreJugador);
        boxHorizontal.setSpacing(10);
        return boxHorizontal;
    }

    private VBox inicializarBoxVertical(Text primerTextoIntroduccion, HBox boxHorizontal) {
        VBox boxVertical = new VBox(10);
        boxVertical.setAlignment(Pos.CENTER);
        boxVertical.getChildren().add(primerTextoIntroduccion);
        boxVertical.getChildren().add(boxHorizontal);
        boxVertical.getChildren().add(this.botonCrear);
        return boxVertical;
    }

    public Button getBotonCrear() {
        return this.botonCrear;
    }

    public Escena<?> getEscenaElegirAlgomones() {
        return this.escenaSiguiente;
    }

    public void disparar() {
        Escenario.stage.setTitle(this.nombreEscena);
        Escenario.stage.setScene(this.escenaNuevoJugador);
    }

    public EscenaNombrarJugador getEscena() {
        return this;
    }

    public void setEscenaSiguiente(Escena<?> unaEscena) {
        this.escenaSiguiente = unaEscena;
    }

    public Escena<?> getEscenaSiguiente() {
        return this.escenaSiguiente;
    }
}
