package org.example;

import java.util.Scanner;

public class Los_Bocadillos_Mejorado {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int corteza = 1;

        System.out.println("***** Bienvenido a los bocadillos de la hormiga Reyna *****");

        while (corteza != 0) {

            corteza = pedir_corteza();

            if (corteza != 0) {
                int bocadillo[] = pedir_bocadillo(corteza);
                System.out.println(modo2(bocadillo));
            }
        }
    }

    public static int pedir_corteza() {
        while (true) {
            System.out.println("Indica el numero de cortezas que hay en el hormiguero");

            String linea = teclado.nextLine();

            if (!linea.matches("\\d{1,2}")) {
                System.out.println("¡ERROR! Solo puede escribir un numero");
                continue;
            }
            int corteza = Integer.parseInt(linea);
            return corteza;
        }
    }

    public static int[] pedir_bocadillo(int corteza) {
        boolean letra = true;
        volver:
        do {
            System.out.println("Indica los tamaños de los trocitos para hacer el bocadillo");

            String bocadillos[] = teclado.nextLine().split(" ");

            int pasar_int_bocadillo[] = new int[bocadillos.length];

            if (bocadillos.length != corteza) {
                System.out.println("No coincide con el numero de corteza");
            } else {
                for (int i = 0; i < bocadillos.length; i++) {
                    try {
                        pasar_int_bocadillo[i] = Integer.parseInt(bocadillos[i]);
                        letra = false;
                    } catch (Exception e) {
                        System.out.println("¡ERROR! Solo puedes escribir numeros no letras");
                        letra = true;
                        continue volver;
                    }
                }
                return pasar_int_bocadillo;
            }
        } while (letra);

        return new int[0];
    }

    public static String modo2(int[] pasar_int_bocadillo) {
        int suma = 0;
        int pos = 0;
        String valido = "";
        for (int i = 0; i < pasar_int_bocadillo.length; i++) {
            suma = 0;
            for (int j = i; j < pasar_int_bocadillo.length - 1; j++) {
                suma += pasar_int_bocadillo[j + 1];

            }
            if (pasar_int_bocadillo[i] == suma) {
                pos = i + 1;
                valido = "SI " + pos;
                break;
            } else {
                valido = "NO";
            }
        }
        return valido;
    }
}
