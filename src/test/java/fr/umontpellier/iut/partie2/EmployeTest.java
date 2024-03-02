package fr.umontpellier.iut.partie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeTest {
    @Test
    public void test_calcul_salaire_brut() {
        double base = 8.75;
        double nbHeures = 215.4;
        Employe martin = new Employe("1", "Martin", 3, base, nbHeures);

        assertEquals(martin.getSalaireBrut(), 1884.75);
    }

    @Test
    public void test_calcul_salaire_net() {
        double base = 8.75;
        double nbHeures = 215.4;
        Employe martin = new Employe("1", "Martin", 3, base, nbHeures);

        assertEquals(martin.getSalaireNet(), 1507.80, 10e-3);
    }

    @Test
    public void test_toString_correspond() {
        Employe thomas = new Employe("2", "Thomas", 2, 14.75, 230);

        assertEquals(thomas.toString(), "Employe{nrINSEE='2', nom='Thomas', echelon=2, base=14.75, nbHeures=230.0, salaireBrut=3392.5, salaireNet=2714.0}");
    }
}
