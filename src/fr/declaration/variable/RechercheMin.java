package fr.declaration.variable;

public class RechercheMin {
    static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println(researchMin(array));
    }

    /**
     * @param array On entre le tableau dont on veut le min
     * @return retourne la valeur minimale du tableau
     */
    static int researchMin(int[] array){
        int min = array[array.length-1];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
