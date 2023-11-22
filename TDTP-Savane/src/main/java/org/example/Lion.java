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
    public void rencontrer(Animal autreAnimal, Savane savane) {
        if (autreAnimal instanceof Lion) {
            Lion autreLion = (Lion) autreAnimal;

            if (this.sexe.equals(autreLion.sexe)) {
                // Deux lions du même sexe se battent
                System.out.println("Combat entre lions : " + this.nom + " vs " + autreLion.nom);

                double probaDeuxMorts = 0.7;

                if (Math.random() < probaDeuxMorts) {
                    // Les deux lions meurent
                    System.out.println("Les deux lions meurent");
                    savane.retirerAnimal(this);
                    savane.retirerAnimal(autreLion);
                } else {
                    // Un seul lion meurt (choisi au hasard)
                    System.out.println("Un lion meurt au hasard");
                    boolean perdant = Math.random() < 0.5;
                    savane.retirerAnimal(perdant ? this : autreLion);
                }
            } else {
                // Deux lions de sexes différents donnent naissance à un lion
                System.out.println("Naissance d'un lion : " + this.nom + " et " + autreLion.nom);
                String nomEnfant = this.nom + autreLion.nom + "_child";
                String sexeEnfant = Math.random() < 0.5 ? "Male" : "Female";
                Sexe sexe1 = Sexe.valueOf(sexeEnfant);
                Lion enfant = new Lion(nomEnfant, sexe1);
                savane.ajouterAnimal(enfant);
            }
        } else if (autreAnimal instanceof Zebre) {
            // Un lion rencontre un zèbre, le lion mange le zèbre
            System.out.println(this.nom + " mange " + autreAnimal.nom);
            savane.retirerAnimal(autreAnimal);
        }


    }

}
