
package EjercicioTablero;

public class Tablero {
    private int x , y;

    public Tablero(int y, int x) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    public void moverArriba(){
    y = y+1;
        }
    public void moverAbajo(){
        y-=1;
    }
    public void moverDerecha(){
        x+=1;
    }
    public void moverIzquierda(){
        x-=1;
    }
    
    
    
   
        
    }
