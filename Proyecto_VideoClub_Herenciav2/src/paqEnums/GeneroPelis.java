/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEnums;

/**
 *
 * @author isabel
 */
public enum GeneroPelis {
    ACCION, HISTORICO, DOCUMENTAL, INFANTIL, MUSICAL, DRAMA, COMEDIA;
    
    public static String concatGenPelis()
    {
      String GENEROS="";
      for(GeneroPelis p: GeneroPelis.values())
          GENEROS+=p.name();
      return GENEROS;
    }     
}
