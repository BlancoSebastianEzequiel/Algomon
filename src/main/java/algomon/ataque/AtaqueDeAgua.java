package algomon.ataque;

import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public abstract class AtaqueDeAgua extends Ataque {
    protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException {
        return objetivo.recibirAtaqueDeAgua(this);
    }
}
