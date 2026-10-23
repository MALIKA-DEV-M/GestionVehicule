package fr.nanterre.vehicules;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AjoutVehiculeTest {

    public void testAjoutEtDoublon() {
        GestionVehicule parc = new GestionVehicule();
        Vehicule v1 = new Vehicule("AB-123-CD", "Peugeot", "208", 2022);
        Vehicule v2 = new Vehicule("AB-123-CD", "Renault", "Clio", 2021);

        assertTrue(parc.ajouterVehicule(v1));
        assertFalse(parc.ajouterVehicule(v2));
        assertEquals(1, parc.getParc().size());
    
    }
}
