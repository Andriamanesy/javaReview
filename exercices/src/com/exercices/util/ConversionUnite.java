package com.exercices.util;

/*
2. Conversion d’unités
Créez un programme qui convertit une valeur en secondes (par exemple, 3750 secondes) en heures, minutes et secondes au format hh:mm:ss.

 */
public class ConversionUnite {
    public String calculer(int secondes) {
        int second, minutes, heures;
        heures = secondes/3600;
        minutes = (secondes % 3600) / 60;
        second = secondes % 60;

        return String.format("%02d:%02d:%02d", heures, minutes, second);
    }
}
