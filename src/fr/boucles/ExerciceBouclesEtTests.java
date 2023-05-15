package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        System.out.printf("\u001b[31mArray sorted elements :\u001b[0m\n");
        for (int i: array
        ) {
            System.out.printf("%+3d ", i);
        }
        System.out.printf("\n");
        System.out.printf("\u001b[31mArray retro-sorted elements :\u001b[0m\n");
        for (int i = array.length-1; i>=0; i--) {
            System.out.printf("%+3d ", array[i]);
        }
        System.out.printf("\n");
        System.out.printf("\u001b[31mElements greater than 3 :\u001b[0m\n");
        for (int i: array
        ) {
            if(i > 3){
                System.out.printf("%+3d ", i);
            }
        }
        System.out.printf("\n");
        System.out.printf("\u001b[31mEven elements :\u001b[0m\n");
        for (int i: array
        ) {
            if(i%2 == 0){
                System.out.printf("%+3d ", i);
            }
        }
        System.out.printf("\n");
        System.out.printf("\u001b[31mElements from even indexes :\u001b[0m\n");
        for (int i = 0; i < array.length; i+=2) {
            System.out.printf("%+3d ", array[i]);
        }
        System.out.printf("\n");
        System.out.printf("\u001b[31mOdd elements :\u001b[0m\n");
        for (int i: array
        ) {
            if(i%2 != 0){
                System.out.printf("%+3d ", i);
            }
        }
        System.out.printf("\n");

    }
}
