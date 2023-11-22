package org.example;

public class Animal {
    String nom;
    Sexe sexe;

    public Animal(String nom, Sexe sexe) {
        this.nom = nom;
        this.sexe = sexe;
    }
    public void manger(Nourriture nourriture){
        System.out.println("Je m'appelle"+this.nom+"et je mange de la "+nourriture);
    }
    public void dormir() {
        System.out.println(this.nom + " dort");
    }
}
