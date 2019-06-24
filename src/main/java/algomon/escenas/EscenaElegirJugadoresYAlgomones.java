package algomon.escenas;

import algomon.entrenador.Entrenador;

public class EscenaElegirJugadoresYAlgomones implements Escena<EscenaElegirJugadoresYAlgomones> {
    private EscenaJugador escenaPrimerJugador;
    private EscenaJugador escenaSegundoJugador;
    private Escena<?> escenaSiguiente;

    public void inicializarEscena() {
        this.escenaPrimerJugador = new EscenaJugador("Crear primer jugador");
        this.escenaSegundoJugador = new EscenaJugador("Crear segundo jugador");
    }

    public Entrenador getPrimerEntrenador() {
        return this.escenaPrimerJugador.getEntrenador();
    }

    public Entrenador getSegundoEntrenador() {
        return this.escenaSegundoJugador.getEntrenador();
    }

    public EscenaElegirJugadoresYAlgomones getEscena() {
        return this;
    }

    public void disparar() {
        this.escenaPrimerJugador.inicializarEscena();
        this.escenaPrimerJugador.setEscenaSiguiente(this.escenaSegundoJugador);
        this.escenaPrimerJugador.disparar();
    }

    public void setEscenaSiguiente(Escena<?> unaEscena) {
        this.escenaSiguiente = unaEscena;
        this.escenaSegundoJugador.setEscenaSiguiente(this.escenaSiguiente);
    }

    public Escena<?> getEscenaSiguiente() {
        return this.escenaSiguiente;
    }
}
