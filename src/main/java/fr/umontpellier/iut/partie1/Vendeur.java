package fr.umontpellier.iut.partie1;

public class Vendeur extends Commercial {
    private int produitsVendu = 0;

    public Vendeur(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(nrINSEE, nom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
    }

    public void vendreProduit() {
        produitsVendu++;
    }
}
