import java.util.Arrays;
import java.util.Scanner;

public class ExoFour {

	public static void main(String[] args) {
		
		/* repertoire.length give the number of lines
		 * repertoire[0].length give the number of the columns in the line 0
		 * repertoire[0][2] give the value of the 2th column in line 0 */
		
		String[][] Contact = {
				{"Mat", "0632595624", "3 Square des Myosotis"},
				{"Clem", "0622251015", "12 Avenue Mazarin"},
				{"Ani", "0668896567", "21 Avenue du President Allende"},
				{"Tiki", "0769672198", "Avenue Cambacérès"},
				{"Djo", "0622538208", "13 Avenue Marco Polo"}
		};
		
		String choix = null;
		Scanner scan = new Scanner(System.in);
		
		do {
		
			// print the options
			
			System.out.println("Type a name to find someone. Type 2 to list the repertory. Type 3 to exit.");
			choix = scan.nextLine();
			
			switch (choix) {
			case "Mat": {
				System.out.println("Name : "+Contact[0][0]+" - Number : "+Contact[0][1]+" - Adress : "+Contact[0][2]);
				break;
			}
			case "Clem": {
				System.out.println("Name : "+Contact[1][0]+" - Number : "+Contact[1][1]+" - Adress : "+Contact[1][2]);
				break;
			}
			case "Ani": {
				System.out.println("Name : "+Contact[2][0]+" - Number : "+Contact[2][1]+" - Adress : "+Contact[2][2]);
				break;
			}
			case "Tiki": {
				System.out.println("Name : "+Contact[3][0]+" - Number : "+Contact[3][1]+" - Adress : "+Contact[3][2]);
				break;
			}
			case "Djo": {
				System.out.println("Name : "+Contact[4][0]+" - Number : "+Contact[4][1]+" - Adress : "+Contact[4][2]);
				break;
			}
			case "2": {
				System.out.println(Arrays.deepToString(Contact));
				break;
			}
			case "3": {
				System.out.println("Closing...");
				break;
			}
			
			} // fin du switch
			
		} while (!choix.equals("3")); // end of the lopp
		scan.close(); // necessary to scan
	}
}
