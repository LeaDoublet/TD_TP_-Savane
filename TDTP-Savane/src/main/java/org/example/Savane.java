package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Savane {

    ArrayList<Animal> animaux;
    public Savane(ArrayList<Animal> animals) {
        this.animaux = animals;
    }

    public void mangerDansLaSavane() {
        for (Animal animal : animaux) {
            animal.manger();
        }
    }
    public void dormirDansLaSavane() {
        for (Animal animal : animaux) {
            animal.dormir();
        }
    }

    public void retirerAnimal(Animal animal) {
        animaux.remove(animal);
    }

    public void ajouterAnimal(Animal animal) {
        animaux.add(animal);
    }

    public void rencontrer() {
        Random random = new Random();

        // Sélectionner deux indices aléatoires
        int index1 = random.nextInt(animaux.size());
        int index2;
        do {
            index2 = random.nextInt(animaux.size());
        } while (index1 == index2); // Assurer que les indices sont différents

        // Faire se rencontrer les deux animaux
        Animal animal1 = animaux.get(index1);
        Animal animal2 = animaux.get(index2);

        animal1.rencontrer(animal2, this);
    }


}
