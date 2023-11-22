package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Savane {

    Animal[] animaux;
    public Savane(ArrayList<Animal> animals) {
        this.animaux = animals.toArray(new Animal[0]);
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
        List<Animal> nouvelleListe = new ArrayList<>(Arrays.asList(animaux));
        nouvelleListe.remove(animal);
        animaux = nouvelleListe.toArray(new Animal[0]);
    }

    public void ajouterAnimal(Animal animal) {
        List<Animal> nouvelleListe = new ArrayList<>(Arrays.asList(animaux));
        nouvelleListe.add(animal);
        animaux = nouvelleListe.toArray(new Animal[0]);
    }

    public void rencontrer() {
        Random random = new Random();

        // Sélectionner deux indices aléatoires
        int index1 = random.nextInt(animaux.length);
        int index2;
        do {
            index2 = random.nextInt(animaux.length);
        } while (index1 == index2); // Assurer que les indices sont différents

        // Faire se rencontrer les deux animaux
        Animal animal1 = animaux[index1];
        Animal animal2 = animaux[index2];

        animal1.rencontrer(animal2, this);
    }


}
