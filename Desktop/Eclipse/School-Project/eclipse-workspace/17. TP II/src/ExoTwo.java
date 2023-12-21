import java.util.*;

class ExoTwo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] tableau = new int[10];
        int i;

        i = 0;
        int n;

        n = input.nextInt();
        int a;

        a = 0;
        for (i = 0; i <= tableau.length - 1; i++) {
            tableau[i] = input.nextInt();
            System.out.println(tableau[i]);
            if (n == tableau[i]) {
                a = a + 1;
            }
        }
        System.out.println("Nous avons terminé les " + i + " tours et le nombre " + n + " est apparu " + a + " fois.");
    }
}
