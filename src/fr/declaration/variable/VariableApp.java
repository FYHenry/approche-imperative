package fr.declaration.variable;

public class VariableApp {
    /**
     * @param args console input
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.printf("Arguments number : \u001b[31m%d\u001b[0m\n", args.length);
        System.out.println("Args :");
        for (String arg: args) {
            System.out.printf("\t\u001b[33m%s\u001b[0m\n", arg);
        }
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
        String randomString = "Voici le résultat d’un calcul :\n\t1+5=6";
        System.out.println(randomString);
    }
}