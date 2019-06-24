package algomon.pokemon;

import java.util.ArrayList;

import algomon.ataque.Ataque;
import algomon.ataque.AtaqueRapido;
import algomon.ataque.Brasas;
import algomon.ataque.Fogonazo;

public class Charmander extends FireTypePokemon {
    public Charmander() {
        super();
        this.hpMax = 170;
        this.hp = this.hpMax;
        this.nombre = "charmander";
        Fogonazo unFogonazo = new Fogonazo();
        Brasas unBrasas = new Brasas();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        this.ataques = new ArrayList<Ataque>();
        this.ataques.add(unFogonazo);
        this.ataques.add(unBrasas);
        this.ataques.add(unAtaqueRapido);
    }
}
