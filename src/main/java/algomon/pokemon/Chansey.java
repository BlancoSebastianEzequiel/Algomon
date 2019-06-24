package algomon.pokemon;

import java.util.ArrayList;

import algomon.ataque.Ataque;
import algomon.ataque.AtaqueRapido;
import algomon.ataque.Canto;
import algomon.ataque.LatigoCepa;

public class Chansey extends NormalTypePokemon {
    public Chansey() {
        super();
        this.hpMax = 130;
        this.hp = this.hpMax;
        this.nombre = "chansey";
        Canto unCanto = new Canto();
        LatigoCepa unLatigoCepa = new LatigoCepa();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        this.ataques = new ArrayList<Ataque>();
        this.ataques.add(unLatigoCepa);
        this.ataques.add(unCanto);
        this.ataques.add(unAtaqueRapido);
    }
}
