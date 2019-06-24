package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.PokemonPropioSeDebilitoException;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public abstract class Modo implements Accionable{
    protected String nombreDelModo;

    public Modo siguienteModo() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getNombreModo() {
        return this.nombreDelModo;
    }

    public abstract double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo)
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException;

    public abstract double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException;

    public abstract Modo sufrirDanioPermanente();

    public abstract Modo inhabilitar();
}
