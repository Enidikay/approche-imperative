package fr.declaration.variable;

import java.util.Scanner;

public class InteractifTableMult {
    static void main(String[] args) {
        int nbr = returnNumber();
        multiplicate(nbr);
    }

    static void multiplicate(int nbr){
        System.out.println("Table de " + nbr);
        for (int i = 0; i < 10 - 1; i++) {
            System.out.println(nbr + "*" +i + "="+  nbr*i);
        }
    }


    static int returnNumber() {
        Scanner scanner = new Scanner(System.in);

        boolean condition = true;

        while (condition) {
            System.out.print("Entre un nombre : ");
            int nb = scanner.nextInt();

            if (nb <= 10 && nb >= 1) {
                System.out.println(nb);
                return nb;
            } else {
                System.out.print("Veuillez écrire un nombre en 1-10\n");
            }
        }

        return 0;
    }
}
