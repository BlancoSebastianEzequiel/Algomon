package algomon.ataque;

import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class Fogonazo extends AtaqueDeFuego {
    public Fogonazo() {
        this.potencia = 2;
        this.cantidad = 4;
        this.nombre = "Fogonazo";
    }

    protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException {
        return objetivo.recibirFogonazo(this);
    }
}
