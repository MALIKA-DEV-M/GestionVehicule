package fr.nanterre.vehicules;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AjoutVehiculeTest {

    @Test
    public void ajoutAugmenteLeParc() {
        GestionVehicule parc = new GestionVehicule();
        Vehicule v = new Vehicule("Peugeot", "208");
        parc.ajouter(v);
        
        // Échec volontaire pour le test Jenkins : on attend 2 au lieu de 1
        assertEquals(1, parc.size());
    }
}
