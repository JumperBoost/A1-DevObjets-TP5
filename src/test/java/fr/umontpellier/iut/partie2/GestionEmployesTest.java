package fr.umontpellier.iut.partie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class GestionEmployesTest {
    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> GestionEmployes.main(new String[1]));
    }

}