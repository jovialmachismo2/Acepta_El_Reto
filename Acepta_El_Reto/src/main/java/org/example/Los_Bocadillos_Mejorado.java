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
        System.out.println("¡¡FIIIIIINNN!!!");
        System.out.println("Ya no quedan mas cortezas");
    }

    /**
     * Este modo es para solicitar al usuario el numero de cortezas del hormiguero
     *
     * y si el usuario un formato no valido lo repite hasta que el usuario introduzca el valor numerico valido
     *
     * @return Numero de cortezas que puso el usuario
     */
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

    /**
     * Le pide al usuario que introduzca los trozitos para formar el bocadillo
     *
     * Una ves que los introduce el usuario los pasa a entero
     * @param corteza son las cantidad de trozitos que el usuario debe introducir
     * @return Devuelve un Array de entero de los trozitos que que introdujo el usuario
     */
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
                        if (pasar_int_bocadillo[i] <= 0) {
                            System.out.println("Los trozitos solo puedes ser positivos");
                            continue volver;
                        }
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

    /**
     * Comprueba si el bocadillo es valido y avisa si se puede comer
     * suma los numeros de la derecha y si la suma de los numeros coincide con el de la izquierda nos muestra el si es valido y la posicion del numero
     * Si la suma no coincide con ningun numero pues NO
     * @param pasar_int_bocadillo Es el array con los tamaños de los trozitos
     * @return SI pos"Si el bocadillo es valido y la posicion de la tapa"; NO "El bocadillo no es valido"
     */
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

