/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectanominainterna;

/**
 *
 * @author Profesor
 */
public class ProyectAnominaInterna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maquina antonio=new Maquina();
        antonio.arrancar();
        
        Maquina sanchez=new Maquina()
        {
            @Override public void arrancar(){
                System.out.println("Parando...");
            }
        };
         
        sanchez.arrancar();
        
        Maquina tractor=new Maquina();
        tractor.arrancar();
        
        Robot robotito=new Robot(8);
        
    }
    
}
