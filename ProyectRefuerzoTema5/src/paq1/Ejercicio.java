/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paq1;

/**
 *
 * @author Profesor
 */
public class Ejercicio {
 public static void main(String [ ] args){
  Clase1 obj1=new Clase1(); //valor=9.8, x=7
 
  obj1.imprimir(24.3,5);// obj1.valor=9.8 obj1.x=7
  
  obj1.setX(888);
  
  obj1.imprimir(-2, 0);// -2, 888
 }  
}
