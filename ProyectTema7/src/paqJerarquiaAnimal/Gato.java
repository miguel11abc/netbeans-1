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
public class Gato extends Mamifero{
    @Override
    public void comer(){
        System.out.println("El gato come pescado..."); 
    }
    
    public void hacerRuido()
    {
        System.out.println("Miau..");
    }
}
