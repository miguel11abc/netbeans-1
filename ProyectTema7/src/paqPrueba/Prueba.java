/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqPrueba;

import java.util.ArrayList;

/**
 *
 * @author Profesor
 */
public class Prueba {
    private static ArrayList <String> profesoras;
    
    public Prueba()
    {
        Prueba.profesoras=new ArrayList();
        profesoras.add("ISABEL");
    }
    public ArrayList <String> getProfesoras()
    {
        return Prueba.profesoras;
    }
}
