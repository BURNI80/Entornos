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
        int dato;
        System.out.println("Cuantos numeros quieres?");
        dato=sc.nextInt();
        if (dato>10 || dato<0){
            System.out.println("No puede ser mayor que 10.");
            return;
        }
        System.out.println("Que numero quieres buscar?");
        int busqueda=sc.nextInt();

        int numeros[];
        numeros = new int[dato];
        for (int i = 0; i <= (dato-1); i++) {
            System.out.println("Dime un numero:");
            numeros[i] = sc.nextInt();
            for (int a = 0; a <= (dato-1); a++) {
                if (numeros[i] == numeros[a] && i!=a) {
                    System.out.println("Has puesto un numero repetido");
                    return;
                }
            }
        }
        
        for (int s=0; s<(dato-1);s++){
            if (numeros[s]==busqueda){
                System.out.println("El numero que quieres buscar esta en el array");
                break;
            }
            else{
                System.out.println("El numero que buscas NO esta en el array");
                break;
            }
        }
        
        Arrays.sort(numeros);
        for (int i = 0; i <= 9; i++) {
            System.out.println("Numero: " + numeros[i]);
        }
    }
}
