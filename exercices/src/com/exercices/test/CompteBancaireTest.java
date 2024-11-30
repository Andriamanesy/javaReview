package com.exercices.test;

import com.exercices.util.CompteBancaire;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompteBancaireTest {
    @Test
    public void doitAugmenterLeSoldePourDepos(){
        CompteBancaire compteBancaire = new CompteBancaire();
        compteBancaire.deposer(25000.00);
        double resultat = compteBancaire.afficherSolde();
        Assertions.assertEquals(75000.00,resultat);
    }
    @Test
    public void doitRetournerErreurPourDeposNegatif(){
        CompteBancaire compteBancaire = new CompteBancaire();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> compteBancaire.deposer(00.00) // Méthode testée
        );
        Assertions.assertEquals("Solde de depos doit être superieur à 0",exception.getMessage());
    }
    @Test
    public void doitDimunierLeSoldeSiOnFaitDeRetrait(){
        CompteBancaire compteBancaire = new CompteBancaire();
        compteBancaire.retirer(20000.00);
        Assertions.assertEquals(30000.00,compteBancaire.afficherSolde());
    }
    @Test
    public void doitretournerErreurSiRetraitEstSuperieurAuSolde(){
        CompteBancaire compteBancaire = new CompteBancaire();
        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> compteBancaire.retirer(60000.00)
        );
        Assertions.assertEquals("Votre retrait doit inferieur ou égale à votre solde", exception.getMessage());
    }
}
