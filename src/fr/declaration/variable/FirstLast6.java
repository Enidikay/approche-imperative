package fr.declaration.variable;

public class FirstLast6 {
    static void main(String[] args) {
        int[] test1 = {6, 2, 3, 4};
        int[] test2 = {1, 2, 3, 6};
        int[] test3 = {1, 2, 3, 4};

        System.out.println(der6(test1));
        System.out.println(der6(test2));
        System.out.println(der6(test3));
    }

    static boolean der6(int[] array){
       return array.length >= 1 && array[0] == 6 || array[array.length - 1] == 6;
    }
}
