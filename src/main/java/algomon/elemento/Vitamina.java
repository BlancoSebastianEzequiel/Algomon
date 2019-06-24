package algomon.elemento;

import java.util.Iterator;
import java.util.List;

import algomon.ataque.Ataque;
import algomon.pokemon.Pokemon;

public class Vitamina extends Elemento {
    int potencia;

    public Vitamina(int cantidad) {
        super(cantidad);
        this.potencia = 2;
        this.nombre = "Vitamina";
    }

    public void utilizarEn(Pokemon unPokemon) {
        List<Ataque> ataques = unPokemon.getAtaques();
        Iterator<Ataque> iter = ataques.iterator();
        for (int x = 0; x < ataques.size(); x++) {
            iter.next().aumentarCantidad(potencia);
        }
    }
}
