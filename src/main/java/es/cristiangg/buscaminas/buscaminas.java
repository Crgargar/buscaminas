
package es.cristiangg.buscaminas;


import java.util.Random;


public class buscaminas {
   
    int numeroMinas = 0;
    short tamXTablero;
    short tamYTablero;
    final char punto = '.';
    final char bomba = '&';
    char[][] tablero;
   
    Random random = new Random();
    int posX = random.nextInt(10);
    int posY = random.nextInt(10);

   
    // Método constructor
    public buscaminas() {
        tamXTablero = 10;
        tamYTablero = 10;
        tablero = new char[tamXTablero][tamYTablero];
        for (int x = 0; x <tamXTablero; x++) {
            for (int y = 0; y < tamYTablero; y++) {
                         
                tablero[x][y] = punto;

            }
        }
//            public void minas (){
        for (int x=0; x<5; x++) {
            for (int y=0; y<5; y++) {
                int posX = random.nextInt(10);
                int posY = random.nextInt(10);
                tablero[posX][posY] = bomba;
                
            }
        }
    
    }
     


       
   
    public void mostrarTableroConsola() {
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
    }
   

         
}
