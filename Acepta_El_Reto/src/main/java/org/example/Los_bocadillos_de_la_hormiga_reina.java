package org.example;

import java.util.Scanner;

public class Los_bocadillos_de_la_hormiga_reina {
    static Scanner teclado ;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int corteza = 1;
        int suma = 0;

        while (corteza != 0){
            corteza = teclado.nextInt();
            teclado.nextLine();
            if (corteza != 0) {
                String bocadillos[] = teclado.nextLine().split(" ");
                int pasar_int_bocadillo[] = new int[bocadillos.length];
                if (bocadillos.length != corteza) {
                    return;
                }else {
                    for (int i = 0; i < bocadillos.length; i++) {
                        pasar_int_bocadillo[i] = Integer.parseInt(bocadillos[i]);
                        suma = pasar_int_bocadillo[i] + suma;
                    }
                    String validar = modo2(pasar_int_bocadillo);
                    System.out.println(validar);
                }

            }
        }

    }
    static String modo2(int[] pasar_int_bocadillo){
        int suma = 0;
        int pos = 0;
        String valido = "";
        for (int i = 0; i < pasar_int_bocadillo.length; i++) {
            suma = 0;
            for (int j = i; j < pasar_int_bocadillo.length -1; j++) {
                suma += pasar_int_bocadillo[j+1];

            }
            if (pasar_int_bocadillo[i] == suma){
                pos = i + 1;
                valido = "SI " + pos;
                break;
            }else {
                valido = "NO";
            }
        }
        return valido;
    }
}
