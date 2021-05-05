/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectanominainterna;

/**
 *
 * @author Profesor
 */
public class Robot {
   private int id;
   
   private class Cerebro{
       public void pensar(){
           System.out.println("Estoy pensando....");   
       }
   }
   
   public Robot(int id){
       this.id=id;
       Cerebro b=new Cerebro();
       b.pensar();
   }
   
}
