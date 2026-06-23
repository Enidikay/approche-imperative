package fr.declaration.variable;

public class ComparaisonTableau {
    static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;

        System.out.println(countCommonNumbers(array1,array2));
    }


    static int countCommonNumbers(int[] array1, int[] array2){
        int count = 0;
        int length = 0;

        if (array1.length >= array2.length) {
            length = array1.length;
        } else {
            length = array2.length;
        }

        for (int i = 0; i<length; i++) {
            if (i < array1.length && i < array2.length) {
                if (array1[i] == array2[i]){
                    count++;
                }
            }
        }


        return count;
    }
}
