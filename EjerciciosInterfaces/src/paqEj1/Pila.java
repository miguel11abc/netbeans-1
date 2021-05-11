/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqEj1;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Profesor
 */
public class Pila implements ColeccionInterfaz{
    private ArrayList <Object> pila=new ArrayList();
    private int tamanioMax;

    public Pila(int tamanioMax) {
        this.tamanioMax = tamanioMax;
    }
    
    //Implementar los métodos de: ColeccionInterfaz
    @Override
    public boolean estaVacia(){
      if (this.pila.isEmpty())
          return true;
      return false;
    }
    
    @Override
    public boolean aniadir(Object objeto){
       if (this.pila.size()==this.tamanioMax)
           return false;       
       this.pila.add(objeto);
       return true;
    }
     
    @Override
    public Object primero() throws NoSuchElementException{
        if (estaVacia())
            throw new NoSuchElementException("No puedo nada porque está vacía");
        return this.pila.get(0);
    }
    
    @Override
    public Object extraer() throws NoSuchElementException{
      Object pr=primero(); 
      this.pila.remove(0);
      return pr;
    }
    
    //Método toString para Redefinir
    public String toString(){
        String cadena="Pila con tamaño máximo "+this.tamanioMax;
        if (estaVacia())
            cadena+="\n Pila vacía";
        else{
            cadena+="\n---Valores de la Pila---";
            for(Object obj: this.pila){
                cadena+="\n\t"+obj.toString();
            }
        }
        return cadena;
    }
    
}
