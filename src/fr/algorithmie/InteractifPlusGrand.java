package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        String inputBegin = "\u001b[33mInteger number : ";
        final String inputEnd = "\u001b[0m";
        System.out.printf("%s%s", inputBegin, inputEnd);
        for (int nbr : array
        ) {
            nbr = scanner.nextInt();
            inputBegin = String.format("\r%s %+3d", inputBegin, nbr);
            System.out.printf("%s%s ", inputBegin, inputEnd);
        }
    }
}
