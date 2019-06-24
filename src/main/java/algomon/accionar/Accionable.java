package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.PokemonPropioSeDebilitoException;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public interface Accionable {
    public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo)
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException;

    public double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException;

    public Accionable siguienteModo();

}
