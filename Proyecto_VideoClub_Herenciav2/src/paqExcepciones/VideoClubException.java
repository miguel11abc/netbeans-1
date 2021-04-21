/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqExcepciones;

/**
 *
 * @author Profesor
 */
public class VideoClubException extends IllegalArgumentException{

    public VideoClubException() {
        System.out.println("Error en el VideoClub");
    }

    public VideoClubException(String s) {
        super(s);
    }
    
}
