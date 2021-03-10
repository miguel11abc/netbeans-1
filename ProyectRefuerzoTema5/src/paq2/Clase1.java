/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq2;

/**
 *
 * @author Profesor
 */
public class Clase1 {
   int p1,p2;

    public Clase1(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
   
    public void modificar(Clase1 other)
                                //other=obj2
    {
        other.p1=this.p1+1; //obj2.p1=obj1.p1+1=3+1=4
        other.p2=this.p2+1;// obj2.p2=2+1=3
    }
}
