package algomon.pokemon;

import java.util.List;

import algomon.accionar.ModoDeAccion;
import algomon.ataque.Ataque;
import algomon.ataque.Fogonazo;
import algomon.entrenador.Entrenador;
import algomon.excepciones.PokemonPropioSeDebilitoException;
import algomon.excepciones.PokemonSeDebilitoException;

public abstract class Pokemon {
    protected double hp;
    protected double hpMax;
    protected String nombre;
    protected List<Ataque> ataques;
    protected Entrenador entrenador;
    protected ModoDeAccion accionador;

    public Pokemon() {
        this.accionador = new ModoDeAccion();
    }

    public double getHP() {
        return this.hp;
    }

    public double getHPMax() {
        return this.hpMax;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEntrenador(Entrenador unEntrenador) {
        this.entrenador = unEntrenador;
    }

    public void setHP(double cantidad) {
        this.hp = cantidad;
    }

    public List<Ataque> getAtaques() {
        return this.ataques;
    }

    public void regresarAModoNormal() {
        this.accionador.normal();
    }

    public void atacar(Ataque unAtaque, Pokemon objetivo) throws PokemonSeDebilitoException, PokemonPropioSeDebilitoException {
        int danioProvocado = (int) this.accionador.accionar(this, unAtaque, objetivo);
        this.aumentarHP((unAtaque.getPorcentajeDrenado() * danioProvocado) / 100);
    }

    public double recibirAtaqueDeFuego(Ataque unAtaque) throws PokemonSeDebilitoException {
        // A diferencia del piedra-papel-tijera, hace falta pasar el ataque por parametro, porque no todos hacen el mismo daño
        return this.danioNormal(unAtaque);
    }

    public int recibirAtaqueCanto() {
        this.accionador.inactivoTresTurnos();
        return 0;
    }

    public double recibirFogonazo(Fogonazo unFogonazo) throws PokemonSeDebilitoException {
        double danioProvocado = this.recibirAtaqueDeFuego(unFogonazo);
        this.accionador.danioPermanente();
        return danioProvocado;
    }

    public double recibirAtaqueDeAgua(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.danioNormal(unAtaque);
    }

    public double recibirAtaqueDeHierba(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.danioNormal(unAtaque);
    }

    public double recibirAtaqueNormal(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.danioNormal(unAtaque);
    }

    public double danioNormal(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.recibirDanio(unAtaque.getPotencia());
    }

    public double superEfectivo(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.recibirDanio(2 * unAtaque.getPotencia());
    }

    public double noMuyEfectivo(Ataque unAtaque) throws PokemonSeDebilitoException {
        return this.recibirDanio( unAtaque.getPotencia() / 2 );
    }

    public double recibirDanio(double cantidadHP) throws PokemonSeDebilitoException {
        try {
            this.accionador.recibirDanio(this, cantidadHP);
        } catch (PokemonSeDebilitoException e) {
            this.accionador.debilitado();
            throw new PokemonSeDebilitoException();
        }
        return cantidadHP;
    }

    public void decrementarHP(double cantidadHP) {
        this.hp -= cantidadHP;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public void aumentarHP(double cantidad) {
        this.hp = this.hp + cantidad;
        if (this.hp > this.hpMax) {
            this.hp = this.hpMax;
        }
    }

    public String getNombreDelModoActual() {
        return this.accionador.getNombreDelModo();
    }
}
