package algomon.cajas;

import algomon.entrenador.Entrenador;
import javafx.scene.layout.VBox;
import algomon.pokemon.Bulbasaur;
import algomon.pokemon.Chansey;
import algomon.pokemon.Charmander;
import algomon.pokemon.Jigglypuff;
import algomon.pokemon.Pokemon;
import algomon.pokemon.Rattata;
import algomon.pokemon.Squirtle;

public class CajaDeEleccionDeAlgomones {
    private VBox cajaVertical;
    private Pokemon charmander;
    private Pokemon bulbasaur;
    private Pokemon squirtle;
    private Pokemon jigglypuff;
    private Pokemon chansey;
    private Pokemon rattata;
    private Entrenador entrenador;

    public CajaDeEleccionDeAlgomones(Entrenador unEntrenador) {
        this.entrenador = unEntrenador;
        this.charmander = new Charmander();
        this.bulbasaur = new Bulbasaur();
        this.squirtle = new Squirtle();
        this.jigglypuff = new Jigglypuff();
        this.chansey = new Chansey();
        this.rattata = new Rattata();
        this.inicializarCaja();
    }

    protected void inicializarCaja() {
        this.cajaVertical = new VBox(10);
        CajaHorizontalDeEleccionDeAlgomones primeraCajaHorizontalDeEleccionDeAlgomones = new
                CajaHorizontalDeEleccionDeAlgomones(this.charmander, this.bulbasaur, this.squirtle, this.entrenador);
        CajaHorizontalDeEleccionDeAlgomones segundaCajaHorizontalDeEleccionDeAlgomones = new
                CajaHorizontalDeEleccionDeAlgomones(this.jigglypuff, this.chansey, this.rattata, this.entrenador);
        this.cajaVertical.getChildren().add(primeraCajaHorizontalDeEleccionDeAlgomones.getCaja());
        this.cajaVertical.getChildren().add(segundaCajaHorizontalDeEleccionDeAlgomones.getCaja());
    }

    public VBox getCaja() {
        return this.cajaVertical;
    }

    public Entrenador getEntrenador() {
        return this.entrenador;
    }
}
