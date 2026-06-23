package fr.declaration.variable;

public class CalculMoyenne {
    static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        System.out.println(calculateAverage(array));
    }

    /**
     *
     * @param array On entre le tableau dont on veut la moyenne
     * @return retourne la moyenne calculée
     */
    static double calculateAverage(int[] array){
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total+=array[i];
        }

        return total/array.length;
    }
}
