/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqClases;

/**
 *
 * @author Profesor
 */
public class Nie {
  private String nie;
  private final static String Letras="TRWAGMYFPDXBNJZSQVHLCKE";  
  
  // X+7digitos+Letra control
  // Y+7digitos+Letra de control
  // Z+7digitos+Letra de control
  
  //X1234567M -> 01234567M
  //Y1234567M -> 11234567M
  //Z1234567M -> 21234567M

    public Nie(String nie)throws IllegalArgumentException
    {
        nie=nie.trim().toUpperCase();
        char primeraLetra=nie.charAt(0);
        switch(primeraLetra)
        {
            case 'X': nie=nie.replace('X','0'); break;
            case 'Y': nie=nie.replace('Y','1'); break;
            case 'Z': nie=nie.replace('Z','2'); break;
            default: 
             throw new IllegalArgumentException("El nie debe comenzar por X, Y o Z");
        }
        
        if (nie.length() > 9)
            throw new IllegalArgumentException("Error, longitud de nie incorrecta");
        
        String strDni=nie.substring(0, nie.length()-1);
              
        /*
        if (nie.length()< 9)
        {
          int longitud=nie.length()-1;                       
          for(int i=longitud; i<7;i++)
             strDni='0'+strDni;      
        }
         */
        
        
        char letra=nie.charAt(nie.length()-1);
        
        
        
        int dni;
        try{        
            dni=Integer.parseInt(strDni);
        }
        catch(NumberFormatException e)
        {
            throw new IllegalArgumentException("Error, el dni no es número");
        }
        
        int resto=dni%23;
        
        if (letra!=Letras.charAt(resto))
            throw new IllegalArgumentException("Error, letra incorrecta");
          
        nie=primeraLetra+strDni+letra;

        this.nie = nie;
    }

    @Override
    public String toString() {
        return "{" + "Nie=" + this.nie + '}';
    }
  
  
}
