package paqClases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class Punto {
   private int x,y;

    public Punto() {
        this(0,0);
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    public Punto(int x){
        this(x,x);
    }
    
    public Punto(Punto other)
    {
        this(other.x,other.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(Punto other)
    {
        return Math.hypot(this.x-other.x, this.y-other.y);
    }
    
    
    @Override
    public String toString() {
        return "(" +  x + "," + y + ')';
    }
    
    public boolean equals(Punto other)
    {
        if (this.x==other.x && this.y==other.y)
            return true;
        else
            return false;
    }
    
}
