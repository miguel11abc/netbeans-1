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
public class B extends A{
    int k;
    //int i;
    

    public B(int k, int i, int j)
    {
       // this.k=k;
        super(i,j);
        /*
          this.i=i;
          this.j=j;
          super.i=i;
          super.j=j;
        */        
        this.k=k;
        
    }

    @Override
    public String toString() {
       // return "B{" + "k=" + this.k +"i=" +super.i+" j="+super.j+'}';
       return "B{k="+this.k+super.toString()+"}";
    }
    
    public int sumaIJK()
    {
        return super.sumaIJ()+this.k;
        //return super.i+super.j+this.k;
    }
    
    
    
    
}
