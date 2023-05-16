package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array0 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array1 = {-1, 12, 17, 14, 5, -9, 0, 18 };
        int[] array2;
        if(array0.length < array1.length){
            array2 = new int[array1.length];
            for(int i = 0; i < array0.length; i++){
                array2[i] = array0[i] + array1[i];
            }
            for(int i = array0.length; i < array1.length; i++){
                array2[i] = array1[i];
            }
        } else {
            array2 = new int[array0.length];
            for(int i = 0; i < array1.length; i++){
                array2[i] = array0[i] + array1[i];
            }
            for(int i = array1.length; i < array0.length; i++){
                array2[i] = array0[i];
            }
        }
        System.out.printf("\n\u001b[33mSum array :\u001b[0m\n");
        for (int nbr: array2) {
            System.out.printf("%+3d ", nbr);
        }
        System.out.printf("\n");
    }
}
