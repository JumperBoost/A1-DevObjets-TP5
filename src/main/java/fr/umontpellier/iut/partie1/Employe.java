package fr.umontpellier.iut.partie1;

public class Employe {
    private String nrINSEE;
    private String nom;
    private int echelon;
    private double base;
    private double nbHeures;

    public Employe(String nrINSEE, String nom, int echelon, double base, double nbHeures) {
        this.nrINSEE = nrINSEE;
        this.nom = nom;
        this.echelon = echelon;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Employe setEchelon(int echelon) {
        this.echelon = echelon;
        return this;
    }

    public double getBase() {
        return base;
    }

    public int getEchelon() {
        return echelon;
    }

    public double getSalaireBrut() {
        return base * nbHeures;
    }

    public double getSalaireNet() {
        return getSalaireBrut() * 0.80;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nrINSEE='" + nrINSEE + '\'' +
                ", nom='" + nom + '\'' +
                ", echelon=" + echelon +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                ", salaireBrut=" + getSalaireBrut() +
                ", salaireNet=" + getSalaireNet() +
                '}';
    }
}
