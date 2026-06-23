package fr.declaration.variable;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre un nombre : ");
        int nb = scanner.nextInt() ;

        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + i);
        }
    }
}
