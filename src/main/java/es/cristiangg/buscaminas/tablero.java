
package es.cristiangg.buscaminas;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Tablero extends GridPane{
    Buscaminas buscaminas;
    static final double TAM_FICHA = 50;

   
    public Tablero(Buscaminas buscaminas) {
        this.buscaminas = buscaminas;
        this.setBackground(new Background(
            new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
        this.setMinWidth(TAM_FICHA * buscaminas.tamXTablero);
        this.setMinHeight(TAM_FICHA * (buscaminas.tamYTablero + 1));
        this.setMaxWidth(TAM_FICHA * buscaminas.tamXTablero);
        this.setMaxHeight(TAM_FICHA * (buscaminas.tamYTablero + 1));
       
        this.setOnMouseClicked((event) -> {
            int filaX = (int)(event.getX() / 40);
            int columnaY = (int)(event.getY() / 40);
            System.out.println("X " + filaX);
            System.out.println("Y " + columnaY);
        });
       
        
        for(int x=0; x<10; x++) {
            for(int y=0; y<10; y++) {
                if (Buscaminas.tablero [x][y] == '&'){
                    Minas ficha = new Minas();
                    this.add(ficha, x, y);
            }else{
            Buscaminas.tablero [x][y] = '.';
            
            }
            }
        }

    }
       
    public void fichaHueco (){
        Circle circleExterior = new Circle();
        circleExterior.setRadius(TAM_FICHA / 2);
        circleExterior.setFill(Color.BEIGE);
    }
    

//    ficha.setLayoutX(0);
//    ficha.setLayoutY();
}
