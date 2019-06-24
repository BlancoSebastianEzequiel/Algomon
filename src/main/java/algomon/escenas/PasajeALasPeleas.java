package algomon.escenas;

import algomon.entrenador.Entrenador;
import algomon.juego.Juego;

public class PasajeALasPeleas implements Escena<PasajeALasPeleas> {
    private EscenaBatalla escenaBatalla1;
    private EscenaBatalla escenaBatalla2;
    private Entrenador entrenador1;
    private Entrenador entrenador2;

    public PasajeALasPeleas(Entrenador entrenador1, Entrenador entrenador2) {
        Juego.comenzarBatalla(entrenador1, entrenador2);
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void inicializarEscena() {
        this.escenaBatalla1 = new EscenaBatalla(this.entrenador1, this.entrenador2);
        this.escenaBatalla2 = new EscenaBatalla(this.entrenador2, this.entrenador1);
        this.escenaBatalla1.inicializarEscena();
        this.escenaBatalla2.inicializarEscena();
        this.escenaBatalla1.setEscenaSiguiente(escenaBatalla2);
        this.escenaBatalla2.setEscenaSiguiente(escenaBatalla1);
    }

    public PasajeALasPeleas getEscena() {
        return null;
    }

    public void disparar() {
        this.escenaBatalla1.disparar();
    }

    public void setEscenaSiguiente(Escena<?> unaEscena) {
        // TODO Auto-generated method stub
    }

    public Escena<PasajeALasPeleas> getEscenaSiguiente() {
        return this;
    }
}
