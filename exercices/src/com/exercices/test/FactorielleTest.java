package com.exercices.test;

import com.exercices.util.Factorielle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorielleTest {
    @Test
    public void doitRetournerUnPourValeurNegative() {
        Factorielle fact = new Factorielle();
        int resultat = fact.calcule(-1); // Test pour une valeur négative
        Assertions.assertEquals(1, resultat); // Vérifie que 1 est retourné
    }
    @Test
    public void doitCalculerCorrectementValeurPositive() {
        Factorielle fact = new Factorielle();
        int resultat = fact.calcule(5);
        Assertions.assertEquals(120, resultat);
    }
    @Test
    public void doitRetournerUnPourValeur0() {
        Factorielle fact = new Factorielle();
        int resultat = fact.calcule(0); //
        Assertions.assertEquals(1, resultat); // Vérifie que 1 est retourné
    }

}
