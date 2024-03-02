package fr.umontpellier.iut.partie2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BuildersTest {
    @Test
    public void test_builder_employe_partiel() {
        Employe martin = new Employe("2", "Martin", 3, 8.75, 215.4);
        Employe martin_builder = new Employe.EmployeBuilder()
                .setNbHeures(215.4)
                .setBase(8.75)
                .setNrINSEE("2")
                .build();
        assertNotEquals(martin.toString(), martin_builder.toString());
        assertEquals(martin_builder.toString(), "Employe{nrINSEE='2', nom='null', echelon=0, base=8.75, nbHeures=215.4, salaireBrut=1884.75, salaireNet=1507.8000000000002}");
    }

    @Test
    public void test_builder_employe_complet() {
        Employe thomas = new Employe("3", "Thomas", 2, 14.75, 230);
        Employe thomas_builder = new Employe.EmployeBuilder()
                .setNrINSEE("3")
                .setNom("Thomas")
                .setEchelon(2)
                .setBase(14.75)
                .setNbHeures(230)
                .build();
        assertEquals(thomas.toString(), thomas_builder.toString());
        assertEquals(thomas_builder.toString(), "Employe{nrINSEE='3', nom='Thomas', echelon=2, base=14.75, nbHeures=230.0, salaireBrut=3392.5, salaireNet=2714.0}");
    }

    @Test
    public void test_builder_technicien() {
        Technicien flambert = new Technicien("4", "Flambert", 3, 13.50, 165);
        Technicien flambert_builder = new Technicien.TechnicienBuilder()
                .setNrINSEE("4")
                .setNom("Flambert")
                .setEchelon(3)
                .setBase(13.50)
                .setNbHeures(165)
                .build();
        assertEquals(flambert.toString(), flambert_builder.toString());
        assertEquals(flambert_builder.toString(), "Employe{nrINSEE='4', nom='Flambert', echelon=3, base=13.5, nbHeures=165.0, salaireBrut=2527.5, salaireNet=2022.0}");
    }

    @Test
    public void test_builder_fabricant() {
        Fabricant jacques = new Fabricant("5", "Jacques", 2, 14.25, 185, 145, 3.75);
        Fabricant jacques_builder = new Fabricant.FabricantBuilder()
                .setNrINSEE("5")
                .setNom("Jacques")
                .setEchelon(2)
                .setBase(14.25)
                .setNbHeures(185)
                .setNbUnitesProduites(145)
                .build();
        assertNotEquals(jacques.toString(), jacques_builder.toString());
        assertEquals(jacques_builder.toString(), "Employe{nrINSEE='5', nom='Jacques', echelon=2, base=14.25, nbHeures=185.0, salaireBrut=2636.25, salaireNet=2109.0}");
        assertEquals(jacques.getNbUnitesProduites(), jacques_builder.getNbUnitesProduites());
        assertNotEquals(jacques.getTauxCommissionUnite(), jacques_builder.getTauxCommissionUnite());
    }

    @Test
    public void test_builder_representant() {
        Representant lea = new Representant("6", "Lea", 3, 11.75, 164, 6485.50, 2.75);
        Representant lea_builder = new Representant.RepresentantBuilder()
                .setNrINSEE("6")
                .setNom("Lea")
                .setBase(11.75)
                .setNbHeures(164)
                .setTauxCommission(2.75)
                .build();
        assertNotEquals(lea.toString(), lea_builder.toString());
        assertEquals(lea_builder.toString(), "Employe{nrINSEE='6', nom='Lea', echelon=0, base=11.75, nbHeures=164.0, salaireBrut=1927.0, salaireNet=1541.6000000000001}");
        assertNotEquals(lea.getChiffreAffaires(), lea_builder.getChiffreAffaires());
        assertEquals(lea.getTauxCommission(), lea_builder.getTauxCommission());
    }

    @Test
    public void test_builder_vendeur() {
        Vendeur charlie = new Vendeur("7", "Charlie", 2, 13.75, 173, 4354.75, 0.50);
        Vendeur charlie_builder = new Vendeur.VendeurBuilder()
                .setNrINSEE("7")
                .setNom("Charlie")
                .setEchelon(2)
                .setBase(13.75)
                .setNbHeures(173)
                .setChiffreAffaires(4354.75)
                .setTauxCommission(0.50)
                .build();
        assertEquals(charlie.toString(), charlie_builder.toString());
        assertEquals(charlie_builder.toString(), "Employe{nrINSEE='7', nom='Charlie', echelon=2, base=13.75, nbHeures=173.0, salaireBrut=2191.125, salaireNet=1752.9}");
        assertEquals(charlie.getChiffreAffaires(), charlie_builder.getChiffreAffaires());
        assertEquals(charlie.getTauxCommission(), charlie_builder.getTauxCommission());
    }
}
