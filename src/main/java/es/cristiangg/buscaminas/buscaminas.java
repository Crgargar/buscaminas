
package es.cristiangg.buscaminas;


import java.util.Random;


public class Buscaminas {
   
    int numeroMinas = 0;
    short tamXTablero;
    short tamYTablero;
    final char punto = '.';
    final char bomba = '&';
    char[][] tablero;
    Random random = new Random();
    char [][] click;
    char [][] matrizMinas;
    char [][] tapasBombas;
    boolean perdido;

   
    // Método constructor
    public Buscaminas() {
        
        tamXTablero = 10;
        tamYTablero = 10;
        tablero = new char[tamXTablero][tamYTablero];
        for (int x = 0; x <tamXTablero; x++) {
            for (int y = 0; y < tamYTablero; y++) {
                tablero[x][y] = punto;
            }
        }
        
        for (int i=0; i<10; i++) {
                int posX = random.nextInt(10);
                int posY = random.nextInt(10);
                tablero[posX][posY] = bomba;
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
   
    public void hayMina (int cordX, int cordY){
        matrizMinas = new char[tamXTablero][tamYTablero];
        if (matrizMinas [cordX][cordY] == '&'){
            System.out.println("Has muerto");
            perdido = true;
        }else{
            click = new char[tamXTablero][tamYTablero];
            click [cordX][cordY] = '.';
            System.out.print("Sigue jugando"); 
        }
    }
    
                
}
