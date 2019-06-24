package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.NoPuedeRealizarElAtaqueException;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class ModoNormal extends Modo implements Accionable {
    public ModoNormal() {
        this.nombreDelModo = "Modo Normal";
    }

    public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo) throws PokemonSeDebilitoException {
        double danioProvocado = 0;
        try {
            danioProvocado = unAtaque.ejecutarContra(objetivo);
        } catch (NoPuedeRealizarElAtaqueException e) {
            return danioProvocado; //El ataque no se ejecutñ
        }
        unAtaque.decrementarCantidad();
        return danioProvocado;
    }

    public double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException {
        unPokemon.decrementarHP(cantidadHP);
        if (unPokemon.getHP() <= 0) {
            throw new PokemonSeDebilitoException();
        }
        return cantidadHP;
    }

    public Modo sufrirDanioPermanente() {
        return new ModoDanioPermanente();
    }

    public Modo inhabilitar() {
        return new ModoInactivo3Turnos();
    }

    public Modo siguienteModo() {
        return this;
    }
}
