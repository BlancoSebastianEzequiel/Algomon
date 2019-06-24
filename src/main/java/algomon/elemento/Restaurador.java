package algomon.elemento;

import algomon.pokemon.Pokemon;

public class Restaurador extends Elemento {
    public Restaurador(int cantidad) {
        super(cantidad);
        this.nombre = "Restaurador";
    }

    public void utilizarEn(Pokemon unPokemon) {
        unPokemon.regresarAModoNormal();
    }
}
