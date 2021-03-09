/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectteatro;

import java.util.ArrayList;
import paqClases.Funcion;
import paqClases.Teatro;

/**
 *
 * @author Profesor
 */
public class ProyectTeatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Funcion f1=new Funcion("Star Wars I",12.3f);
      Funcion f2=new Funcion("La casa de Bernarda Alba",4.5f);
      Funcion f3=new Funcion("El gato con botas",12.4f);
      
      System.out.println("f1="+f1);
      System.out.println("f2="+f2);
      System.out.println("f3="+f3);
      
     
      ArrayList <Funcion> ej=new ArrayList();
      ej.add(f1);
      ej.add(f2);
      ej.add(f3);
      
        System.out.println("--------EJ--------    ");
        for (int i = 0; i < ej.size(); i++) {
            System.out.println(ej.get(i));
        }
      
      System.out.println("-----EJ con foreach--------");  
      for(Funcion f : ej)
            System.out.println(f);
      
      System.out.println("\n\n-----CONTAINS------");
      if (ej.contains(f1)) 
            System.out.println(f1+" SI está en el ArrayList ej");
      else
            System.out.println(f1+" NO existe en ej");
      
     System.out.println("------ ELIMINAR UNA FUNCION DE EJ la F1------");
     ej.remove(f1);
     
     
     // Teatro azorin=new Teatro("Azorín",ej);
     
     
      System.out.println("-------ROMEA--------");
      Teatro r=new Teatro("Romea");
      System.out.println("Teatro r="+r);
      r.addFuncion(f1);
      r.addFuncion(f2);
      r.addFuncion(f3);
      
      System.out.println("----TEATRO COMPLETO r---="+r);
      
      System.out.println("------- ROMEA CONTIENE F1------");
      if (r.contieneFuncion(f1))
            System.out.println("El Teatro "+r.getNombre()+" contiene "+f1);
      else
            System.out.println(f1+" NO aparece en "+r.getNombre());
      
      
       System.out.println("----ROMEA ELIMINA F1----");
       if (r.eliminarFuncion(f1))
            System.out.println("Eliminada");
       else
            System.out.println("No eliminada");
        System.out.println("r= "+r);
    }
    
}
