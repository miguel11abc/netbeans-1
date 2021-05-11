/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_videoclub_herencia;

import paqSubClases.Pelicula;

/**
 *
 * @author Profesor
 */
public class PruebaEstaticosDefaultInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula p1=new Pelicula("ESPAÑOL", 200,"FICCION","EL SEÑOR DE LOS ANILLOS");        
        Pelicula p2=new Pelicula("INGLÉS", 45, "Ficcion","The Hobbit");
        Pelicula p3=new Pelicula("INGLÉS",89,"Ficcion","Star Wars III");
        Pelicula p4=new Pelicula("ESPAÑOL",78,"COMEDIA","El discurso del Rey");
        Pelicula p5=new Pelicula("FRANCÉS", 123,"INFANTIL","Shrek");
        
        p1.nuevometodo();
        Pelicula.soyEstatico();
        int x=PruebaEstaticosDefaultInterfaces.maximo(3,20);
        System.out.println("x="+x);
        
        x=PruebaEstaticosDefaultInterfaces.maximo(p1.getDuracion(), p2.getDuracion());
       
        x=maximo(89,34);
        int y=Pelicula.getContPeliculas();
    }
    
    public static int maximo(int a, int b){
        int maxi=0;
        if(a>b) maxi=a;
        else maxi=b;
        return maxi;
    }
}
