package com.exercices.util;

public class Employee {
    private String nom;
    private String poste;

    public double getSalaire() {
        return salaire;
    }
    public String getNom() {
        return nom;
    }

    private double salaire;

    public Employee(String nom, String poste, double salaire) {
        if(salaire < 0)
            throw new IllegalArgumentException("Salaire doit être positif");
        this.nom = nom;
        this.poste = poste;
        this.salaire = salaire;
    }

    public double calculSalaireAnnuel(double salaire) {
        return salaire * 12;
    }

    public double augmentationSalariale(double pourcentage) {
        if(pourcentage <= 0)
            throw new IllegalArgumentException("Pourcentage de l'augmentation doit être positif");

        return salaire += (pourcentage * salaire)/100;
    }

    public String comparerSalaireDesEmployee(Employee e) {
        if(this.salaire == e.getSalaire())
            return "Salaire de "+this.nom+" est égal au salaire de "+e.getNom() ;
        else if (this.salaire > e.getSalaire()) {
            return "Salaire de "+this.nom+" est superieur au salaire de "+e.getNom();
        }
        else
        {
            return "Salaire de "+this.nom+" est inferieur au salaire de "+e.getNom();
        }

    }
}
