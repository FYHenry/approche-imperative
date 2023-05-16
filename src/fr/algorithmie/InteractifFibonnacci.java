package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = -1;
        while(N < 0){
            System.out.printf("\u001b[33mFibonnacci rank (natural integer): \u001b[0m");
            N = scanner.nextInt();
        }
        System.out.printf("\u001b[33mFibonnacci sum to rank %d: \u001b[0m%d", N, sumTo(N));
    }

    /**
     * Fibonnacci series sum to N rank.
     * @param N Rank (natural integer)
     * @return Sum (Natural integer)
     */
    private static int sumTo(int N){
        int u0 = 0;
        int u1 = 1;
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        int un = 0;
        for(int n = 2; n <= N; n++){
            un = u0 + u1;
            u0 = u1;
            u1 = un;
        }
        return un;
    }
}

/**
 * Wanted but… why ?
 */
class TestFibonnacci{}