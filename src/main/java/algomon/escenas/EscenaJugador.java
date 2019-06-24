package algomon.escenas;

import algomon.entrenador.Entrenador;

public class EscenaJugador implements Escena<EscenaJugador> {
    private Escena<?> escenaSiguiente;
    private EscenaNombrarJugador escenaNombrarJugador;
    private EscenaElegirAlgomones escenaElegirAlgomones;
    private Entrenador entrenador;
    private String nombreEscena;

    public EscenaJugador(String unNombreEscena) {
        this.nombreEscena = unNombreEscena;
        this.entrenador = new Entrenador();
        this.escenaNombrarJugador = new EscenaNombrarJugador(this.nombreEscena, this.entrenador);
        Entrenador entrenador = this.escenaNombrarJugador.getEntrenador();
        this.escenaElegirAlgomones = new EscenaElegirAlgomones(entrenador);
    }

    public void inicializarEscena() {
    }

    public Entrenador getEntrenador() {
        return this.escenaElegirAlgomones.getEntrenador();
    }

    public EscenaJugador getEscena() {
        return this;
    }

    public void disparar() {
        this.escenaNombrarJugador.inicializarEscena();
        this.escenaNombrarJugador.setEscenaSiguiente(this.escenaElegirAlgomones);
        this.escenaNombrarJugador.disparar();
    }

    public void setEscenaSiguiente(Escena<?> unaEscena) {
        this.escenaSiguiente = unaEscena;
        this.escenaElegirAlgomones.setEscenaSiguiente(this.escenaSiguiente);
    }

    public Escena<?> getEscenaSiguiente() {
        return this.escenaSiguiente;
    }
}
