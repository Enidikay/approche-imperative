package fr.declaration.variable;

public class AffichagePartiel {
    static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        supperior3(array);
        isPair(array);
        pairIndex(array);
        isNotPair(array);

    }

    static void supperior3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 3) {
                System.out.println(i + " est suppérieur à 3");
            }
        }
    }

    static void isPair(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(i + " est pair");
            }
        }
    }

    static void pairIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                System.out.println(array[i] + " a un index pair");
            }
        }
    }

    static void isNotPair(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 1) {
                System.out.println(array[i] + " est impair");
            }
        }
    }
}
