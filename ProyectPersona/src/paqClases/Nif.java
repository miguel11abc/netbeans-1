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
public class Nif {
   private String nif;
   private final static String Letras="TRWAGMYFPDXBNJZSQVHLCKE";

    public Nif(String nif) throws IllegalArgumentException {
        nif=nif.trim().toUpperCase();
        
        if (nif.length() > 9)
            throw new IllegalArgumentException("Error, longitud de nif incorrecta");
        
        String strDni=nif.substring(0, nif.length()-1);
              
        
        if (nif.length()< 9)
        {
          int longitud=nif.length()-1;                       
          for(int i=longitud; i<8;i++)
             strDni='0'+strDni;      
        }
         
        
        
        char letra=nif.charAt(nif.length()-1);
        
        
        
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
          
        nif=strDni+letra;
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "{" + "Nif=" + this.nif + '}';
    }
   
   
   
}
