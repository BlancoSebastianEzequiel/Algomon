package algomon.accionar;

import algomon.ataque.Ataque;
import algomon.excepciones.PokemonPropioSeDebilitoException;
import algomon.excepciones.PokemonSeDebilitoException;
import algomon.pokemon.Pokemon;

public class ModoDeAccion {
    private Modo comoActuar;

    public ModoDeAccion() {
        this.comoActuar = new ModoNormal();
    }

    public double accionar(Pokemon atacante, Ataque unAtaque, Pokemon objetivo)
            throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        // TODO Auto-generated method stub
        double danioProvocado = this.comoActuar.accionar(atacante, unAtaque, objetivo);//Hace una Accion segun que tipo de Modo es
        this.comoActuar = this.comoActuar.siguienteModo();//Cambia al siguiente Modo
        return danioProvocado;
    }

    public double recibirDanio(Pokemon unPokemon, double cantidadHP) throws PokemonSeDebilitoException {
        this.comoActuar.recibirDanio(unPokemon, cantidadHP);
        return cantidadHP;
    }

    public void inactivoTresTurnos() {
        this.comoActuar = this.comoActuar.inhabilitar();
    }

    public void danioPermanente() {
        this.comoActuar = this.comoActuar.sufrirDanioPermanente();
    }

    public void debilitado() {
        this.comoActuar = new ModoDebilitado();
    }

    public void danioPermanenteEInactivoTresTurnos() {
        this.comoActuar = new ModoDanioPermanenteEInactivoPor3Turnos();
    }

    public void normal() {
        this.comoActuar = new ModoNormal();
    }

    public String getNombreDelModo() {
        return this.comoActuar.getNombreModo();
    }
}
