package algomon.elemento;

import algomon.pokemon.Pokemon;

public class SuperPocion extends Elemento {
    private int potencia;

    public SuperPocion(int cantidad) {
        super(cantidad);
        this.potencia = 40;
        this.nombre = "Super Pocion";
    }

    public void utilizarEn(Pokemon unPokemon) {
        unPokemon.aumentarHP(potencia);
    }
}
