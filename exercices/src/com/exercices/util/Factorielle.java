package com.exercices.util;

/*
1. Calcul d'une factorielle
Écrivez un programme qui calcule la factorielle d'un nombre nnn donné par l'utilisateur.
Utilisez :
•	Une boucle for pour itérer jusqu'à nnn.
•	Une condition pour valider que n≥0n \geq 0n≥0.
 */
public class Factorielle {

    public int calcule(int i) {
        if (i == 0 || i == 1)
            return 1;
        else if (i < 0) {
            return 1;
        } else
            return i * calcule(i-1);
    }
}
