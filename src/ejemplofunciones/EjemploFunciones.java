/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofunciones;

import java.util.Scanner;

public class EjemploFunciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese un número...");
        n1 = sc.nextInt();
        System.out.println("Ingrese otro número...");
        n2 = sc.nextInt();
        System.out.println("La suma de dos números es: " + sumar(n1,n2));
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

}
