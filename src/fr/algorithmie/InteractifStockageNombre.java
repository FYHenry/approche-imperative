package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    /**
     * NB: A characters string is an extended array.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String integersList = "";
        System.out.print("\u001b[33m\t1. Ajouter un nombre\u001b[0m\n");
        System.out.print("\u001b[33m\t2. Afficher les nombres existants\u001b[0m\n");
        System.out.print("\u001b[33m(1|2) : \u001b[0m");
        int response = scanner.nextInt();
        while(1 == response){
            System.out.print("\u001b[33mNouveau nombre entier : \u001b[0m");
            integersList = integersList + String.format("\n %d",scanner.nextInt());
            System.out.print("\u001b[33m(1|2) : \u001b[0m");
            response = scanner.nextInt();
        }
        System.out.printf("\u001b[33mTable des entiers :\u001b[0m\n=====" + integersList + "\n=====\n");
    }
}
