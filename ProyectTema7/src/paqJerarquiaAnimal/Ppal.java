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
        Animal a=new Animal();
        a.comer();
        a.dormir();
        a.reproducir();
        
        
        System.out.println("----MAMÍFERO---");
        Mamifero ballena=new Mamifero();
        ballena.comer();
        ballena.dormir();
        ballena.reproducir();
        
        System.out.println("-----PERRO----------");
        Perro toby=new Perro();
        toby.comer();
        toby.dormir();
        toby.reproducir();
        toby.ladrar();
        toby.grunir();
        
        Animal b=new Animal();
        b=ballena;
        
        System.out.println("b se transforma en BALLENA-----------");
        b.comer();
        b.dormir();
        b.reproducir();
        
        b=toby;
        System.out.println("b se transforma en TOBY---------------");
        b.comer();
        b.dormir();
        b.reproducir();
        //b.ladrar(); b no puede acceder a métodos específicos de Perro
        //b.grunir();
        
    }
    
}
