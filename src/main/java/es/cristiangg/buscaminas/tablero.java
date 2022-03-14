
package es.cristiangg.buscaminas;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Tablero extends GridPane{
    Buscaminas buscaminas;
    LevantarTapas levantadas;
    static final double TAM_FICHA = 50;
    char [][] TapaMinas;
    
    boolean perdido;
    char[][] click;
    char[][] matrizMinas;

   
    public Tablero(Buscaminas buscaminas) {
        this.buscaminas = buscaminas;
        this.setBackground(new Background(
            new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setMinWidth((TAM_FICHA+1) * buscaminas.tamXTablero);
        this.setMinHeight((TAM_FICHA+1) * (buscaminas.tamYTablero + 1));
        this.setMaxWidth((TAM_FICHA+1) * buscaminas.tamXTablero);
        this.setMaxHeight((TAM_FICHA+1) * (buscaminas.tamYTablero + 1));
       
        this.setOnMouseClicked((event) -> {
            int filaX = (int)(event.getX() / 40);
            int columnaY = (int)(event.getY() / 40);
            System.out.println("X " + filaX);
            System.out.println("Y " + columnaY);
        });
       
        
        for(int x=0; x<10; x++) {
            for(int y=0; y<10; y++) {
                if (buscaminas.tablero [x][y] == (char)'.'){
                    Minas ficha = new Minas();
                    this.add(ficha, x, y);                      
                }
                if (buscaminas.tablero [x][y] == (char) '&'){
                    Bombas bomba = new Bombas();
                    TapaBombas tapa = new TapaBombas();
                    this.add(bomba, x, y);
                    this.add(tapa, x, y);                   
                }

            }
        }
    }

}
