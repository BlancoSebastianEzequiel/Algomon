package algomon.ataque;

import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class Canto extends AtaqueNormal {
    public Canto() {
        this.potencia = 0;
        this.cantidad = 6;
        this.nombre = "Canto";
    }

    protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException {
        return objetivo.recibirAtaqueCanto();
    }
}
