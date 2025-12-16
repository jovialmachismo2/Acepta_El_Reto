package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Los_Bocadillos_MejoradoTest {

    @Test
    void modo2_caso_simple() {
        int[] a = {10, 3, 7};
        assertEquals("SI 1", Los_Bocadillos_Mejorado.modo2(a));
    }

    @Test
    void modo2_sin_bocadillo() {
        int[] a = {4, 1, 2};
        assertEquals("NO", Los_Bocadillos_Mejorado.modo2(a));
    }
}
