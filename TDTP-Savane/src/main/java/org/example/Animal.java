package org.example;

public abstract class  Animal {
    String nom;
    Sexe sexe;
    String espece;


    public Animal(String nom,String espece, Sexe sexe) {
        this.nom = nom;
        this.espece=espece;
        this.sexe = sexe;
    }
    public abstract void manger();

    public void dormir() {
        System.out.println("Je dors dans la savane (" + nom + " " + espece + " " + sexe + ")");
    }

    public abstract void rencontrer(Animal autreAnimal, Savane savane);


}
