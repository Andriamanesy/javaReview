package com.exercices.test;

import com.exercices.util.TrouverMaxEtMin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
1. Trouver le maximum et le minimum
Écrivez une méthode qui prend un tableau d'entiers et retourne à la fois le maximum et le minimum sous forme d'un tableau de deux éléments.
Exemple : Pour l'entrée {3, 5, 1, 8, -2}, la sortie doit être {8, -2}.
 */

public class TrouverMaxEtMinTest {
    @Test
    public void doitTrouverMaxEtMin() {
        TrouverMaxEtMin trouverMaxEtMin = new TrouverMaxEtMin();
        int [] tab = trouverMaxEtMin.filtrage(2,-5,8,90);
        Assertions.assertArrayEquals(new int[] {90, -5}, tab);
    }
    @Test
    public void doitRetournerErreurSiTableauVide(){
        TrouverMaxEtMin trouverMaxEtMin = new TrouverMaxEtMin();
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, ()->{
            trouverMaxEtMin.filtrage();
        });
        Assertions.assertEquals("Le tableau est vide", exception.getMessage());
    }
}
