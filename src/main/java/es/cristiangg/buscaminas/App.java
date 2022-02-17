package es.cristiangg.buscaminas;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 640;
        short tamYPantalla = 480;
        
        Pane paneRoot = new Pane();
        var scene = new Scene(paneRoot, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
        
        buscaminas buscamina = new buscaminas();
               
        Random random = new Random();
        for(int i=0; i<20; i++) {
            int col = random.nextInt(7);
            if(buscamina.colocarmina(col)) {
                buscamina.cambiarTurnoJugador();
            }
                buscamina.mostrarTableroConsola();

        }

    }
}
