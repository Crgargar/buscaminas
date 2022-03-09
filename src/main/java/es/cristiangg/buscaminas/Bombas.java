
package es.cristiangg.buscaminas;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Bombas extends Group {
    
    static final double TAM_FICHA = 40;
  
    public Bombas (){
        Circle bomba = new Circle();
        bomba.setRadius(TAM_FICHA / 2);
        bomba.setCenterX(0);
        bomba.setCenterY(0);
        bomba.setFill(Color.ORANGE);
        
        this.getChildren().addAll(bomba);

    }
        
}
