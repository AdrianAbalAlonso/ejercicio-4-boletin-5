
package boletin.pkg5.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Adrián
 */
public class Boletin5Ejercicio4 {

    
    public static void main(String[] args) {
        int patatas , pulpo , comensales , materiaprima;
        
      Scanner obx = new Scanner (System.in);
      Almacen cuentas = new Almacen();
      
      System.out.println("Introduzca el numero de patatas que residen en el almacen");
            patatas=obx.nextInt();
        System.out.println("Introduzca el numero de pulpos que residen en el almacen");
        pulpo=obx.nextInt();
        System.out.println("El numero de comensales que podran comer pulpo con el pulpo que reside en el almacen seran"+cuentas.numerocomensalespulpo());
        System.out.println("El numero de comensales que podran comer patatas con las patatas que residen en el almacen seran"+cuentas.numerocomensalespatatas());
        //Creo que me e liado
        
        
    }
    
}
