package fr.declaration.variable;

public class SommeDeTableaux {
    static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        displayList(additionnateTable(array1,array2));
    }

    static void displayList(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static int[] additionnateTable(int[] array, int[] array2){
        int length = 0;

        if (array.length >= array2.length){
            length = array.length;
        } else{
            length = array2.length;
        }

        int[] addi = new int[length];

        for(int i = 0; i< length; i++){
            addi[i] = array[i] + array2[i];
        }

        return addi;
    }
}
