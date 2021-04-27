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
public class ProyectInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente c=new Cliente(1,"Cintia");
       System.out.println("c="+c);
       System.out.println("Nombre de c "+c.getNombre()); 
       c.callback(2);
       
       CallBack l=c; //la interface l apunta al objeto c
       l.callback(3); //del cliente c
       System.out.println("interface l= "+l);
       System.out.println("id de l= "+((Cliente)l).getId());
       
       CallBack v=new Coche("3456DCS",1);
       System.out.println("La interface v apunta al coche "+v);
       v.callback(2);
       System.out.println("Matrícula del coche donde apunta v "+((Coche)v).getMatricula());
        
              
    }
    
}
