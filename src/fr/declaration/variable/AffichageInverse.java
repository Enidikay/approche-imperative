package fr.declaration.variable;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        displayList(array);
        reverseList(array);
        arrayCopy(array);
    }

    static void displayList(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void reverseList(int[] array) {
        int[] tableau = new int[array.length];
        int total = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            tableau[i] = array[total--];
        }

        displayList(tableau);
    }

    static void arrayCopy(int[] array){
        int[] tableau = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tableau[i] = array[i];
        }
        displayList(tableau);
    }

}
