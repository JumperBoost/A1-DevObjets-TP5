package fr.umontpellier.iut.partie1;

public class Fabricant extends Employe {
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Fabricant(String nrINSEE, String nom, int echelon, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite) {
        super(nrINSEE, nom, echelon, base, nbHeures);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    @Override
    public double getSalaireBrut() {
        return super.getSalaireBrut() + nbUnitesProduites * tauxCommissionUnite;
    }

    public int getNbUnitesProduites() {
        return nbUnitesProduites;
    }

    public void fabriquerProduits(int nbProduits) {
        System.out.println("Je fabrique un produit.");
        nbUnitesProduites += nbProduits;
    }
}
