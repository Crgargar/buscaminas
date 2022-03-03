package es.cristiangg.buscaminas;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Minas extends Group {
    
    double posX;
    double posY;
    
    public Minas() {
        Rectangle bloques = new Rectangle (49, 47);
        bloques.setX(0);
        bloques.setY(0);
        bloques.setStroke(Color.RED);

        
        this.getChildren().addAll(bloques);
    }
        
    public void setPosX(double posX) {
        this.posX = posX;
        this.setLayoutX(this.posX);
    }
        
    public void setPosY(double posY) {
        this.posY = posY;  
        this.setLayoutY(this.posY);
    }

   }

