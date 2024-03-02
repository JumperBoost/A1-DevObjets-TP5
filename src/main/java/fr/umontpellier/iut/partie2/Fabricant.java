package fr.umontpellier.iut.partie2;

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

    public double getTauxCommissionUnite() {
        return tauxCommissionUnite;
    }

    public void fabriquerProduits(int nbProduits) {
        System.out.println("Je fabrique un produit.");
        nbUnitesProduites += nbProduits;
    }

    public static class FabricantBuilder {
        private String nrINSEE;
        private String nom;
        private int echelon;
        private double base;
        private double nbHeures;
        private int nbUnitesProduites;
        private double tauxCommissionUnite;

        public FabricantBuilder setNrINSEE(String nrINSEE) {
            this.nrINSEE = nrINSEE;
            return this;
        }

        public FabricantBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public FabricantBuilder setEchelon(int echelon) {
            this.echelon = echelon;
            return this;
        }

        public FabricantBuilder setBase(double base) {
            this.base = base;
            return this;
        }

        public FabricantBuilder setNbHeures(double nbHeures) {
            this.nbHeures = nbHeures;
            return this;
        }

        public FabricantBuilder setNbUnitesProduites(int nbUnitesProduites) {
            this.nbUnitesProduites = nbUnitesProduites;
            return this;
        }

        public FabricantBuilder setTauxCommissionUnite(double tauxCommissionUnite) {
            this.tauxCommissionUnite = tauxCommissionUnite;
            return this;
        }

        public Fabricant build() {
            return new Fabricant(nrINSEE, nom, echelon, base, nbHeures, nbUnitesProduites, tauxCommissionUnite);
        }
    }
}
