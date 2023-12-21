package ch1;

public class Vehicule {

    // Propriétés d'un véhicule : marque, année, état électrique, moteur
    public String marque;  
    public Integer annee; 
    public Boolean electric; 
    public Moteur moteur;
    
    public Vehicule (String marque, Integer annee) {
    	this.marque = marque;
        this.annee = annee;
    }
    
    public Vehicule (String marque, Integer annee, Boolean electric) {
    	this(marque, annee);
    	this.electric = electric;
    }
    
    public Vehicule (String marque, Integer annee, Boolean electric, Moteur moteur) {
    	this(marque, annee, electric);
        this.moteur = moteur;
        
        if (marque == null || annee == 0 || marque == "" || moteur == null) {
        	throw new IllegalArgumentException();
        }
    }
    
    

    // Méthode pour obtenir les informations du véhicule sous forme de chaîne de caractères
    public String getInfos() {
        // Création d'une chaîne avec les informations de base du véhicule (marque, année, état électrique)
        String infos = marque + " ; " + annee + " ; " + electric;

        // Vérifie si le véhicule possède un moteur non nul
        if (moteur != null) {
            // Si oui, ajoute les informations du moteur à la chaîne existante
            infos += " ; " + moteur.on + " ; " + moteur.vitesse + " ; " + moteur.vitesseMax;
        }

        // Renvoie la chaîne contenant toutes les informations du véhicule
        return infos;
    }
}


