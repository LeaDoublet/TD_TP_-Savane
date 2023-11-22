package org.example;

public class Animal {
    String nom;
    Sexe sexe;
    String espece;


    public Animal(String nom,String espece, Sexe sexe) {
        this.nom = nom;
        this.espece=espece;
        this.sexe = sexe;
    }
    public void manger(){
        System.out.println("Je mange " + (espece.equals("Zebre") ? "de l'herbe" : "de la viande") + " (" + nom + " " + espece.toUpperCase() + " " + sexe + ")");

    }

    public void dormir() {
        System.out.println("Je dors dans la savane (" + nom + " " + espece + " " + sexe + ")");
    }

}
