package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
// Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }

    /**
     * Returns "true" if and only if exists a combination of small bricks (1m) and
     * big bricks (5m) to build a wall of size defined.
     * Otherwise, "false" is returned.
     *
     * @param nbSmall 1 meter brick size
     * @param nbBig 5 meter brick size
     * @param longueur total size of the wall
     * @return "It is buildable" (boolean)
     */
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        for(int bNbr = 0; bNbr < nbBig; bNbr++){
            for(int sNbr = 0; sNbr < nbSmall; sNbr++){
                resultat = resultat || bNbr * 5 + sNbr == longueur;
            }
        }
        return resultat;
    }
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b)
    {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") NON passant.");
        }
    }
}
