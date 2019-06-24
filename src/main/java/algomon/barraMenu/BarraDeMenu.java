package algomon.barraMenu;

import algomon.aplicacion.Escenario;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;

public class BarraDeMenu {
    public Stage stage;
    private MenuBar menuBar;

    public BarraDeMenu() {
        this.stage = Escenario.stage;
        this.inicialiarMenu();
    }

    public void inicialiarMenu() {
        this.menuBar = new MenuBar();
        //Menu Archivo
        Menu menuArchivo = new Menu("Archivo");
        BarraDeMenuArchivo barraDeMenuArchivo = new BarraDeMenuArchivo(this.stage);
        menuArchivo.getItems().addAll(barraDeMenuArchivo.getColeccionBarraDeMenuArchivo());
        // Menu Editar
        // Menu menuEditar = new Menu("Editar");
        // Menu Ver
        // Menu menuVer = new Menu("Ver");
        this.menuBar.getMenus().addAll(menuArchivo);
    }

    public MenuBar getBarraDeMenu() {
        return this.menuBar;
    }
}
