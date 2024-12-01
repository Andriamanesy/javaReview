/*
2. Gestion des employés
Créez une classe Employe avec :
•	Attributs : nom, salaire, poste.
•	Méthodes :
•	Calcul du salaire annuel.
•	Augmentation du salaire par un pourcentage donné.
Ajoutez une méthode statique pour comparer les salaires de deux employés.

 */
package com.exercices.test;

import com.exercices.util.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GestionEmployeeTest {
    @Test
    public void doitCalculerSalaireAnnuelCorrectement() {
        Employee employee = new Employee("Brian","Dev", 15000.00 );
        double result = employee.calculSalaireAnnuel(15000.00);
        Assertions.assertEquals(180000.00, result);
    }
    @Test
    public void doitRetournerErreurSiSalaireEstNegatif() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Employee employee = new Employee("Brian","Dev", -1.00 );
        });
        Assertions.assertEquals("Salaire doit être positif", exception.getMessage());
    }
    @Test
    public void calculCorrecteAugmentationSalarialParPourcentage(){
        Employee employee = new Employee("Brian","Dev", 15000.00 );
        double result = employee.augmentationSalariale(20);
        Assertions.assertEquals(18000.00, result);
    }
    @Test
    public void doitEtrePositifLePourcentagePourAugmentationSalarial(){
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
           Employee employee = new Employee("Brian","Dev", 15000.00 );
           employee.augmentationSalariale(-20);
        });
        Assertions.assertEquals("Pourcentage de l'augmentation doit être positif", exception.getMessage());
    }
    @Test
    public void doitComparerSalaireDesEmployes() {
        Employee employee1 = new Employee("Brian","Dev", 15000.00 );
        Employee employee2 = new Employee("Trésor","Dev", 16000.00 );

        String resultat = employee1.comparerSalaireDesEmployee(employee2);
        Employee employee3 = new Employee("Pons","Dev", 15000.00 );
        String resultat2 = employee3.comparerSalaireDesEmployee(employee1);

        Assertions.assertEquals("Salaire de Brian est inferieur au salaire de Trésor", resultat);
        Assertions.assertEquals("Salaire de Pons est égal au salaire de Brian", resultat2);
    }

}
