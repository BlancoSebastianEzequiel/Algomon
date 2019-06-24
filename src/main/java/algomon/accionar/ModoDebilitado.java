package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class ModoDebilitado extends Modo {

    public ModoDebilitado() {
        this.nombreDelModo = "Modo Debilitado";
    }

    @Override
    public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo) {
        // Aca hay que acordarnos de poner el Mensaje de Debilitado en el Layout
        return 0;
    }

    public double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException {
        return 0;
    }

    public Modo siguienteModo() {
        return this;
    }

    public Modo inhabilitar() {
        return this;
    }

    public Modo sufrirDanioPermanente() {
        return this;
    }
}
