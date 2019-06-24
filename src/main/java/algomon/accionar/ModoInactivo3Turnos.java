package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class ModoInactivo3Turnos extends Modo {
    private Modo siguienteModo;

    public ModoInactivo3Turnos() {
        this.siguienteModo = new ModoInactivo2Turnos();
        this.nombreDelModo = "Modo Inactivo 3 Turnos";
    }

    @Override
    public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo) {
        // Aca hay que acordarnos de poner el Mensaje de Dormido en el Layout
        return 0;
    }

    public double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException {
        unPokemon.decrementarHP(cantidadHP);
        if (unPokemon.getHP() <= 0) {
            throw new PokemonSeDebilitoException();
        }
        return cantidadHP;
    }

    public Modo sufrirDanioPermanente() {
        return new ModoDanioPermanenteEInactivoPor3Turnos();
    }

    public Modo inhabilitar() {
        return new ModoInactivo3Turnos();
    }

    public Modo siguienteModo() {
        return this.siguienteModo;
    }
}
