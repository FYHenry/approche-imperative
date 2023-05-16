package fr.algorithmie;

import java.util.Locale;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        float medium = 0;
        for (int nbr: array
             ) {
            medium += (float) nbr;
        }
        medium = medium / (float)array.length;
        System.out.printf(new Locale("en"), "\n\u001b[33mMedium value : %+3f\u001b[0m\n", medium);
    }
}
