package fr.nanterre.vehicules;

import org.junit.Test;
import static org.junit.Assert.*;

public class GestionVehiculeTest {

    @Test
    public void testRefuserDoublonImmatriculation() {
        GestionVehicule gestion = new GestionVehicule();
        Vehicule v1 = new Vehicule("AB-123-CD", "Renault", "Clio", 2021);
        Vehicule v2 = new Vehicule("ab-123-cd", "Peugeot", "208", 2022); // Même plaque en minuscules

        // 1. Premier ajout : doit réussir
        assertTrue(gestion.ajouterVehicule(v1));

        // 2. Deuxième ajout avec la même plaque : doit être refusé (false)
        boolean ajouteDeuxiemeFois = gestion.ajouterVehicule(v2);
        assertFalse(ajouteDeuxiemeFois);

        // 3. Le parc doit contenir exactement 1 seul véhicule
        assertEquals(1, gestion.getParc().size());
    }
}
