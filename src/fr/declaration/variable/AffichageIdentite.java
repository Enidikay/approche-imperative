package fr.declaration.variable;

public class AffichageIdentite {
    static void main(String[] args) {
        affichageIdentitee("Kenan Yildiz", 10);
    }

    static void affichageIdentitee(String identite, int nombreDeFois){
        for(int i = 0; i < nombreDeFois; i++){
            System.out.println(identite);
        }
    }
}
