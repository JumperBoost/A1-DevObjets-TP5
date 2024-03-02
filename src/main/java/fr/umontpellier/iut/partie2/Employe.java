package fr.umontpellier.iut.partie2;

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

    public String getNrINSEE() {
        return nrINSEE;
    }

    public String getNom() {
        return nom;
    }

    public double getNbHeures() {
        return nbHeures;
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

    public static class EmployeBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;

        public EmployeBuilder setNrINSEE(String nrINSEE) {
            this.nrINSEE = nrINSEE;
            return this;
        }

        public EmployeBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public EmployeBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public EmployeBuilder setBase(double base) {
            this.base = base;
            return this;
        }

        public EmployeBuilder setNbHeures(double nbHeures) {
            this.nbHeures = nbHeures;
            return this;
        }

        public Employe build() {
            return new Employe(nrINSEE, nom, echelon, base, nbHeures);
        }
    }
}
