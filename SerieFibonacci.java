/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefibonacci;

import java.util.Scanner;

/**
 *
 * @author Marlon Osorio and Nicolas Bermudez
 */
public class SerieFibonacci {

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Que cantidad de digitos quiere en la serie?:\n");
        int longitudSerie = entrada.nextInt();

        System.out.println("\n\nFibonacci de forma iterativa");
        fiboIterativo(longitudSerie);

        System.out.println("\n\nFibonacci de forma recursiva");
        fiboRecursivo(-1, 1, longitudSerie);
    }

    public static void fiboIterativo(int longitudSerie) {
        int a = -1;
        int b = 1;

        int c = 0;
        for (int i = 0; i < longitudSerie; i++) {
            c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }

    public static void fiboRecursivo(int a, int b, int longitudSerie) {
        if (longitudSerie == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c + ", ");
        fiboRecursivo(b, c, longitudSerie - 1);
    }

}
