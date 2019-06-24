package algomon.cajas;

import algomon.entrenador.Entrenador;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import algomon.pokemon.Pokemon;

public class CajaHorizontalDeEleccionDeAlgomones {
    private HBox cajaHorizontal;
    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Pokemon pokemon3;
    private Entrenador entrenador;

    public CajaHorizontalDeEleccionDeAlgomones(Pokemon unPokemon1, Pokemon unPokemon2, Pokemon unPokemon3, Entrenador unEntrenador) {
        this.pokemon1 = unPokemon1;
        this.pokemon2 = unPokemon2;
        this.pokemon3 = unPokemon3;
        this.entrenador = unEntrenador;
        this.inicializarCaja();
    }

    protected void inicializarCaja() {
        this.cajaHorizontal = new HBox(10);
        this.cajaHorizontal.setAlignment(Pos.CENTER);
        CajaAlgomon cajaAlgomon1 = new CajaAlgomon(this.pokemon1, this.entrenador);
        CajaAlgomon cajaAlgomon2 = new CajaAlgomon(this.pokemon2, this.entrenador);
        CajaAlgomon cajaAlgomon3 = new CajaAlgomon(this.pokemon3, this.entrenador);
        this.cajaHorizontal.getChildren().addAll(cajaAlgomon1.getCaja(), cajaAlgomon2.getCaja(), cajaAlgomon3.getCaja());

    }

    public HBox getCaja() {
        return this.cajaHorizontal;
    }
}
