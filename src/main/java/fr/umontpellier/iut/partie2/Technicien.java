package fr.umontpellier.iut.partie2;

public class Technicien extends Employe {
    public Technicien(String nrINSEE, String nom, int echelon, double base, double nbHeures) {
        super(nrINSEE, nom, echelon, base, nbHeures);
    }

    @Override
    public double getSalaireBrut() {
        return super.getSalaireBrut() + getEchelon() * 100;
    }

    public void effectuerTacheTechnique() {
        System.out.println("J'effectue une tâche technique.");
        super.setEchelon(super.getEchelon() + 1);
    }

    public static class TechnicienBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;

        public TechnicienBuilder setNrINSEE(String nrINSEE) {
            this.nrINSEE = nrINSEE;
            return this;
        }

        public TechnicienBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public TechnicienBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public TechnicienBuilder setBase(double base) {
            this.base = base;
            return this;
        }

        public TechnicienBuilder setNbHeures(double nbHeures) {
            this.nbHeures = nbHeures;
            return this;
        }

        public Technicien build() {
            return new Technicien(nrINSEE, nom, echelon, base, nbHeures);
        }
    }
}
