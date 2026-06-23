package fr.declaration.variable;

public class InversionContenu {
    static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        invertContent(array);
    }

    static int[] invertContent(int[] array) {
        int[] table2 = new int[array.length];
        int total = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            table2[i] = array[total--];
        }
        displayList(table2);

        return table2;

    }

    static void displayList(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
