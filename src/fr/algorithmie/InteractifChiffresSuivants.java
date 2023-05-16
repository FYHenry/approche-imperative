package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("\u001b[33mInteger number : \u001b[0m");
        int nbr = scanner.nextInt();
        System.out.printf("\n\u001b[33mTen next integers :\u001b[0m\n");
        for (int i = nbr+1; i < nbr+11; i++ ) {
            System.out.printf("%+3d ", i);
        }
        System.out.printf("\n");
    }
}
