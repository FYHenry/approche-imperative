package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        System.out.printf("\u001b[33mArray sorted elements :\u001b[0m\n");
        for (int nbr: array
        ) {
            System.out.printf("%+3d ", nbr);
        }
        System.out.printf("\n\u001b[33mArray retro-sorted elements :\u001b[0m\n");
        for (int i = array.length - 1; i > 0; i--) {
            System.out.printf("%+3d ", array[i]);
        }
        System.out.printf("\n");
        int[] arrayCopy = array.clone();
    }
}
