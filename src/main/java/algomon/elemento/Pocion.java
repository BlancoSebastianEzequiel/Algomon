package algomon.elemento;

import algomon.pokemon.Pokemon;

public class Pocion extends Elemento {
    private int potencia;

    public Pocion(int cantidad) {
        super(cantidad);
        this.potencia = 20;
        this.nombre = "Pocion";
    }

    public void utilizarEn(Pokemon unPokemon) {
        unPokemon.aumentarHP(potencia);
    }
}
