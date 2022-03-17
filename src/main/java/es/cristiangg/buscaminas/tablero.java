package es.cristiangg.buscaminas;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Tablero extends GridPane{
    GenerarMinas buscaminas;
    static final double TAM_FICHA = 50;
    char [][] TapaMinas;
   
    boolean perdido;
    char[][] click;
    char[][] matrizMinas;
    int filaX;
    int columnaY;
//    char [][] almacentapas;
    
    Tapas [][] tapastablero = new Tapas[10][10];
//    char [][] tapas;
    //    Minas tapa = new Minas ();
//    int tapa = 1;
    
//    char [][] numeros = new char [5][5];

    
    public Tablero(GenerarMinas buscaminas, TapasTablero tapasTablero) {
        this.buscaminas = buscaminas;
        this.setBackground(new Background(
            new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setMinWidth((TAM_FICHA+1) * buscaminas.tamXTablero);
        this.setMinHeight((TAM_FICHA+1) * (buscaminas.tamYTablero + 1));
        this.setMaxWidth((TAM_FICHA+1) * buscaminas.tamXTablero);
        this.setMaxHeight((TAM_FICHA+1) * (buscaminas.tamYTablero + 1));
       
       
//        this.setOnMouseClicked((event) -> {
//            filaX = (int)(event.getX() / 40);
//            columnaY = (int)(event.getY() / 40);
//            System.out.println("X " + filaX);
//            System.out.println("Y " + columnaY);
//            tapasTablero.levantadas((short) filaX,(short) columnaY);
//            tapasTablero.mostrarTapasConsola();
//            tapastablero [filaX][columnaY].setVisible(false);
            
//        });        
            

        for(int x=0; x<10; x++) {
            for(int y=0; y<10; y++) {
                if (buscaminas.tablero [x][y] == (char)'.'){
                    Tapas tapa = new Tapas();
                    this.add(tapa, x, y); 
                    tapastablero [x][y] = tapa;

                }
                if (buscaminas.tablero [x][y] == (char) '&'){
                    Bombas bomba = new Bombas();
                    Tapas tapa = new Tapas();
                    this.add(bomba, x, y);
                    this.add(tapa, x, y);
                    tapastablero [x][y] = tapa;

//        tapastablero [filaX][columnaY].setVisible(false);

                    //quieres guardar la tapa en tapastablero en los [][] de x y y
//                    tapastablero [x][y] = tapa;  
                    
                }

            }
        }
        
        this.setOnMouseClicked((event) -> {
            filaX = (int)(event.getX() / 50);
            columnaY = (int)(event.getY() / 50);
            System.out.println("X " + filaX);
            System.out.println("Y " + columnaY);
            tapasTablero.levantadas((short) filaX,(short) columnaY);
            tapasTablero.mostrarTapasConsola();
            tapastablero [filaX][columnaY].setVisible(false);

        });

    }
   

}
