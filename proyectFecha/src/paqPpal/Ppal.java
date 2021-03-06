/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPpal;

import paqAux.Pedir;
import paqFecha.Fecha;

/**
 *
 * @author alumno
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //a)
       Fecha f1=new Fecha(); //f1=01-01-1900
              
       Fecha f2=null;
       try
       {
           f2=new Fecha(20,2,1800);
       }
       catch(IllegalArgumentException e)
       {
           System.out.println("Error al crear f2= 20-02-0001");
           f2=new Fecha();
       }
       
       Fecha f3=Ppal.obligarCrearFechaCorrecta();
       
       Fecha f4=new Fecha(f2);
       System.out.println("Fecha f1= "+f1.toString(2));
       System.out.println("Fecha f2= "+f2.toString(2));
       System.out.println("Fecha f3= "+f3.toString(2));
       System.out.println("Fecha f4= "+f4.toString(2));
        
    //b     
       Fecha f5=null;
       try
       {
           f5=new Fecha(Pedir.pedirEntero("Dime el día "), Pedir.pedirEntero("Dime el mes "), Pedir.pedirEntero("Dime el año "));
       }
       catch(IllegalArgumentException e)
       {
           System.out.println("Error al crear la Fecha f5");
           f5=new Fecha();
       }
        System.out.println("Fecha f5="+f5.toString(2));
  
      //c 
      Fecha f6=null;
       try
       {
           f6=new Fecha(f4.getDia(),f5.getMes(),2000);
       }
       catch(IllegalArgumentException e)
       {
           System.out.println("Error al crear la Fecha f6");
           f6=new Fecha();
       }
        System.out.println("Fecha f6="+f6.toString(2));
       
     //d
     System.out.println("Fecha f1= "+f1.toString(2));
     System.out.println("Fecha f2= "+f2.toString(3));
     System.out.println("Fecha f3= "+f3.toString(4));
     System.out.println("Fecha f4= "+f4.toString(6));
     System.out.println("Fecha f5= "+f5.toString(2));
     System.out.println("Fecha f6= "+f2.toString(5));

     //e
     f4.setFecha(f5);
     
     //f
     f6.setFecha(f1.getDia(),f1.getMes(),f3.getYear());
     
     //g
     System.out.println("Días transcurridos 1-1-1900 hasta f5="+f5.toDias());
    
    //h
    System.out.println("Fecha f3="+f3.toString(3));
    System.out.println("Día siguiente a f3="+f3.fechaSiguiente().toString(3));
   
    //i
    System.out.println("Fecha f5="+f5.toString(3));
    System.out.println("Fecha f4="+f4.toString(3));
    System.out.println("Días transcurridos entre f5 y f4="+f5.diasEntreFechas(f4));    
    
    //j
    System.out.println("Fecha f5="+f5.toString(3));
    System.out.println("Fecha f2="+f2.toString(3));
    System.out.println("Fecha más antigua entre f5 y f2= "+f5.fechaMenor(f2).toString(3));
    
    //k
    System.out.println("Fecha f1="+f1.toString(3));
    System.out.println("Fecha f5="+f5.toString(3));
    System.out.println("Fecha más nueva entre f1 y f5= "+f1.fechaMayor(f5).toString(3));
    
    //l
    System.out.println("Fecha f4="+f4.toString(3));
    System.out.println("Día anterior a f4="+f4.fechaAnterior().toString(3));
   
    //m
    System.out.println("Fecha f4="+f4.toString(3));
    System.out.println("Día siguiente a f4="+f4.fechaSiguiente().toString(3));
    System.out.println("Fecha f3="+f3.toString(3));
    System.out.println("Día anterior a f3="+f3.fechaAnterior().toString(3));
    Fecha f7=new Fecha(f4.fechaSiguiente().fechaMayor(f3.fechaAnterior()));
    System.out.println("Fecha mayor entre f4+1 día y f3-1 día="+f7.toString(3));
    
    }
    
    
    public static Fecha obligarCrearFechaCorrecta()
    {
        Fecha f=null;
        boolean fechaCorrecta=false;
        do{
            try
            {
                int dia=Pedir.pedirEntero("Dime el día ");
                int mes=Pedir.pedirEntero("Dime el mes ");
                int anio=Pedir.pedirEntero("Dime el año ");
                f=new Fecha(dia,mes,anio);
                fechaCorrecta=true;
            }
            catch(IllegalArgumentException ex)
            {
                System.out.println("Error: "+ex.getMessage());
            }
            
        }while(!fechaCorrecta);
        return f;
    }
    
}
