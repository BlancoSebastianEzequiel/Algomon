package algomon.ataque;

import algomon.excepciones.NoPuedeRealizarElAtaqueException;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public abstract class Ataque implements Usable {
    protected String nombre;
    protected int potencia;
    protected int cantidad;
    /*cuanto del daño provocado es absorvido por el pkmn atacante para chupavidas sera 30%,
    para brasas sera 0 % por ejemplo*/
    protected int porcentajeDeDrenado = 0;

    public int getPotencia() {
        return this.potencia;
    }

    public int getPorcentajeDrenado() {
        return this.porcentajeDeDrenado;
    }

    public void aumentarCantidad(int cantidad) {
        this.cantidad -= cantidad;
    }

    public void decrementarCantidad() {
        this.cantidad --;
    }

    public double ejecutarContra(Pokemon objetivo) throws NoPuedeRealizarElAtaqueException, PokemonSeDebilitoException {
        //Pongo este metodo intermedio aca para no tener
        if (this.cantidad == 0) {
            //que poner el mismo if en cada uno de los
            throw new NoPuedeRealizarElAtaqueException(); // tipos de ataque
        }
        return this.realizarAtaqueContra(objetivo);
    }

    abstract protected double realizarAtaqueContra(Pokemon objetivo) throws PokemonSeDebilitoException;

    public String getNombre() {
        return this.nombre;
    }
}
