/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqJerarquiaAnimal;

/**
 *
 * @author Profesor
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal ballena=new Animal();
        ballena.comer();
        ballena.dormir();
        ballena.reproducir();
        
        System.out.println("----HUMANO---");
        Mamifero humano=new Mamifero();
        humano.comer();
        humano.dormir();
        humano.reproducir();

    }
    
}
