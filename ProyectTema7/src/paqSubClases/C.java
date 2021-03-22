/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqSubClases;

/**
 *
 * @author Profesor
 */
public class C extends A{

    public C(int i, int j) {
        super(i, j);
    }
    
    public void visualizaIJ()
    {
        System.out.println("i="+super.i+" , j="+super.j);
    }
    
    @Override
    public String toString()
    {
        return "Método sobreescrito en C= "+this.i+","+this.j;
    }
    
    @Override
    public int sumaIJ()
    {
        return this.i*this.j;
    }
}
