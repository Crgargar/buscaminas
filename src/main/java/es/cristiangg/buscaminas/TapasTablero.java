
package es.cristiangg.buscaminas;

public class TapasTablero {
    
    short tamXTapas;
    short tamYTapas;
    final char liso = '-';
    char[][] tableroTapa;
    char[][] tapaslevantadas;
    final char bomba = '*';

    public TapasTablero() {

    tamXTapas = 10;
    tamYTapas = 10;
    
        tableroTapa = new char[tamXTapas][tamYTapas];
        for (int x = 0; x <tamXTapas; x++) {
            for (int y = 0; y < tamYTapas; y++) {
                tableroTapa[x][y] = liso;
            }
        }
    }
   
    public void mostrarTapasConsola() {
        for(int y=0; y<tamYTapas; y++) {
            for(int x=0; x<tamXTapas; x++) {
                
                System.out.print(tableroTapa[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
//        levantadas((int) cordX1 ,(int) cordY1);
    }
        
    public void levantadas (int cordX1, int cordY1){
        tableroTapa [cordX1][cordY1] =  bomba;
            System.out.println("levantada");
        
    } 
}
