package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        System.out.print("\n\u001b[33mElements greater than 3 :\u001b[0m\n");
        for (int i: array
        ) {
            if(i > 3){
                System.out.printf("%+3d ", i);
            }
        }
        System.out.print("\n\u001b[33mEven elements :\u001b[0m\n");
        for (int i: array
        ) {
            if(i%2 == 0){
                System.out.printf("%+3d ", i);
            }
        }
        System.out.print("\n\u001b[33mElements from even indexes :\u001b[0m\n");
        for (int i = 0; i < array.length; i+=2) {
            System.out.printf("%+3d ", array[i]);
        }
        System.out. print("\n\u001b[33mOdd elements :\u001b[0m\n");
        for (int i: array
        ) {
            if(i%2 != 0){
                System.out.printf("%+3d ", i);
            }
        }
        System.out.print("\n");
    }
}
