/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasegenerica;

/**
 *
 * @author fofib
 */
public class ClaseGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Generic<Integer> object1 = new Generic<>(5);
       object1.classType();
       Generic<String> object2 = new Generic<>("Holi");
       object2.classType();
    }

}
