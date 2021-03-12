/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqGuitarra;

/**
 *
 * @author Profesor
 */
public class Guitarra {
    private int cuerdas;
    private String tipoMadera;
    private String tipo;
    private final static String [] tipoM={"EBANO","ROBLE","CAOBA"};
    private final static String tipoG[]={"ELECTRICA","ESPAÑOLA","ACUSTICA"};

    public Guitarra(int cuerdas, String tipoMadera, String tipo) throws IllegalArgumentException
    {
        if (!(cuerdas>=6 && cuerdas<=8))
        {
            IllegalArgumentException numCuerdas=new IllegalArgumentException();
            throw numCuerdas;
        }    
        this.cuerdas = cuerdas;
        this.tipoMadera = tipoMadera;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "[" + "Cuerdas=" + this.cuerdas + "\tTipo de Madera=" + this.tipoMadera + "\tTipo de Guitarra=" + this.tipo + ']';
    }
    
    
    
}
