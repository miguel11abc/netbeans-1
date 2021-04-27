/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

import paqEnumeraciones.GeneroPelis;
import paqExcepciones.DuracionPeliculaException;
import paqExcepciones.IdiomaPeliculaException;
import paqExcepciones.NumeroNegativoException;
import paqSubClases.Pelicula;

/**
 *
 * @author Profesor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneroPelis g1;
        g1=GeneroPelis.DRAMA;
        System.out.println("g1="+g1.toString());
        
        switch(g1)
        {
            case ACCION: break;
            case FICCION: break;
        }
        
        String nombre=g1.name();
        System.out.println("Género de g1="+nombre);
        
        System.out.println("índice que ocupa la constante ="+g1.ordinal());
        
        GeneroPelis g2=GeneroPelis.DRAMA;
        int comp=g1.compareTo(g2);
        System.out.println("comp"+comp);
        
        System.out.println("DISTINTOS GÉNEROS:");
        for(GeneroPelis p:GeneroPelis.values())
            System.out.println("-"+p);
        
        GeneroPelis g3=GeneroPelis.valueOf("INFANTIL");
        System.out.println("g3= "+g3);
        GeneroPelis g4=GeneroPelis.INFANTIL;
        System.out.println("g4="+g4);
        try{
            GeneroPelis g5=GeneroPelis.valueOf("DDAMA");
        }
        catch(IllegalArgumentException t)
        {
            System.out.println("Error ");
        }
        
        Pelicula p;
        try{
            p=new Pelicula("ESPAÑOL",45,"INFANTILo","PETER PAN");
            System.out.println("Película p="+p);
        }        
        catch(IdiomaPeliculaException c){
           p=new Pelicula("INGLÉS",120,"INFANTIL","PETER PAN"); 
            System.out.println("p corregido con IDIOMA INGLÉS "+p);
        }
        catch(DuracionPeliculaException c){
           p=new Pelicula("ESPAÑOL",120,"INFANTIL","PETER PAN"); 
            System.out.println("p corregido con la duración "+p);
        }
        catch(IllegalArgumentException tp){
            System.out.println(tp.getMessage());
        }
        
        
        String alumnos[]=new String[25];
        alumnos[0]="Frank";
        alumnos[1]="Rodrigo";
        //System.out.println(alumnos[3].length());//NullPointerException
        
        String a="Pepe";
        //int n=Integer.parseInt(a); //NumberFormatException      
       
        try{
         char c=caracterEn("Pepe",20); //StringIndexOutBoundsException
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        /*
        try{
            prueba9();
        }catch(NumeroNegativoException t)
        {
           t.printStackTrace();
        }
        */ 
         double[] notas=new double[4];
         try{
             double d=devuelveReal(notas,2);
             System.out.println("La tercera nota es "+d);
         }catch(Exception e)
         {
           System.out.println(e.getMessage());
         }
        
        }
        
       public static char caracterEn(String cadena, int n) throws Exception{
           if (n< cadena.length()){
               char c=cadena.charAt(n);
               return c;
           }
           throw new Exception("Error, el índice "+n+" está fuera de rango");
       }
    
       public static void prueba9() throws NumeroNegativoException
       {
           throw new NumeroNegativoException("Mensaje de NúmeroNegativoException");
       }
       
       public static double devuelveReal(double r[], int indice) throws Exception{
          try{ 
           if (indice>=0 && indice <= r.length )
               return r[indice];
           else
               throw new RuntimeException("Error, índices" );
          }catch(RuntimeException q){
              throw q;
          } 
       }
    }
    

