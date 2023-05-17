package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001b[33mInteger number : \u001b[0m");
        int nbr = scanner.nextInt();
        System.out.print("\n\u001b[33mTen next integers :\u001b[0m\n");
        for (int i = nbr+1; i < nbr+11; i++ ) {
            System.out.printf("%+3d ", i);
        }
        System.out.print("\n");
    }
}
