/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectexamen2;

/**
 *
 * @author Profesor
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1
        Fraccion f=new Fraccion(3,5);
        
        //2
        Fraccion g=null;
        try
        {
           g=new Fraccion(8,0);
        }
        catch(IllegalArgumentException ex)
        {
            //System.out.println(ex.getMessage());
            g=new Fraccion();
        }
        
        //3
        Fraccion h=new Fraccion();
        
        //4 
        Fraccion i=new Fraccion(f); 
        //Fraccion i=new Fraccion(f.getNum(), f.getDen());
        
        //5
        Fraccion j=new Fraccion(3,f);
        
        //6
        Fraccion k=new Fraccion(4,5,2);
       
        //7
        Ejercicio ej1=new Ejercicio("PIEDAD",1);
        
        //8
        ej1.addFraccion(f);
        ej1.addFraccion(g);
        ej1.addFraccion(h);
        
        //9
        ej1.addFraccion(f.sumaFracciones(k.productoFracciones(i)));
        
        //10        
        System.out.println("ej1="+ej1);
        
        //11
        Ejercicio ej2=new Ejercicio("ISABEL",2);
       
        //12
        ej2.addFraccion(i);
        ej2.addFraccion(j);
        ej2.addFraccion(k);

        
        System.out.println("ej2="+ej2);
        //13
        int contFraccNumMy20=0;
        
        System.out.println("---- Fracciones con numerador > 10 de ej2");
       /*
        for(Fraccion c:  ej2.getFracciones())         
            if (c.getNum() > 10)
            {    
                System.out.println("--"+c);
                contFraccNumMy20 ++;
            }
        */
        for (int l = 0; l < ej2.getFracciones().size(); l++) {
            if (ej2.getFracciones().get(l).getNum() > 10)
            {
                System.out.println("--"+ej2.getFracciones().get(l));
                contFraccNumMy20 ++;
            }
        }
 
        System.out.println("Hay "+contFraccNumMy20+" fracciones cuyo numerador es > 10 en el ejercicio "+ej2.getN());
        
        //14
        double v[]=new double[ej1.getFracciones().size()];
        /*
        for (int l = 0; l < ej1.getFracciones().size(); l++) {
            v[l]= ((double)ej1.getFracciones().get(l).getNum()) / ((double)ej1.getFracciones().get(l).getDen()); 
        }
        */
        int l=0;
        for(Fraccion c: ej1.getFracciones())
        {
            v[l]=((double)c.getNum())/c.getDen();
            l++;
        }
        
        //15
        System.out.println("--Vector generado---");
        for (int m = 0; m < v.length; m++) {
            System.out.println(v[m]);
        }
        
        //16
        System.out.println("--Vector generado con valores enteros solo---");  
        for (int m = 0; m < v.length; m++) {
            System.out.println((int)v[m]);
        }
        
        //17
        boolean encontrado=false;
        for (int m = 0; m < v.length && !encontrado; m++) {
            if (v[m]==4.0) encontrado=true;
        }
        if (encontrado)
            System.out.println("Sí, al menos existe un 4.0 en el array");
        else
            System.out.println("El valor 4.0 NO existe en el array");
        
        //18
        double my=v[0]; int repite=0;
        for (int m = 0; m < v.length; m++) {
            if (v[m] > my)
            {
                my=v[m]; repite=0;
            }
            else if (v[m]==my) repite++;            
        }
        System.out.println("El mayor es "+my+" se repite "+repite+" veces");
        
        //19
        double mn=v[0]; int indice=0;
        for (int m = 0; m < v.length; m++) {
            if (v[m] < mn)
            {
                mn=v[m]; indice=m;
            }            
        }
        int posi=indice+1;
        System.out.println("El menor es "+mn+" y ocupa la posición "+ posi);
        
       //20
        System.out.println(ej1.getProfesora().substring(0,3)+". Ejercicio "+ej1.getN());
        System.out.println(ej2.getProfesora().substring(0,3)+". Ejercicio "+ej2.getN());
    }
    
}
