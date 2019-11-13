/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatica;

/**
 *
 * @author fofib
 */
public class Estatica {
  public static int a;
  public int cont;

    public Estatica(int num) {
        this.cont = num;
        a++;
    }

    public Estatica() {
        a++;
    }
    public static void main(String[] args) {
           Estatica s1 = new Estatica(4);
           Estatica s2 = new Estatica(7);
           Estatica s3 = new Estatica(9);

           System.out.println("Se instanciaron "+Estatica.a+" veces.");
    }

}
