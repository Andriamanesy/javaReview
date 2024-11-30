package com.exercices.test;

import com.exercices.util.ConversionUnite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversionUniteTest {

    @Test
    public void doitCalculerConversionHeureEnMinuteSeconde () {
        ConversionUnite conversionUnite = new ConversionUnite();

        String resultat = conversionUnite.calculer(3665);
        Assertions.assertEquals( "01:01:05",resultat);
    }
}
