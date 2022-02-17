
package es.cristiangg.buscaminas;


public class buscaminas {
    
    
    short tamXTablero;
    short tamYTablero;
    char[][] tablero;
    
    final char JUGADOR1 = '1';
    final char JUGADOR2 = '2';
    final char VACIO = '.';
    char turnoJugador = JUGADOR1;
    
    // Método constructor
    public buscaminas() {  
        tamXTablero = 7;
        tamYTablero = 6;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                tablero[x][y] = VACIO;
            }
        }
    }   
    
//        public buscaminas(short tamX, short tamY) {  
//        tamXTablero = tamX;
//        tamYTablero = tamY;
//        tablero = new char[tamXTablero][tamYTablero];
//        for(int x=0; x<tamXTablero; x++) {
//            for(int y=0; y<tamYTablero; y++) {
//                tablero[x][y] = VACIO;
//            }
//        }
//    } 
        
        public void mostrarTableroConsola() {
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
    }
        
            public boolean colocarmina (int columna) {        
        if(columna >= 0 && columna < tamXTablero) {
            int bomba = this.buscamina(columna);
            if(bomba != -1) {
                tablero[columna][bomba] = turnoJugador;                
                return true;
            } else {
                // La columna está llena de fichas
                return false;
            }
        } else {
            // Se ha intentado colocar en una columna inexistente
            return false;
        }
    }
            
                public int buscamina(int columna) {
        int fila = 0;
        while(fila < tamYTablero && tablero[columna][fila] == VACIO) {
            fila++;
        }
        return fila-1;
    }
                
        public void cambiarTurnoJugador() {
        if(turnoJugador == JUGADOR1) {
            turnoJugador = JUGADOR2;
        } else {
            turnoJugador = JUGADOR1;
        }
    }
     
}
