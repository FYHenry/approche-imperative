package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        System.out.printf("Array sorted elements :\n");
        for (int i: array
        ) {
            System.out.printf("%+3d ", i);
        }
        System.out.printf("\n");
        System.out.printf("Array retro-sorted elements :\n");
        for (int i = array.length-1; i>=0; i--) {
            System.out.printf("%+3d ", array[i]);
        }
        System.out.printf("\n");
    }
}
