package fr.umontpellier.iut.partie2;

public class GestionEmployes {

    public static void main(String[] args) {
        System.out.println("== BUILDER EMPLOYE ==");
        Employe paul = new Employe("1", "Paul", 1, 12.50, 193);
        Employe paul_builder = new Employe.EmployeBuilder()
                .setBase(12.50)
                .setNom("Paul")
                .build();
        System.out.println(paul);
        System.out.println(paul_builder);
        System.out.println();


        Employe martin = new Employe("2", "Martin", 3, 8.75, 215.4);
        Employe martin_builder = new Employe.EmployeBuilder()
                .setNbHeures(215.4)
                .setBase(8.75)
                .setNrINSEE("2")
                .build();
        System.out.println(martin);
        System.out.println(martin_builder);
        System.out.println();


        Employe thomas = new Employe("3", "Thomas", 2, 14.75, 230);
        Employe thomas_builder = new Employe.EmployeBuilder()
                .setNrINSEE("3")
                .setNom("Thomas")
                .setEchelon(2)
                .setBase(14.75)
                .setNbHeures(230)
                .build();
        System.out.println(thomas);
        System.out.println(thomas_builder);
        System.out.println();


        System.out.println("== BUILDER DIVERS ==");
        Technicien flambert = new Technicien("4", "Flambert", 3, 13.50, 165);
        Technicien flambert_builder = new Technicien.TechnicienBuilder()
                .setNrINSEE("4")
                .setNom("Flambert")
                .setEchelon(3)
                .setBase(13.50)
                .setNbHeures(165)
                .build();
        System.out.println(flambert);
        System.out.println(flambert_builder);
        System.out.println();

        Fabricant jacques = new Fabricant("5", "Jacques", 2, 14.25, 185, 145, 3.75);
        Fabricant jacques_builder = new Fabricant.FabricantBuilder()
                .setNrINSEE("5")
                .setNom("Jacques")
                .setEchelon(2)
                .setBase(14.25)
                .setNbHeures(185)
                .setNbUnitesProduites(145)
                .setTauxCommissionUnite(3.75)
                .build();
        System.out.println(jacques);
        System.out.println(jacques_builder);
        System.out.println();

        Representant lea = new Representant("6", "Lea", 3, 11.75, 164, 6485.50, 2.75);
        Representant lea_builder = new Representant.RepresentantBuilder()
                .setNrINSEE("6")
                .setNom("Lea")
                .setEchelon(3)
                .setBase(11.75)
                .setNbHeures(164)
                .setChiffreAffaires(6485.50)
                .setTauxCommission(2.75)
                .build();
        System.out.println(lea);
        System.out.println(lea_builder);
        System.out.println();

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
        System.out.println(charlie);
        System.out.println(charlie_builder);
    }

}
