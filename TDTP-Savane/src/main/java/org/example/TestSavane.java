package org.example;

import java.util.ArrayList;

public class TestSavane {
    public static void main(String[] args) {


        // Créer une liste pour stocker les animaux
        ArrayList<Animal> animaux = new ArrayList<>();

        // Créer 10 Zèbres et 10 Lions (moitié mâles et moitié femelles)
        for (int i = 1; i <= 10; i++) {
            // i pair -> maculin et i impair -> feminin
            Zebre zebre = new Zebre("Zebre" + i, i % 2 == 0 ? Sexe.Masc : Sexe.Fem);
            Lion lion = new Lion("Lion" + i, i % 2 == 0 ? Sexe.Masc : Sexe.Fem);

            // Ajouter les animaux à la liste
            animaux.add(zebre);
            animaux.add(lion);
        }

        // Créer la Savane avec la liste d'animaux
        Savane savane = new Savane(animaux);


        System.out.println("=== Manger dans la savane ===");
        savane.mangerDansLaSavane();

        System.out.println("\n=== Dormir dans la savane ===");
        savane.dormirDansLaSavane();

        System.out.println("#########################################");
        System.out.println("#       BATTLE ROYALE 5O ANIMAUX        #");
        System.out.println("##########################################");


    }

}
