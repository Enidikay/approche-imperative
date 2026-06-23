package fr.declaration.variable;
import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int rdmNombre = rand.nextInt(100) + 1;

        int nbEssai = 0;

        while (true) {

            System.out.print("Entre un nombre : ");
            int nb = scanner.nextInt();

            nbEssai++;

            if (nb > rdmNombre) {
                System.out.println("Vous êtes au-dessus du nombre");
            }
            else if (nb < rdmNombre) {
                System.out.println("Vous êtes en-dessous du nombre");
            }
            else {
                System.out.println("Bravo, vous avez trouvé en " + nbEssai + " coups");
                break;
            }
        }
    }
}
