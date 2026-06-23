package fr.declaration.variable;

import java.util.Scanner;

public class InteractifTantQue {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        boolean condition = true;

        while (condition) {
            System.out.print("Entre un nombre : ");
            int nb = scanner.nextInt() ;

            if (nb <= 10 && nb >= 1){
                System.out.println(nb);
                condition = false;
            }else{
                System.out.print("Veuillez écrire un nombre en 1-10\n");
            }
        }
    }
}
