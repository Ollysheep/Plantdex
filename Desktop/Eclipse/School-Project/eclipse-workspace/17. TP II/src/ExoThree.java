import java.util.*;

class ExoThree {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tableau = new int[10];
        int i;

        i = 0;
        int isEven;
        int isOdd;

        isEven = 0;
        isOdd = 0;
        for (i = 0; i <= tableau.length - 1; i++) {
            tableau[i] = input.nextInt();
            System.out.println(tableau[i]);
            if (tableau[i] % 2 == 0) {
                isEven = isEven + 1;
            } else {
                isOdd = isOdd + 1;
            }
        }
        System.out.println("Nous avons terminé les " + i + " tours. Il y a " + isEven + " nombres paris et " + isOdd + " nombres impairs.");
    }
}
