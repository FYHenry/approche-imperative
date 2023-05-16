package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = new int[array.length];
        for(int i = 0; i < arrayCopy.length; i++){
            arrayCopy[i] = array[arrayCopy.length - 1 - i];
        }
        System.out.printf("\u001b[33mArray sorted elements :\u001b[0m\n");
        for (int nbr: array) {
            System.out.printf("%+3d ", nbr);
        }
        System.out.printf("\n\u001b[33mArray copy retro-sorted elements :\u001b[0m\n");
        for (int nbr: arrayCopy) {
            System.out.printf("%+3d ", nbr);
        }
        System.out.printf("\n");
    }
}
