/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqIntroduccion;

/**
 *
 * @author Profesor
 */
public class Caja {
    private int altura, anchura,profundidad;
    public Caja(int alto, int ancho, int profundo){
        this.altura=alto;
        this.anchura=ancho;
        this.profundidad=profundo;
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
    public String toString(){
      return this.altura+" "+this.anchura+" "+this.profundidad;
    }
}
