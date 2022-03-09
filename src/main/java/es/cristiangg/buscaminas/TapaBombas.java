package es.cristiangg.buscaminas;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TapaBombas extends Group{
    
        public TapaBombas() {
        Rectangle tapa = new Rectangle (49, 47);
        tapa.setX(0);
        tapa.setY(0);
        tapa.setStroke(Color.TOMATO);

        
        this.getChildren().addAll(tapa);
    }
    
}
