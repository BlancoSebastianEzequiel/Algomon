package algomon.pokemon;

import java.util.ArrayList;

import algomon.ataque.Ataque;
import algomon.ataque.AtaqueRapido;
import algomon.ataque.Chupavidas;
import algomon.ataque.LatigoCepa;

public class Bulbasaur extends GrassTypePokemon {
    public Bulbasaur() {
        super();
        this.hpMax = 140;
        this.hp = this.hpMax;
        this.nombre = "bulbasaur";
        Chupavidas unChupavidas = new Chupavidas();
        LatigoCepa unLatigoCepa = new LatigoCepa();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        this.ataques = new ArrayList<Ataque>();
        this.ataques.add(unChupavidas);
        this.ataques.add(unLatigoCepa);
        this.ataques.add(unAtaqueRapido);
    }
}
