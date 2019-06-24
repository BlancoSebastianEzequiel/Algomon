package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.PokemonPropioSeDebilitoException;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class ModoDanioPermanenteEInactivoPor2Turnos extends Modo {

    private Modo siguienteModo;

    public ModoDanioPermanenteEInactivoPor2Turnos() {
        this.siguienteModo = new ModoDanioPermanenteEInactivoPor1Turno();
        this.nombreDelModo = "Modo Danio Permanente e Inactivo Por 2 Turnos";
    }

    public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo)
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        //Aca hay que acordarnos de poner el Mensaje de Dormido en el Layout
        try {
            return atacante.recibirDanio((10 * atacante.getHPMax()) / 100);
        } catch (PokemonSeDebilitoException e) {
            throw new PokemonPropioSeDebilitoException();
        }
    }

    public double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException {
        unPokemon.decrementarHP(cantidadHP);
        if (unPokemon.getHP() <= 0) {
            throw new PokemonSeDebilitoException();
        }
        return cantidadHP;
    }

    public Modo sufrirDanioPermanente() {
        // No pasa nada
        return this;
    }

    public Modo inhabilitar() {
        return new ModoDanioPermanenteEInactivoPor3Turnos();
    }

    public Modo siguienteModo() {
        return this.siguienteModo;
    }
}
