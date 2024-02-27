package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HeritageTest {
    @Test
    public void test_heritage_commercial() {
        Commercial commercial = new Commercial("1", "Albert", 3, 12.50, 230, 13500, 2.5);
        Employe commercial2 = new Commercial("1", "Albert", 3, 12.50, 230, 13500, 2.5);
        commercial.negocierTransaction(1432.50);
        commercial.negocierTransaction(643.75);
        assertEquals(commercial.getChiffreAffaires(), 15576.25);
        assertNotEquals(commercial.getSalaireNet(), commercial2.getSalaireNet());
    }

    @Test
    public void test_heritage_fabricant() {
        Fabricant fabricant = new Fabricant("2", "Julien", 2, 16.25, 274, 325, 5.75);
        Employe fabricant2 = new Fabricant("2", "Julien", 2, 16.25, 274, 325, 5.75);
        fabricant.fabriquerProduits(84);
        fabricant.fabriquerProduits(32);
        assertEquals(fabricant.getNbUnitesProduites(), 441);
        assertNotEquals(fabricant.getSalaireNet(), fabricant2.getSalaireNet());
    }

    @Test
    public void test_heritage_technicien() {
        Technicien technicien = new Technicien("3", "Arnold", 4, 9.75, 187.25);
        Employe technicien2 = new Technicien("3", "Arnold", 4, 9.75, 187.25);
        for(int i = 0; i < 3; i++)
            technicien.effectuerTacheTechnique();
        assertEquals(technicien.getEchelon(), 7);
        assertNotEquals(technicien.getSalaireNet(), technicien2.getSalaireNet());
    }
}
