package algomon.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ItemSalirEventHandler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
        System.exit(0);
    }
}
