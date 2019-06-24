package algomon.barraMenu;

import java.util.ArrayList;
import java.util.Collection;

import algomon.eventos.ItemMaximizarEventHandler;
import algomon.eventos.ItemSalirEventHandler;

import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class BarraDeMenuArchivo {
    private Collection<MenuItem> colecionDeItemsMenuArchivo;
    public Stage stage;

    public BarraDeMenuArchivo(Stage unStage) {
        this.stage = unStage;
        this.colecionDeItemsMenuArchivo = new ArrayList<MenuItem>();
        this.inicializarMenu();
    }

    protected void inicializarMenu() {
        MenuItem menuItemMaximizar = new MenuItem("Maximizar/Minimizar");
        ItemMaximizarEventHandler itemMaximizarEventHandler = new ItemMaximizarEventHandler(this.stage, menuItemMaximizar);
        menuItemMaximizar.setOnAction(itemMaximizarEventHandler);
        MenuItem menuItemSalir = new MenuItem("Salir");
        ItemSalirEventHandler miItemSalirEventHandler = new ItemSalirEventHandler();
        menuItemSalir.setOnAction(miItemSalirEventHandler);
        this.colecionDeItemsMenuArchivo.add(menuItemMaximizar);
        this.colecionDeItemsMenuArchivo.add(menuItemSalir);
    }

    public Collection<MenuItem> getColeccionBarraDeMenuArchivo() {
        return this.colecionDeItemsMenuArchivo;
    }
}
