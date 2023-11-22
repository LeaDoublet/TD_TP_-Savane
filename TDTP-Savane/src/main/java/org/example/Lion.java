package org.example;

public class Lion extends Animal{
    public Lion(String nom, Sexe sexe) {
        super(nom,"Lion" ,sexe);
    }

    public Lion reproduire(Lion partenaire) {
        if (!this.sexe.equals(partenaire.sexe)) {
            String nomEnfant = this.nom + "_" + partenaire.nom;
            String sexEnfant = Math.random() < 0.5 ? "Male" : "Female";
            Sexe sexe1 = Sexe.valueOf(sexEnfant);
            return new Lion(nomEnfant, sexe1);
        } else {
            System.out.println("Deux Lions de meme sexe ne peuvent se reproduire");
            return null;
        }
    }

    public void devorre(Zebre zebre){

    }
    public void chasse(Zebre proie) {
        System.out.println(nom + " is hunting " + proie.nom);
        devorre(proie);
    }
}
