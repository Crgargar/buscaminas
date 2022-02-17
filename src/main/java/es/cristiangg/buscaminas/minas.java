package es.cristiangg.buscaminas;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class minas extends Group {
        
    static final double MINAS = 10;
    
    public minas() {
        Circle circleExterior = new Circle();
        circleExterior.setRadius(MINAS / 2);
        circleExterior.setFill(Color.WHITE);
        circleExterior.setCenterX(0);
        circleExterior.setCenterY(0);
        circleExterior.setStroke(Color.DARKGRAY);
        
    }
}
