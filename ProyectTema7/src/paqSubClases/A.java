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
public class A {
    int i,j;
    
    public A(int i, int j){
        this.i=i;
        this.j=j;
    }
    
    public int sumaIJ()
    {
        return this.i+this.j;
    }

    @Override
    public String toString() {
        return "A{" + "i=" + this.i + ", j=" + this.j + '}';
    }
            
    
            
}
