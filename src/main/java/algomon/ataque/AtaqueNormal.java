package algomon.ataque;

import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class AtaqueNormal extends Ataque {
    protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException {
        return objetivo.recibirAtaqueNormal(this);
    }
}
