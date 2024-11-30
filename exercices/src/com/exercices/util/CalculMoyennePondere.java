package com.exercices.util;
/*
1. Calcul de la moyenne pondérée
Écrivez un programme qui calcule la moyenne pondérée de trois notes avec leurs coefficients respectifs. Les notes et coefficients doivent être saisies par l'utilisateur.


 */
public class CalculMoyennePondere {
    public double calculer(double notes[], double coefficient[]) {

        double sommeNotes = 0;
        double sommeCoefficient = 0;

        for (int i = 0; i < notes.length; i++) {
            sommeNotes += coefficient[i] * notes[i];
            sommeCoefficient += coefficient[i] * notes[i];
        }
        return sommeNotes / sommeCoefficient;
    }
}
