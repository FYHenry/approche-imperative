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
        int[] arrayCopy = array.clone();
        if(arrayCopy == array) {
            System.out.printf("\n\u001b[33mThe clone of the integers array is the same array.\u001b[0m\n");
        } else {
            System.out.printf("\n\u001b[33mThe clone of the integers array isn't the same array.\u001b[0m\n");
        }


    }
}
