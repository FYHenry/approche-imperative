package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int minNbr = array[0];
        for(int nbr: array){
            if(minNbr > nbr){
                minNbr = nbr;
            }
        }
        System.out.printf("\n\u001b[33mLowest element : %+3d\u001b[0m\n", minNbr);
    }
}
