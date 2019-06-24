package algomon.elemento;

import algomon.pokemon.Pokemon;

public class Elemento {
    protected int cantidad;
    protected String nombre;

    public Elemento(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aplicarEn(Pokemon unPokemon) {
        if (this.cantidad > 0) {
            this.utilizarEn(unPokemon);
        }
        this.decrementarCantidad();
    }

    public void utilizarEn(Pokemon unPokemon) {}

    public void decrementarCantidad() {
        if (cantidad == 0) {
            return;
        }
        this.cantidad --;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }
}
