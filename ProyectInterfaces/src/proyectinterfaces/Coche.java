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
public class Coche implements CallBack{
    private String matricula;
    private int pitidos;

    public Coche(String matricula, int pitidos) {
        this.matricula = matricula;
        this.pitidos = pitidos;
    }

    
    @Override
    public void callback(int n){
        System.out.print("El coche con matrícula "+matricula);
        System.out.println("con "+pitidos+" pitidos");
        System.out.println("Multa= "+(n*100));
        
    }
   
    public String getMatricula() {
        return matricula;
    }

    public int getPitidos() {
        return pitidos;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPitidos(int pitidos) {
        this.pitidos = pitidos;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", pitidos=" + pitidos + '}';
    }
    
    
}
