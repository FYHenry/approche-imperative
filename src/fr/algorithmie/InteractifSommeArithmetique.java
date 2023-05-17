package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001b[33mInteger number : \u001b[0m");
        int nbr = scanner.nextInt();
        int sum = 0;
        while(nbr > 0) {
            sum += nbr--;
        }
        System.out.printf("\n\u001b[33mArithmetic sum : \u001b[0m%+3d\n", sum);
    }
}
