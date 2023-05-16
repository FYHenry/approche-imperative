package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int solution = (int) ((100 * Math.random())+1);
        System.out.printf("\u001b[33mInteger in [1, 100] : \u001b[0m");
        int response = scanner.nextInt();
        int counter = 1;
        while(solution != response){
            if(solution < response){
                System.out.printf("\u001b[33mNo, lesser...  \u001b[0m");
            } else {
                System.out.printf("\u001b[33mNo, greater... \u001b[0m");
            }
            response = scanner.nextInt();
            counter++;
        }
        System.out.printf("\u001b[33mYes, the integer is \u001b[0m%d\u001b[33m after " +
            "\u001b[0m%d\u001b[33m responses.\u001b[0m\n", solution, counter);
    }
}
