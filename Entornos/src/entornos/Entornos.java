/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos;

import java.util.*;

/**
 *
 * @author admin
 */
public class Entornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeros[];
        numeros = new int[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Dime un numero:");
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        for (int i = 0; i <= 9; i++) {
            System.out.println("Numero: " + numeros[i]);
        }
    }
}
