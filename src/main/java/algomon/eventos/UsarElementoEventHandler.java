package algomon.eventos;

import algomon.elemento.Elemento;
import algomon.escenas.EscenaBatalla;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import algomon.juego.Juego;

public class UsarElementoEventHandler implements EventHandler<ActionEvent> {
    private Button usarElemento;
    private Elemento elemento;
    private EscenaBatalla escenaBatalla;
    private Stage stage;
    private int cantidad;

    public UsarElementoEventHandler(Button usarElemento, Elemento elemento, EscenaBatalla escenaBatalla, Stage stage) {
        this.usarElemento = usarElemento;
        this.elemento = elemento;
        this.cantidad = elemento.getCantidad();
        this.usarElemento.setText(elemento.getNombre() + " Cantidad:" + String.valueOf(cantidad));
        this.escenaBatalla = escenaBatalla;
        this.stage = stage;
    }

    public void handle(ActionEvent arg0) {
        Juego.usarElemento(this.elemento);
        Juego.cambioDeTurno();
        this.cantidad = elemento.getCantidad();
        this.usarElemento.setText(elemento.getNombre() + " Cantidad:" + String.valueOf(cantidad));
        this.escenaBatalla.getEscenaSiguiente().disparar();
        this.stage.close();
    }
}
