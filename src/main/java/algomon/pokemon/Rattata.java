package algomon.pokemon;

import java.util.ArrayList;

import algomon.ataque.Ataque;
import algomon.ataque.AtaqueRapido;
import algomon.ataque.Burbuja;
import algomon.ataque.Fogonazo;

public class Rattata extends NormalTypePokemon {
    public Rattata() {
        super();
        this.hpMax = 170;
        this.hp = this.hpMax;
        this.nombre = "rattata";
        Fogonazo unFogonazo = new Fogonazo();
        Burbuja unBurbuja = new Burbuja();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        this.ataques = new ArrayList<Ataque>();
        this.ataques.add(unFogonazo);
        this.ataques.add(unBurbuja);
        this.ataques.add(unAtaqueRapido);
    }
}
