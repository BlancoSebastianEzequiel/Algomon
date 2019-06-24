package algomon.eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class ItemMaximizarEventHandler implements EventHandler<ActionEvent> {
    private Stage stage;
    private MenuItem menuItemMaximizar;

    public ItemMaximizarEventHandler(Stage unStage, MenuItem unMenuItemMaximizar) {
        this.stage = unStage;
        this.menuItemMaximizar = unMenuItemMaximizar;
    }

    public void handle(ActionEvent event) {
        if (this.stage.isMaximized()) {
            this.stage.setMaximized(false);
            this.menuItemMaximizar.setText("Maximizar");
        } else {
            this.stage.setMaximized(true);
            this.menuItemMaximizar.setText("Minimizar");
        }
    }
}
