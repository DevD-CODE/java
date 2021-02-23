import java.io.File;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class media extends Application {    

    @Override
    public void start(Stage stage) throws Exception {
        final String name = "video.mp4";
        File archivo = new File(name);
        
        Media video = new Media(archivo.toURI().toString());
        MediaPlayer reproductor = new MediaPlayer(video);
        MediaView ventana = new MediaView(reproductor);
        reproductor.setAutoPlay(true);
        
        Group escenario = new Group();
        escenario.getChildren().add(ventana);
        Scene escena = new Scene(escenario, 500, 400);
        stage.setScene(escena);
        stage.setTitle("video");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}