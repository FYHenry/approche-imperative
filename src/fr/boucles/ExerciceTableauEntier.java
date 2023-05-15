package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] intTable = new int[10];
        for (int i = 0; i < 10; i++) {
            intTable[i] = i;
        }
        System.out.printf("First element : %d", intTable[0]);
        System.out.printf("Table length : %d", intTable.length);
        System.out.printf("Last element : %d", intTable[intTable.length]);
        intTable[4] = 8;
    }
}
