package fr.umontpellier.iut.partie1;

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
}
