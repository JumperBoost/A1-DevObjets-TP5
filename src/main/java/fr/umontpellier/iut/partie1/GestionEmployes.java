package fr.umontpellier.iut.partie1;

public class GestionEmployes {

    public static void main(String[] args) {
        Employe paul = new Employe("1", "Paul", 1, 12.50, 193);
        Employe thomas = new Employe("2", "Thomas", 2, 14.75, 230);
        Employe jacques = new Employe("3", "Jacques", 2, 14.25, 185);
        Employe martin = new Employe("4", "Martin", 3, 8.75, 215.4);

        System.out.println(paul);
        System.out.println(thomas);
        System.out.println(jacques);
        System.out.println(martin);
    }

}
