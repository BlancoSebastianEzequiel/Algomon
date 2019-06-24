package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.NoPuedeRealizarElAtaqueException;
import algomon.excepciones.PokemonPropioSeDebilitoException;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class ModoDanioPermanente extends Modo implements Accionable {
    public ModoDanioPermanente()  {
        this.nombreDelModo = "Modo Danio Permanente";
    }

    public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo)
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        double danioProvocado = 0;
        try {
            danioProvocado = unAtaque.ejecutarContra(objetivo);
        } catch (NoPuedeRealizarElAtaqueException e) {
            return danioProvocado;  //El ataque no se ejecutñ
        }
        unAtaque.decrementarCantidad();
        try {
            atacante.recibirDanio((10 * atacante.getHPMax()) / 100);
        } catch (PokemonSeDebilitoException e) {
            throw new PokemonPropioSeDebilitoException();
        }
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
        // Si le provoco danio permanente a un pkmn que ya lo tenia entonces no pasa nada
        return this;
    }

    public Modo inhabilitar() {
        return new ModoDanioPermanenteEInactivoPor3Turnos();
    }

    public Modo siguienteModo() {
        return this;
    }
}
