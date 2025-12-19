package org.example;

import java.util.Scanner;

public class chatgpt_Juez {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {}
    }

    public static boolean casoDePrueba() {
        int corteza = teclado.nextInt();
        if (corteza == 0) return false;

        int[] a = new int[corteza];
        for (int i = 0; i < corteza; i++) {
            a[i] = teclado.nextInt();
        }

        long sumaDerecha = 0;
        for (int v : a) sumaDerecha += v;

        String valido = "NO";
        for (int i = 0; i < corteza; i++) {
            sumaDerecha -= a[i];
            if (a[i] == sumaDerecha) {
                valido = "SI " + (i + 1);
                break;
            }
        }

        System.out.println(valido);
        return true;
    }
}
