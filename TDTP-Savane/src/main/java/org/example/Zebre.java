package org.example;

public class Zebre extends Animal{

    public Zebre(String nom, Sexe sexe) {
        super(nom, "Zebre",sexe);
    }

    public void rencontrer(Animal autreAnimal, Savane savane) {
        if (autreAnimal instanceof Zebre) {
            Zebre autreZebre = (Zebre) autreAnimal;

            if (!this.sexe.equals(autreZebre.sexe)) {
                // Deux zèbres de sexes opposés donnent naissance à un zèbre
                System.out.println("Naissance d'un zèbre : " + this.nom + " et " + autreZebre.nom);
                String nomEnfant = this.nom + autreZebre.nom + "_child";
                String sexeEnfant = Math.random() < 0.5 ? "Male" : "Female";
                Sexe sex = Sexe.valueOf(sexeEnfant);
                Zebre enfant = new Zebre(nomEnfant, sex);
                savane.ajouterAnimal(enfant);
            }
        } else if (autreAnimal instanceof Lion) {
            // Un zèbre rencontre un lion, le lion mange le zèbre
            System.out.println(autreAnimal.nom + " mange " + this.nom);
            savane.retirerAnimal(this);
        }
    }

}
