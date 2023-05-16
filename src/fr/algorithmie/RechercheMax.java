package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int maxNbr = array[0];
        for(int nbr: array){
            if(maxNbr < nbr){
                maxNbr = nbr;
            }
        }
        System.out.printf("\n\u001b[33mGreatest element : %+3d\u001b[0m\n", maxNbr);
    }
}
