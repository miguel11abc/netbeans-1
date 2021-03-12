/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectcuestionariotema5;

/**
 *
 * @author Profesor
 */
public class ProyectCuestionarioTema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //int n;
    int [] x = new int[2];
    int k=4;
    x[0]=6;
    x[1]=8;
    System.out.println("Antes: " + k + " " + x[0] +" "+ x[1]);
    ProyectCuestionarioTema5.cambiar(k, x);
    System.out.println("Despues: " + k + " " + x[0] +" "+ x[1]);
    
    
    Ejemplo ej=new Ejemplo();
        System.out.println("ej="+ej);
    
    
    }

    public static void cambiar (int p, int [] q) {
        p = 10;
        q[0] = 12;
        q[1] = 14;
        System.out.println("Dentro: " + p + " " + q[0] +" "+ q[1]);
    }
   
    
}
