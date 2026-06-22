package fr.declaration.variable;

public class ExerciceTableauChaines {
    static void main(String[] args) {
        String[] tableau = {"Marseille", "Paris", "Montpellier", "Toulouse", "Bordeaux"};
        afficher(tableau);
        System.out.println(tableau.length);
        tableau[3] = "Reims";
        afficher(tableau);
    }

    static void afficher(String[] tbl){
        for (int i = 0; i < tbl.length; i++) {
            System.out.println(tbl[i]);
        }
    }
}
