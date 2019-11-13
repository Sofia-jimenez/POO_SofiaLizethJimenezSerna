/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica;

/**
 *
 * @author fofib
 * @param <T>
 *
 */
public class Generic <T> {
   private T objeto;
    public Generic(T dato){
        this.objeto = dato;
    }
    public void classType(){
        System.out.println("El tipo T es: " + this.objeto.getClass().getName());
    }

}
