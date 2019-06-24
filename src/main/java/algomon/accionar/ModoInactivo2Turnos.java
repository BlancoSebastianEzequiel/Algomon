package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class ModoInactivo2Turnos extends Modo{

    private Modo siguienteModo;

    public ModoInactivo2Turnos() {
        this.siguienteModo = new ModoInactivo1Turno();
        this.nombreDelModo = "Modo Inactivo 2 Turnos";
    }

    @Override
    public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo) {
        //Aca hay que acordarnos de poner el Mensaje de Dormido en el Layout
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
        return new ModoDanioPermanenteEInactivoPor2Turnos();
    }

    public Modo inhabilitar() {
        return new ModoInactivo3Turnos();
    }

    public Modo siguienteModo() {
        return this.siguienteModo;
    }
}
