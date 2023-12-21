import java.util.*;

class ExoOne {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tableau = new int[10];
        int i;

        i = 0;
        for (i = 0; i <= tableau.length - 1; i++) {
            tableau[i] = input.nextInt();
            System.out.println(tableau[i]);
        }
        System.out.println("Nous avons terminé les " + i + " tours.");
    }
}
