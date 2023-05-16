package fr.algorithmie;

import java.util.Locale;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int[] array0 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array1 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        int[] array2 = new int[array0.length];
        for(int i = 0; i < array0.length; i++){
            array2[i] = array0[i] + array1[i];
        }
        System.out.printf("\n\u001b[33mSum array :\u001b[0m\n");
        for (int nbr: array2) {
            System.out.printf("%+3d ", nbr);
        }
        System.out.printf("\n");
    }
}
