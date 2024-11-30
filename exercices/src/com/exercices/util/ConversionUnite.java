package com.exercices.util;

public class ConversionUnite {
    public String calculer(int secondes) {
        int second, minutes, heures;
        heures = secondes/3600;
        minutes = (secondes % 3600) / 60;
        second = secondes % 60;

        return String.format("%02d:%02d:%02d", heures, minutes, second);
    }
}
