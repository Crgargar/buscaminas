package es.cristiangg.buscaminas;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    BorderPane paneRoot;
    short X = 0;
    short Y = 0;
    
    @Override
    public void start(Stage stage) {
        
        short tamXPantalla = 640;
        short tamYPantalla = 480;
        
        paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, tamXPantalla, tamYPantalla);
        stage.setScene(scene);
        stage.show();
    
        
        Buscaminas buscaminas = new Buscaminas();
        buscaminas.mostrarTableroConsola();        
        buscaminas.hayMina(3 ,3);
        System.out.println(" " + buscaminas);
        
        TapasTablero tapastablero = new TapasTablero();
        tapastablero.mostrarTapasConsola();
        
        Tablero tablero = new Tablero(buscaminas);
        paneRoot.setCenter(tablero);
        Y = (short) tablero.columnaY;
        X = (short) tablero.filaX;
        tapastablero.levantadas((short) tablero.filaX, (short) tablero.columnaY);
        tapastablero.mostrarTapasConsola();
    }

    public static void main(String[] args) {
        launch();
    }

}


