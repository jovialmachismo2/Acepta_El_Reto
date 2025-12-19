package org.example;

import java.util.Scanner;

public class Los_bocadillos_de_la_hormiga_reina {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        int corteza = teclado.nextInt();
        if (corteza == 0 )
            return false;
        else {
                int[] pasar_int_bocadillo = new int[corteza];
                for (int i = 0; i < corteza; i++) {
                    pasar_int_bocadillo[i] = teclado.nextInt();
                }

                String valido = "NO";

                for (int i = 0; i < corteza; i++) {
                    int suma = 0;
                    for (int j = i + 1; j < corteza; j++) {
                        suma += pasar_int_bocadillo[j];
                    }

                    if (pasar_int_bocadillo[i] == suma) {
                        valido = "SI " + (i + 1);
                        break;
                    }
                }
                System.out.println(valido);
            return true;
        }
    }
}
