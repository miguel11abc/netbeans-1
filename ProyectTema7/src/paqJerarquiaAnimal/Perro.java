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
public class Perro extends Mamifero{
    @Override
    public void dormir()
    {
        System.out.println("El perro debe dormir");
    }
    
    public void ladrar()
    {
        System.out.println("Guau guau");
    }
    
    public void grunir()
    {
        System.out.println("GRRR....");
    }
}
