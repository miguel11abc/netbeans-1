/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqAux;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Pedir {
    public static int pedirEntero(String mensaje)
    {
        int n=0;
        Scanner teclado=new Scanner(System.in);
        String cadena;
        boolean enteroCorrecto=false;
        do{
          try{
              System.out.print(mensaje);
              cadena=teclado.nextLine();
              n=Integer.parseInt(cadena);
              enteroCorrecto=true;
             }
          catch(NumberFormatException e){
              System.out.println("Error, No es un número entero");
          }
        } while(!enteroCorrecto);
        
        return n;
    }
   
     public static float pedirFloat(String mensaje)
    {
        float n=0;
        Scanner teclado=new Scanner(System.in);
        String cadena;
        boolean floatCorrecto=false;
        do{
          try{
              System.out.print(mensaje);
              cadena=teclado.nextLine();
              n=Float.parseFloat(cadena);
              floatCorrecto=true;
             }
          catch(NumberFormatException e){
              System.out.println("Error, No es un número real");
          }
        } while(!floatCorrecto);
        
        return n;
    }

    public static double pedirDouble(String mensaje)
    {
        double n=0;
        Scanner teclado=new Scanner(System.in);
        String cadena;
        boolean doubleCorrecto=false;
        do{
          try{
              System.out.print(mensaje);
              cadena=teclado.nextLine();
              n=Double.parseDouble(cadena);
              doubleCorrecto=true;
             }
          catch(NumberFormatException e){
              System.out.println("Error, No es un número entero");
          }
        } while(!doubleCorrecto);
        
        return n;
    }

     public static byte pedirByte(String mensaje)
    {
        byte n=0;
        Scanner teclado=new Scanner(System.in);
        String cadena;
        boolean byteCorrecto=false;
        do{
          try{
              System.out.print(mensaje);
              cadena=teclado.nextLine();
              n=Byte.parseByte(cadena);
              byteCorrecto=true;
             }
          catch(NumberFormatException e){
              System.out.println("Error, No es un número byte");
          }
        } while(!byteCorrecto);
        
        return n;
    }

    public static int pedirShort(String mensaje)
    {
        short n=0;
        Scanner teclado=new Scanner(System.in);
        String cadena;
        boolean shortCorrecto=false;
        do{
          try{
              System.out.print(mensaje);
              cadena=teclado.nextLine();
              n=Short.parseShort(cadena);
              shortCorrecto=true;
             }
          catch(NumberFormatException e){
              System.out.println("Error, No es un número entero corto");
          }
        } while(!shortCorrecto);
        
        return n;
    }

    public static long pedirLargo(String mensaje)
    {
        long n=0;
        Scanner teclado=new Scanner(System.in);
        String cadena;
        boolean longCorrecto=false;
        do{
          try{
              System.out.print(mensaje);
              cadena=teclado.nextLine();
              n=Long.parseLong(cadena);
              longCorrecto=true;
             }
          catch(NumberFormatException e){
              System.out.println("Error, No es un número largo");
          }
        } while(!longCorrecto);
        
        return n;
    }

    public static char pedirCaracter(String mensaje)
    {
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.print(mensaje);
        cadena=teclado.nextLine();
        char c=cadena.charAt(0);
        
        return c;
    }

    public static String pedirString(String mensaje)
    {
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.print(mensaje);
        cadena=teclado.nextLine();
                
        return cadena;
    }

}
