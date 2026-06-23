package fr.declaration.variable;

public class Rotation {
    static void main(String[] args) {
        int[] test1 = {6, 2, 3, 4};

        displayList(rot(test1));
    }

    static int[] rot(int[] array){
        int lastElement = array[array.length - 1];
        int[] newTable = new int[array.length];
        newTable[0] = lastElement;


        for (int i = 0; i < array.length - 1; i++) {
            newTable[i + 1] = array[i];
        }

        return newTable;
    }

    static void displayList(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
