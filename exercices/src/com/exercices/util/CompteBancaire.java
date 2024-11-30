package com.exercices.util;

public class CompteBancaire {
    private int numeroCompte;
    private double solde;


    public int getNumeroCompte() {
        if(numeroCompte==0)
        {
            System.out.println("La compte n'existe pas !");
        }
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public void deposer(double v) {
        if (v <= 0)
            throw new IllegalArgumentException("Solde de depos doit être superieur à 0");
        solde += v;
    }

    public void retirer(double r) {
        if (r > solde)
            throw new IllegalArgumentException("Votre retrait doit inferieur ou égale à votre solde");
        solde -= r;
    }
    public double afficherSolde() {
        return solde;
    }
}
