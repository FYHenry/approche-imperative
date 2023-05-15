package fr.declaration.variable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte byteNumber = 1;
        short shortNumber = 1;
        int intNumber = 1;
        float floatNumber = 1;
        double doubleNumber = 1;
        char charNumber = '1';
        boolean booleanNumber = true;
        String stringNumber = "1";
        System.out.println("byte : " + String.format("%d", byteNumber));
        System.out.println("byte : " + String.format("%d", shortNumber));
        System.out.println("byte : " + String.format("%d", intNumber));
        System.out.println("byte : " + String.format("%f", floatNumber));
        System.out.println("byte : " + String.format("%f", doubleNumber));
        System.out.println("byte : " + String.format("%c", charNumber));
        System.out.println("byte : " + String.format("%s", booleanNumber));
        System.out.println("byte : " + String.format("%s", stringNumber));
        String randomString = "Voici le résultat d’un calcul :\n1+5=6";
        System.out.println(randomString);
    }
}