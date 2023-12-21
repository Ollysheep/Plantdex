package ch1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

// Importations statiques et annotations

public class TestVehicule {


	@Test
	void testMarque() {
		// Test pour attribuer une marque à une voiture
		Vehicule voiture = new Vehicule("Toyota", 1989, true, new Moteur(true, 12, 130));
		voiture.marque = "Honda";
	}

	@Test
	void testYear() {
		// Test pour attribuer une année à une voiture
		Vehicule voiture = new Vehicule("Toyota", 1989, true, new Moteur(true, 12, 130));
		voiture.annee = 2004;
	}

	@Test
	void testElectric() {
		// Test pour attribuer un état électrique à une voiture
		Vehicule voiture = new Vehicule("Toyota", 1989, true, new Moteur(true, 12, 130));
		voiture.electric = true;
		// Assertions des autres propriétés ci-dessous
	}

	// Autres méthodes de tests

	@Test
	public void testgetInfos() {
		// Test pour vérifier les informations d'une voiture
		Vehicule voiture1 = new Vehicule("Toyota", 1989, true, new Moteur(true, 12, 130));
		assertEquals("Toyota ; 1989 ; true ; true ; 12 ; 130", voiture1.getInfos());
	}

	@Test
	public void testMoteur() {
		// Test pour vérifier les attributs liés au moteur de différents véhicules
		Vehicule moto = new Vehicule("Toyota", 1989, true, new Moteur(true, 12, 130));
		moto.annee = 2016;
		moto.electric = false;
		moto.marque = "Suzuki";

		Vehicule camion = new Vehicule("Toyota", 1989, true, new Moteur(true, 12, 130));
		camion.annee = 2008;
		camion.electric = true;
		camion.marque = "Mercedes";


		// Solution 1 pour le TP 4 dernier exercice

		Moteur moteurMoto = new Moteur(true, 12, 130); // Création d'un moteur pour la moto
		moteurMoto.on = true;
		moteurMoto.vitesse = 130;
		moteurMoto.vitesseMax = 160;

		Moteur moteurCamion = new Moteur(true, 12, 130); // Création d'un moteur pour le camion
		moteurCamion.on = true;
		moteurCamion.vitesse = 80;
		moteurCamion.vitesseMax = 100;

		camion.moteur = moteurMoto; // Liaison du moteur au camion
		moto.moteur = moteurCamion; // Liaison du moteur à la moto

		// Affichage des références des moteurs des véhicules
		System.out.println("Référence du moteur de camion : " + camion.moteur);
		System.out.println("Référence du moteur de moto : " + moto.moteur);

		// Actions sur les moteurs des véhicules
		camion.moteur.accelerer();
		moto.moteur.decelerer();

		// Modification de la vitesse du moteur de la moto
		moto.moteur.vitesse = 20;

		// Affichage de la nouvelle vitesse des moteurs
		System.out.println("Nouvelle vitesse du moteur de la moto : " + moto.moteur.vitesse);
		System.out.println("Nouvelle vitesse du moteur de la camion : " + camion.moteur.vitesse);

		/* Solution 2 = Créer des copies de l'instance de Moteur
		 * camion.moteur = new Moteur(moteur); // Création d'une copie du moteur pour le camion
		 * moto.moteur = new Moteur(moteur); // Création d'une copie du moteur pour la moto
		 * adapter la méthode de copie (Moteur(Moteur moteur)*/
	}
	
	@Test
	void testExceptionVehicule() {
		assertThrows(IllegalArgumentException.class, () -> {
			Vehicule tuture = new Vehicule("", -12, true, new Moteur(true, 12, 130));
		});
	}
}
