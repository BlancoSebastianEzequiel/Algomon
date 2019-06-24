package algomon.pokemon;

import java.util.ArrayList;

import algomon.ataque.Ataque;
import algomon.ataque.AtaqueRapido;
import algomon.ataque.Burbuja;
import algomon.ataque.Canto;

public class Jigglypuff extends NormalTypePokemon {
    public Jigglypuff() {
        super();
        this.hpMax = 130;
        this.hp = this.hpMax;
        this.nombre = "jigglypuff";
        Canto unCanto = new Canto();
        Burbuja unBurbuja = new Burbuja();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        this.ataques = new ArrayList<Ataque>();
        this.ataques.add(unCanto);
        this.ataques.add(unBurbuja);
        this.ataques.add(unAtaqueRapido);
    }
}
