package org.example;

public class Zebre extends Animal{

    public Zebre(String nom, Sexe sexe) {
        super(nom, "Zebre",sexe);
    }

    public void manger(){
        System.out.println("Je mange de l'herbe" + " (" + nom + " " + espece.toUpperCase() + " " + sexe + ")");

    }
    public void rencontrer(Animal autreAnimal, Savane savane) {
        if (autreAnimal instanceof Zebre) {


            if (!this.sexe.equals(autreAnimal.sexe)) {
                // Deux zèbres de sexes opposés donnent naissance à un zèbre
                System.out.println("Naissance d'un zèbre : " + this.nom + " et " + autreAnimal.nom);
                String nomEnfant = this.nom + autreAnimal.nom + "_child";
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
