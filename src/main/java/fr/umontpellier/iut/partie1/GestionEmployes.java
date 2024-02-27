package fr.umontpellier.iut.partie1;

public class GestionEmployes {

    public static void main(String[] args) {
        Vendeur paul = new Vendeur("1", "Paul", 1, 12.50, 193, 3435.75, 0.75);
        Representant paul2 = new Representant("1", "Paul", 1, 12.50, 193, 7435.75, 2.75);
        Fabricant thomas = new Fabricant("2", "Thomas", 2, 14.75, 230, 274, 4.5);
        Fabricant jacques = new Fabricant("3", "Jacques", 2, 14.25, 185, 145, 3.75);
        Technicien martin = new Technicien("4", "Martin", 3, 8.75, 215.4);

        System.out.println("== CA Avant Paul: " + paul.getChiffreAffaires() + " ==");
        paul.vendreProduit();
        paul.negocierTransaction(853.25);
        paul.negocierTransaction(1354.50);
        paul2.negocierTransaction(853.25);
        paul2.negocierTransaction(1354.50);
        paul2.representerEntreprise();
        System.out.println("Salaire Brut Paul: " + paul.getSalaireBrut());
        System.out.println("Salaire Brut Paul2: " + paul2.getSalaireBrut());
        System.out.println("== CA Après Paul: " + paul.getChiffreAffaires() + " ==");

        System.out.println("== nbProduits Avant Thomas: " + thomas.getNbUnitesProduites() + " ==");
        thomas.fabriquerProduits(35);
        thomas.fabriquerProduits(174);
        System.out.println("== nbProduits Après Thomas: " + thomas.getNbUnitesProduites() + " ==");

        System.out.println("== nbProduits Avant Jacques: " + jacques.getNbUnitesProduites() + " ==");
        jacques.fabriquerProduits(78);
        jacques.fabriquerProduits(245);
        System.out.println("== nbProduits Après Jacques: " + jacques.getNbUnitesProduites() + " ==");

        System.out.println("== Echelon Avant Martin: " + martin.getEchelon() + " ==");
        for(int i = 0; i < 4; i++)
            martin.effectuerTacheTechnique();
        System.out.println("== Echelon Après Martin: " + martin.getEchelon() + " ==");
    }

}
