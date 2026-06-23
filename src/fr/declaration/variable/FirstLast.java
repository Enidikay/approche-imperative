package fr.declaration.variable;

public class FirstLast {
    static void main(String[] args) {

        int[] test1 = {6, 2, 3, 4};
        int[] test2 = {1, 2, 3, 6};
        int[] test3 = {4, 2, 3, 4};

        System.out.println(premLast(test1));
        System.out.println(premLast(test2));
        System.out.println(premLast(test3));
    }

    static boolean premLast(int[] array){
        return array.length >= 1 && array[0] == array[array.length-1];
    }
}
