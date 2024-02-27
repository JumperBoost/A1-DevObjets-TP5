package fr.umontpellier.iut.partie1;

public class Representant extends Commercial {
    private int representations = 0;

    public Representant(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(nrINSEE, nom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
    }

    public void representerEntreprise() {
        representations++;
    }

    @Override
    public double getSalaireBrut() {
        Technicien temp = new Technicien(getNrINSEE(), getNom(), getEchelon(), getBase(), getNbHeures());
        return temp.getSalaireBrut() + representations * 123;
    }
}
