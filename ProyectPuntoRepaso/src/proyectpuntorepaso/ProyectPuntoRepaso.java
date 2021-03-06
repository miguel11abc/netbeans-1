/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectpuntorepaso;

import paqPunto.Punto;

/**
 *
 * @author isabel
 */
public class ProyectPuntoRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p=new Punto(3,4);
        Punto q=new Punto(10,3);
        Punto r=new Punto(5,-2);
        
        //String strP=p.toString();
        System.out.println("p="+p);
        System.out.println("q="+q);
        System.out.println("r="+r);
        System.out.println("abcisa de p ="+p.getX());
        
        //Se desea cambiar la ordenada del punto r por el valor de la abcisa de p
        r.setY(p.getX());
        System.out.println("r="+r);
        
        //Muestra el punto opuesto de p
        Punto t=p.ptoOpuesto();
        System.out.println("t="+t);
        
        System.out.println("punto opuesto de p ="+p.ptoOpuesto().toString());
        
        //Comprobar si el punto p es igual al punto q
        if (p.equals(q)) System.out.println("p y q son iguales");
        else System.out.println("p y q son distintos");
        
        if (q.equals(p)) System.out.println("q y p son iguales");
        else System.out.println("q y p son distintos");
        
        //Muestra el punto suma de p y q
        Punto a=p.ptoSuma(q);
        System.out.println("a="+a);
        
        System.out.println("Abcisa de q + p ="+q.ptoSuma(p).getX());
        
        //Muestra el punto intermedio de p=(4,4) y q=(10,6)
        p.setX(4);
        q.setY(6);
        System.out.println("p="+p);
        System.out.println("q="+q);

        Punto b=p.ptoIntermedio(q);
        System.out.println("b="+b);
        
        //Cálculo de la distancia entre los puntos p y q
        p.setX(3);
        q.setY(3);
        System.out.println("Distancia entre p y q ="+p.distancia(q));
        System.out.println("Distancia entre q y p ="+q.distancia(p));
        
        //Comprobar si el punto p tiene los valores 3 en x y 4 en y
        if (p.equals(3,4)==true)
            System.out.println("p y (3,4) son iguales");
        else
           System.out.println("p y (3,4) son distintos"); 
        
        //Calcula la suma del punto p con (0,0)
        Punto c=p.ptoSuma(0,0);
        System.out.println("c="+c);
        
        //Calcula el punto intermedio entre p y (0,0)
        Punto cc=p.ptoIntermedio(0, 0);
        System.out.println("cc="+cc);
        
        //Calcula la distancia entre p y (3,4)
        System.out.println("distancia entre p y (3,4) ="+p.distancia(3, 4));
        
        //Crear un punto por defecto
        Punto e=new Punto();
        System.out.println("e="+e);
        
        //Crea un punto cuyas coordenadas sean 7,7
        Punto ee=new Punto(7);
        System.out.println("ee="+ee);
        
        //Crea un punto cuyas coordenadas sean las mismas del punto p
        Punto copiaP=new Punto(p);
        System.out.println("copiaP="+copiaP);
        
        //Clona el punto p
        Punto pp=p.clone();
        System.out.println("pp="+pp);
        Punto ppp=new Punto(p);
        System.out.println("ppp="+ppp);
        
        
        Punto j=r.ptoSuma(p.ptoIntermedio(q)).ptoOpuesto();
        System.out.println("j="+j);
        
        //Mostrad por pantalla la abcisa del punto generado
        //por el punto intermedio del opuesto de r y el punto opuesto de p. En una sola línea.
        System.out.println(r.ptoOpuesto().ptoIntermedio(p.ptoOpuesto()).getX());
        
        //Se desea crear el punto t (constructor), 
        //de forma que el valor de su abcisa sea la ordenada del punto opuesto de r 
        //y el valor de la ordenada de t, sea la abcisa del punto suma de p y q
        
        Punto tt=new Punto(r.ptoOpuesto().getY(),p.ptoSuma(q).getX() );
        System.out.println("tt="+tt);
        
        //
        Punto t2=new Punto(3,5);
        System.out.println("opuesto de t2 ="+t2.ptoOpuesto());
        
        //
        //Mostrar las coordenadas del 
        //punto resta entre r y el opuesto de la suma entre p y el punto formado por (6,4).
        Punto r1=r.ptoResta(p.ptoSuma(6,4).ptoOpuesto());
        System.out.println("r1="+r1);
        
        
    }
    
    
    
}
