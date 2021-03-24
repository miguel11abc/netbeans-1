package javadocprueba;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * <h2> Clase Empleado, se utiliza para crear y leer empleados de una Base de Datos </h2>
 * 
 * Busca información de Javadoc en <a href="https://www.google.es/"> GOOGLE </a>
 * 
 * @see <a href="https://www.google.es/"> Google </a>
 * @version 1.0
 * @author Paqui en Entornos
 * @since 1.0
 */
public class Empleado {
    
    /**
     * Atributo del nombre del empleado. Tipo cadena
     */
    private String nombre;
    
     /**
     * Atributo del apellido del empleado. Tipo cadena
     */
    private String apellido;
    
     /**
     * Atributo del salario del empleado. Tipo double
     */
    private double salario;
    
    
    /**
     * Constructor con 3 parámetros
     * Crea objetos empleado, con nombre, apellido y salario 
     * 
     * @param nombre Nombre del empleado
     * @param apellido Apellido del empleado
     * @param salario Salario del empleado
     */
    public Empleado(String nombre, String apellido, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    
    /**
     * Este método sube el salario del empleado
     * @see Empleado
     * @param subida Double que se sumará al salario que ya tiene
     */
    public void subidasalario(double subida){
        salario = salario + subida;
    }
    
}
