package fr.declaration.variable;

public class DeclarateurOperateurs {
    static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + 1;
        a++;
        a += 1;
        boolean testEt = a > 0 && b < 10;
        boolean testOu = a > 0 || b < 10;
        String c = a>0 ? "a est plus grand que 0": "a est inférieur à 0";

        System.out.println(c);
    }
}

