package fr.declaration.variable;

public class AffichageSuite {
    static void main(String[] args) {
        printNumbers(10);
        pairsNumbers(10, false);
    }

    static void forPrintNumbers(int nombre){
        for(int i = 0; i > nombre; i++){
            System.out.println(i);
        }
    }

    static void forPairsNumbers(int nombre, boolean pairs){
        for(int i = 0; i > nombre; i++){
            if (pairs && i % 2 == 0) {
                System.out.println(i);
            }

            if (!pairs && i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    /**
     *
     * @param nombre Affiche simplement les nombre de 1 à x nombre
     */
    static void printNumbers(int nombre) {
        int i = 1;
        while (i <= nombre) {
            System.out.println(i);
            i++;
        }
    }

    /**
     *
     * @param nombre On défini jusque ou on veut aller
     * @param pairs Toggle le mode pour afficher true: pairs false: impairs
     */
    static void pairsNumbers(int nombre, boolean pairs) {
        int i = 0;
        while (i <= nombre) {
            if (pairs && i % 2 == 0) {
                System.out.println(i);
            }

            if (!pairs && i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }


}
