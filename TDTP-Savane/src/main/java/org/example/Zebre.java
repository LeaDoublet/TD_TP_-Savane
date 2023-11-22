package org.example;

public class Zebre extends Animal{

    public Zebre(String nom, Sexe sexe) {
        super(nom, sexe);
    }

    public Zebre reproduire(Zebre partenaire) {
        if (!this.sexe.equals(partenaire.sexe)) {
            String nomEnfant = this.nom + "_" + partenaire.nom;
            String sexEnfant = Math.random() < 0.5 ? "Male" : "Female";
            Sexe sexe1 = Sexe.valueOf(sexEnfant);
            return new Zebre(nomEnfant, sexe1);
        } else {
            System.out.println("Deux zebres de meme sexe ne peuvent se reproduire");
            return null;
        }
    }
}
