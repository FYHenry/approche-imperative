package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatest = Integer.MIN_VALUE;
        String addedNumbers = "";
        System.out.printf("\u001b[33mInteger #01 :%s\u001b[0m   ", addedNumbers);
        for (int i = 0; i < 10; i++) {
            final int NBR = scanner.nextInt();
            if(NBR > greatest){
                greatest = NBR;
            }
            addedNumbers = String.format("%s %+3d", addedNumbers, NBR);
            System.out.printf("\u001b[33mInteger #%02d : %s\u001b[0m   " , i, addedNumbers);
        }
        System.out.printf("\n\u001b[33mGreatest number : \u001b[0m%+3d", greatest);
    }
}
