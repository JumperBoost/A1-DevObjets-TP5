package fr.umontpellier.iut.partie2;

public abstract class Commercial extends Employe {
    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission) {
        super(nrINSEE, nom, echelon, base, nbHeures);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    @Override
    public double getSalaireBrut() {
        return super.getBase() + chiffreAffaires * tauxCommission;
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }

    public void negocierTransaction(double sommeGagnee) {
        System.out.println("Je négocie une transaction.");
        chiffreAffaires += sommeGagnee;
    }
}
