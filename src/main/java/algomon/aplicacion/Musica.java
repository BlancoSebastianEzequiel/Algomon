package algomon.aplicacion;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Musica {
    private Media media;
    private static MediaPlayer mediaPlayer;

    public Musica(String nombreDelTema) {
        this.media = new Media(new File(nombreDelTema).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
    }

    public static void play() {
        mediaPlayer.play();
    }

    public static void parar() {
        mediaPlayer.stop();
    }
}
