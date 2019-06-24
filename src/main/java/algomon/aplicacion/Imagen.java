package algomon.aplicacion;

import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;

public class Imagen {
    private ImageView vistaImagen;
    private Image imagenDeFondo;

    public Imagen(String unaCadena) {
        this.imagenDeFondo = new Image(unaCadena);
        this.vistaImagen = new ImageView();
        this.vistaImagen.setImage(imagenDeFondo);
    }

    public Imagen(String unaCadena, double ancho, double largo, boolean b, boolean c) {
        this.imagenDeFondo = new Image(unaCadena, ancho, largo, b, c);
        this.vistaImagen = new ImageView();
        this.vistaImagen.setImage(imagenDeFondo);
    }

    public void setEffect(Effect unEfecto) {
        this.vistaImagen.setEffect(unEfecto);
    }

    public void setScaleX(double unNumero) {
        this.vistaImagen.setScaleX(unNumero);
    }

    public void setScaleY(double unNumero) {
        this.vistaImagen.setScaleY(unNumero);
    }

    public ImageView getImagenView() {
        return this.vistaImagen;
    }

    public Background getAsBackgroundImage() {
        BackgroundImage backgroundImage = new BackgroundImage(this.imagenDeFondo, null, null, null, null);
        return new Background(backgroundImage);
    }
}
