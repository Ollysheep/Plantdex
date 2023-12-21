package ch1;

public class StringUtils {

    // Méthode pour concaténer un nombre variable de chaînes de caractères
    public static String concatenerStrings(String... chaines) {
        StringBuilder resultat = new StringBuilder();

        // Parcours des chaînes et concaténation
        for (String chaine : chaines) {
        	/* resultat est un objet de type StringBuilder (ou StringBuffer).
        	 * La méthode append() est utilisée pour ajouter (concaténer) la chaîne chaine à l'objet resultat.
        	 * Cette opération est répétée pour chaque élément chaine dans la collection chaines.   */
            resultat.append(chaine);
        }

        // Retourne la chaîne résultante
        return resultat.toString();
    }

    // Méthode pour compter le nombre de mots dans une phrase
    public static int compterMots(String phrase) {
        // Supprimer les espaces inutiles avec trim() et diviser la phrase en mots avec split()
        String[] mots = phrase.trim().split("\\s+");

        // Retourner le nombre de mots dans la phrase
        return mots.length;
    }

    public static void main(String[] args) {
        // Exemple d'utilisation de la classe StringUtils
        String concatResult = StringUtils.concatenerStrings("Je", "suis", "très", "fatiguée");
        System.out.println("Résultat de la concaténation : " + concatResult);

        String phrase = "   Je suis très fatiguée   mais ça va en     vrai.   ";
        int nombreDeMots = StringUtils.compterMots(phrase);
        System.out.println("Nombre de mots dans la phrase : " + nombreDeMots);
    }
}
