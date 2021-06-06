/*
 Escribir un programaen JAVA que transforme grados Celsius en grados Fahrenheit: F = C *(9/5) +32
 */
package grados;

import java.util.Scanner;


public class Grados {

    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        
        double F, C;
    
        System.out.println("ingrese la cantidad de grados Celsius a convertir");
        C = lector.nextDouble();
        
       F = 9 / 5.0 * C + 32;
       
        System.out.println(C+"grados Celsius equivalen a"+F+
                "grados Fahrenheit.");
    }
    
}
