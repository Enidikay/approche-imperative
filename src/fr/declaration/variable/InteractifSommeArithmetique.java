package fr.declaration.variable;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre un nombre : ");
        int nb = scanner.nextInt() ;
        int sum = 0;

        for (int i = 1; i <= nb; i++) {
            sum+=i;
        }

        System.out.print(sum);
    }
}
