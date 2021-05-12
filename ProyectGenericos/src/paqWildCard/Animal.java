/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqWildCard;

/**
 *
 * @author Profesor
 */
public class Animal extends SerVivo{

    public Animal(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Animal{" +super.toString()+ '}';
    }
    
}
