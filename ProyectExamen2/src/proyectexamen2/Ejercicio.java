/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectexamen2;

import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class Ejercicio {
  private String profesora;
  private int n;
  private ArrayList <Fraccion> fracciones;
  private final static String profesoras[]={"ISABEL","PIEDAD","PAQUI","MAYCA","VICKY"};

   //1
    public Ejercicio(String profesora, int n)throws IllegalArgumentException 
    {
        profesora=profesora.trim().toUpperCase();
        boolean esta=false;
        for (int i = 0; i < Ejercicio.profesoras.length && !esta; i++) {
            if (profesora==Ejercicio.profesoras[i])
                esta=true;
        }
        if (!esta)
            throw new IllegalArgumentException("Error, esa profesora no existe");
        
        this.profesora = profesora;
        this.n = n;
        this.fracciones=new ArrayList();
    }
    
    //Métodos de acceso:Getter, Setter

    public String getProfesora() {
        return this.profesora;
    }

    //2
    public int getN() {
        return this.n;
    }

    public ArrayList<Fraccion> getFracciones() {
        return this.fracciones;
    }

    //3
    public static String[] getProfesoras() {
        return Ejercicio.profesoras;
    }
    
    public void setN(int n) {
        this.n = n;
    }

    public void setFracciones(ArrayList<Fraccion> fracciones) {
        this.fracciones = fracciones;
    }
   
    //5
    public void addFraccion(Fraccion f){
        if (this.fracciones.contains(f))
            System.out.println("Esa fracción está repetida...");
        else
            this.fracciones.add(f);
    }
    
    //6
    public String toString(){
        String cadena="Número de ejercicio: "+this.n;
        if(this.fracciones.isEmpty())
            cadena=cadena+"\nSin fracciones";
        else
        {
            //foreach
            for(Fraccion f: this.fracciones)
                cadena+="\n"+f;
            
            //for
            /*
            for(int i=0; i<this.fracciones.size(); i++)
                cadena+="\n"+this.fracciones.get(i);
            */
            
        }
        return cadena;
    }
  
  
  
}
