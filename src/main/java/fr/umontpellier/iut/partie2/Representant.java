package fr.umontpellier.iut.partie2;

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

    public static class RepresentantBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;
        private double chiffreAffaires;
        private double tauxCommission;

        public RepresentantBuilder setNrINSEE(String nrINSEE) {
            this.nrINSEE = nrINSEE;
            return this;
        }

        public RepresentantBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public RepresentantBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public RepresentantBuilder setBase(double base) {
            this.base = base;
            return this;
        }

        public RepresentantBuilder setNbHeures(double nbHeures) {
            this.nbHeures = nbHeures;
            return this;
        }

        public RepresentantBuilder setChiffreAffaires(double chiffreAffaires) {
            this.chiffreAffaires = chiffreAffaires;
            return this;
        }

        public RepresentantBuilder setTauxCommission(double tauxCommission) {
            this.tauxCommission = tauxCommission;
            return this;
        }

        public Representant build() {
            return new Representant(nrINSEE, nom, echelon, base, nbHeures, chiffreAffaires, tauxCommission);
        }
    }
}
