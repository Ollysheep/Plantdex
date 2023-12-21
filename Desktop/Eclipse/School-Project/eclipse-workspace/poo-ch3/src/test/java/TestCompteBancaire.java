import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ch3.CompteBancaire;
import ch3.TypeDeCompte;

public class TestCompteBancaire {

	@Test
	public void testComptageComptes() {

		int countCompteCourant = 0;
		int countCompteEpargne = 0;
		int countCompteRetraite = 0;


		CompteBancaire accountOne = new CompteBancaire("Audrey M", 90000.00, TypeDeCompte.COMPTE_COURANT);
		CompteBancaire accountTwo = new CompteBancaire("Elodie R", 120000.00, TypeDeCompte.COMPTE_COURANT);
		CompteBancaire accountThree = new CompteBancaire("Kristina S", 9000.00, TypeDeCompte.COMPTE_COURANT);
		CompteBancaire accountFour = new CompteBancaire("Audrey M", 12000.00, TypeDeCompte.COMPTE_EPARGNE);
		CompteBancaire accountFive = new CompteBancaire("Elodie R", 28900.00, TypeDeCompte.COMPTE_EPARGNE);
		CompteBancaire accountSix = new CompteBancaire("Kristina S", 12.00, TypeDeCompte.COMPTE_RETRAITE);


		List<CompteBancaire> accountList = new ArrayList<>();
		accountList.add(accountOne);
		accountList.add(accountTwo);
		accountList.add(accountThree);
		accountList.add(accountFour);
		accountList.add(accountFive);
		accountList.add(accountSix);


		for (CompteBancaire compte : accountList) {
			TypeDeCompte typeCompte = compte.getAccountType();
			if (typeCompte == TypeDeCompte.COMPTE_COURANT) {
				countCompteCourant++;
			} else if (typeCompte == TypeDeCompte.COMPTE_EPARGNE) {
				countCompteEpargne++;
			} else if (typeCompte == TypeDeCompte.COMPTE_RETRAITE) {
				countCompteRetraite++;
			}
		}

		assertEquals(3, countCompteCourant);
		assertEquals(2, countCompteEpargne);
		assertEquals(1, countCompteRetraite);
	}
}

/*  // Parcours de la liste de comptes pour compter chaque type de compte
 *    for (CompteBancaire compte : listeComptes) {
 *    if (compte.accountType == TypeDeCompte.COMPTE_COURANT) {
 *        countCompteCourant++;
 *    } else if (compte.accountType == TypeDeCompte.COMPTE_EPARGNE) {
 *        countCompteEpargne++;
 *    } else if (compte.accountType == TypeDeCompte.COMPTE_RETRAITE) {
 *        countCompteRetraite++;
 *    }
 *} */


