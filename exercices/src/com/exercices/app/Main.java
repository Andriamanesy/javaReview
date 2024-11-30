package com.exercices.app;

import com.exercices.util.CompteBancaire;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        CompteBancaire compteBancaireBrian = new CompteBancaire();
        CompteBancaire compteBancaireTresor = new CompteBancaire();
        compteBancaireBrian.setNumeroCompte(1234);
        compteBancaireBrian.deposer(50000.00);
        compteBancaireBrian.retirer(5000.00);
        System.out.println("Le solde de numero de compte "+compteBancaireBrian.getNumeroCompte()+" est "+compteBancaireBrian.afficherSolde());
        System.out.println("Le solde de numero de compte "+compteBancaireTresor.getNumeroCompte()+" est "+compteBancaireTresor.afficherSolde());

    }
}