package algomon.pokemon;

import algomon.ataque.Ataque;
import algomon.excepciones.PokemonSeDebilitoException;

public abstract class WaterTypePokemon extends Pokemon {
    public double recibirAtaqueDeFuego(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.noMuyEfectivo(unAtaque);
    }

    public double recibirAtaqueDeAgua(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.noMuyEfectivo(unAtaque);
    }

    public double recibirAtaqueDeHierba(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.superEfectivo(unAtaque);
    }
}
