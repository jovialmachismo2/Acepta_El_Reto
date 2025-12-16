package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Los_Bocadillos_MejoradoTest {

    @Test
    void modo2_test1() {
        int[] a = {10, 3, 7};// Empieza en comprobando si el 10 es tapa, ahora suma todos los numeros a su derecha y si la suma de los numeros la derecha es 10, esta correcto
        assertEquals("SI 1", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_test2() {
        int[] a = {4, 1, 2};//Si el primer numero no funciona como tapa pasa al siguiente, hasta que encuentre uno y si no encuentra no es valido
        assertEquals("NO", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_test3() {
        int[] a = {3, 5, 8, 25, 12, 15, 5, 7, 1, 2}; //Si el primer numero no funciona como tapa pasa al siguiente, hasta llegar a uno que puede servir como tapa
        assertEquals("SI 6", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_test4() {
        int[] a = {6, 2, 3, 1, 1, 8, 12};//Si el primer numero no funciona como tapa pasa al siguiente, hasta que encuentre uno y si no encuentra no es valido
        assertEquals("NO", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_test5() {
        int[] a = {9, 45, 5, 20, 10, 1, 6, 3};//Si el primer numero no funciona como tapa pasa al siguiente, hasta llegar a uno que puede servir como tapa
        assertEquals("SI 2", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_test6() {
        int[] a = {5};//como solo hay un numero no puede sumar numero a su derecha, entonces no puede servir de tapa
        assertEquals("NO", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_test7() {
        int[] a = {4, 4}; // aunque solo haya un numero a su derecha y es igual puede servir como tapa
        assertEquals("SI 1", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_test8() {//Si el primer numero no funciona como tapa pasa al siguiente, hasta que encuentre uno y si no encuentra no es valido
        int[] a = {4, 3};
        assertEquals("NO", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_test9() {//Si el primer numero no funciona como tapa pasa al siguiente, hasta llegar a uno que puede servir como tapa
        int[] a = {10, 1, 9};
        assertEquals("SI 1", Los_Bocadillos_Mejorado.modo2(a));
    }
}
