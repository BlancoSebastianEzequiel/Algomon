package algomon.escenas;

public interface Escena<T extends Escena<T>> {
    public T getEscena();

    public void disparar();

    public void setEscenaSiguiente(Escena<?> unaEscena);

    public Escena<?> getEscenaSiguiente();

    public void inicializarEscena();
}
