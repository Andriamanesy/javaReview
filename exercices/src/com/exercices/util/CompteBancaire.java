package com.exercices.util;

import java.util.HashSet;
import java.util.Set;

public class CompteBancaire {
    private int numeroCompte;
    private double solde;

    public static final Set<Integer> numeroComptesExistant = new HashSet<Integer>();
    public int getNumeroCompte() {
        return numeroCompte;
    }


    public CompteBancaire(int numeroCompte, double solde) {
        if (numeroCompte <= 0){
            throw new IllegalArgumentException("Numero de compte est invalide");
        }
        if (numeroComptesExistant.contains(numeroCompte)){
            throw new IllegalArgumentException("Numero de compte est existant");
        }
        this.solde = solde;
        this.numeroCompte = numeroCompte;
        numeroComptesExistant.add(numeroCompte);
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
