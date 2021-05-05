/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectinterfaces;

/**
 *
 * @author Profesor
 */
public class Mesa implements CallBack, C{

    public Mesa() {
    }
    
    @Override
    public void callback(int n){
        System.out.println(n*2);
    }
    
    @Override
    public void metodoA(){
        System.out.println("Método A de la interface A de Mesa");
    }
    
    @Override
    public void metodoB(){
        System.out.println("Método B de la interface B de Mesa");
    }
    
    @Override
    public void metodoC(){
        System.out.println("Método C de la interface C de Mesa");
    }
    
    @Override
    public String toString()
    {
        return "Mesa";
    }
}
