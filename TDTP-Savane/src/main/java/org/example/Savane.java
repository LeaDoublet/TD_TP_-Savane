package org.example;

public class Savane {

    Animal[] animaux;
    public Savane(Animal[] animals) {
        this.animaux = animals;
    }

    public void ajoutAnimal(Animal animal) {
        //Nouveau tableau avec taille + 1
        Animal[] newAnimals = new Animal[animaux.length + 1];

        // On met elements de l'ancien tableau vers le nouveau
        System.arraycopy(animaux, 0, newAnimals, 0, animaux.length);

        // On ajoute le nouvel animal a la fin du tableau
        newAnimals[animaux.length] = animal;

        //On change reference mais ancien tableau perdu et plus accessible...
        animaux = newAnimals;
    }

}
