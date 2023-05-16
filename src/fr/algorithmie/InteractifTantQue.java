package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr = 0;
        System.out.printf("\u001b[33mNumber in [1, 10] : \u001b[0m");
        while(nbr < 1 || nbr > 10){
            nbr = scanner.nextInt();
        }

    }
}
