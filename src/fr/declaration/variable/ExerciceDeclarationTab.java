package fr.declaration.variable;

public class ExerciceDeclarationTab {
    static void main(String[] args) {
        int[] tableau = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println(tableau[0]);
        System.out.println(tableau.length);
        System.out.println(tableau[tableau.length-1]);
        /* System.out.println(tableau[10]); cela échoue car ça va au de là de la taille de la liste*/
    }

}

