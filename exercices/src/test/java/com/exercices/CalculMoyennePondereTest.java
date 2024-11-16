package test.java.com.exercices;


import main.java.com.exercices.util.CalculMoyennePondere;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculMoyennePondereTest {

    @Test
    void doitCalculerCorrectementLaMoyennePonderee() {
        // La classe et la méthode n'existent pas encore !
        CalculMoyennePondere calculateur = new CalculMoyennePondere();
        double[] notes = {15, 12, 18};
        double[] coefficients = {2, 3, 5};

        double resultat = calculateur.calculer(notes, coefficients);

        Assertions.assertEquals(resultat, resultat, 0.01);
    }
}
