package algomon.pokemon;

import java.util.ArrayList;

import algomon.ataque.Ataque;
import algomon.ataque.AtaqueRapido;
import algomon.ataque.Burbuja;
import algomon.ataque.CanionDeAgua;

public class Squirtle extends WaterTypePokemon  {
    public Squirtle() {
        super();
        this.hpMax = 150;
        this.hp = this.hpMax;
        this.nombre = "squirtle";
        CanionDeAgua unCanionDeAgua = new CanionDeAgua();
        Burbuja unBurbuja = new Burbuja();
        AtaqueRapido unAtaqueRapido = new AtaqueRapido();
        this.ataques = new ArrayList<Ataque>();
        this.ataques.add(unCanionDeAgua);
        this.ataques.add(unBurbuja);
        this.ataques.add(unAtaqueRapido);
    }
}
