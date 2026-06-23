package fr.declaration.variable;

public class RechercheMax {
    static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println(researchMax(array));
    }


    /**
     * @param array On entre le tableau dont on veut le max
     * @return retourne la valeur maximale du tableau
     */
    static int researchMax(int[] array) {
        int max = array[1];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


}
