package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d\n", i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Prénom : Frédéric");
            System.out.println("Nom : Henry");
        }
        for (int i = 2; i < 101; i += 2) {
            System.out.printf("%d\n", i);
        }
        for (int i = 1; i < 100; i += 2) {
            System.out.printf("%d\n", i);
        }
    }
}
