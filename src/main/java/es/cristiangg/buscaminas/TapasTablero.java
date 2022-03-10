
package es.cristiangg.buscaminas;

public class TapasTablero {
    
    short tamXTapas;
    short tamYTapas;
    final char liso = '-';
    char[][] tableroTapa;
    char[][] tapasBombas;


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
    }
        
       public void BombasTapas (int cordX1, int cordY1){
        tapasBombas = new char[tamXTapas][tamYTapas];
        if (tapasBombas [cordX1][cordY1] == '-'){
            System.out.println("Pintado");
        }
        
    } 
}
