package algomon.ataque;

import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public abstract class AtaqueDeHierba extends Ataque {
    protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException {
        return objetivo.recibirAtaqueDeHierba(this);
    }
}
