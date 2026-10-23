package fr.nanterre.vehicules;

import java.util.ArrayList;
import java.util.List;

public class GestionVehicule {
    static final String VERSION = "0.1.0";
    private List<Vehicule> parc = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Gestion de véhicules - v" + VERSION);
        List<Vehicule> parc = new ArrayList<>();
        parc.add(new Vehicule("AB-123-CD", "Renault", "Clio", 2021));
        afficher(parc);
    }

    static void afficher(List<Vehicule> parc) {
        System.out.println(parc.size() + " véhicules dans le parc :");
        for (Vehicule v : parc) {
            System.out.println("  " + v);
        }
    }
        public boolean ajouterVehicule(Vehicule nouveauVehicule) {
        // 1. Vérifier si un véhicule avec la même immatriculation existe déjà
        for (Vehicule v : parc) {
            if (v.getImmatriculation().equalsIgnoreCase(nouveauVehicule.getImmatriculation())) {
                return false; // Doublon détecté, on refuse l'ajout
            }
        }
        // 2. Si pas de doublon, on l'ajoute
        parc.add(nouveauVehicule);
        return true;
    }
       public List<Vehicule> getParc() {
        return parc;
    }

}  

