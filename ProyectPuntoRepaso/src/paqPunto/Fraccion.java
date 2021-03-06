/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPunto;

/**
 *
 * @author isabel
 */
public class Fraccion {
    private int num,den;

    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
        this.reducir();
    }

    public int getNum() {
        return this.num;
    }

    public int getDen() {
        return this.den;
    }

    public void setNum(int num) {
        this.num = num;
        this.reducir();
    }

    public void setDen(int den) {
        this.den = den;
        this.reducir();
    }

    @Override
    public String toString() {
        return "{" +  this.num + "/" + this.den + '}';
    }
    
    public static int mcd(int n1, int n2)
    {
       int mc=1;
       int mn=(n1<n2)?n1:n2;
       for(int i=2; i<=mn; i++)
           if (n1%i==0 && n2%i==0) mc=i;
       
       return mc;
    }
    
    
    public void reducir()
    {
        int m=Fraccion.mcd(this.num, this.den);
        this.num=this.num/m;
        this.den=this.den/m;
    }
        
}
