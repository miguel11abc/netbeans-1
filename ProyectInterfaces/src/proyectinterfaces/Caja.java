/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectinterfaces;

/**
 *
 * @author Profesor
 */
public class Caja implements C{
    private int altura, anchura, profundidad;

    public Caja(int altura, int anchura, int profundidad) {
        this.altura = altura;
        this.anchura = anchura;
        this.profundidad = profundidad;
    }

    @Override
    public void metodoC()
    {
        System.out.println("Método C de la Interface C");
    }
    
    @Override
    public void metodoA(){
        System.out.println("Método A de la Interface A");
    }
    
    @Override
    public void metodoB()
    {
        System.out.println("Método B de la interface B");
    }
    
    
    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "Caja{" + "altura=" + altura + ", anchura=" + anchura + ", profundidad=" + profundidad + '}';
    }
    
}
