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
        tapastablero.levantadas(5, 5);
        tapastablero.mostrarTapasConsola();
        
        Tablero tablero = new Tablero(buscaminas);
        paneRoot.setCenter(tablero);               

    }

    public static void main(String[] args) {
        launch();
    }

}


