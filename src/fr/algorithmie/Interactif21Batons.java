package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batonnetsRestants = 21;
        boolean gagne = false;
        System.out.printf("""
                Taa ta ta ta ta taaaaa !

                Vous affronterez le Maître du Jeu.
                Le Maître vous présente sur la table un plateau au centre qui contient vingt-et-un bâtonnets.
                Chaqu’un votre tour vous retirerez un, deux ou trois bâtonnets du plateau.
                Qui retirera le dernier bâtonnet sera vaincu.
                Bonne chance.
                
                À vous de commencer.
                Retirez (1), (2) ou (3) bâtonnets.
                """);
        while(batonnetsRestants > 0){
            switch (batonnetsRestants) {
                case 1 -> System.out.printf("(1) :");
                case 2 -> System.out.printf("(1|2) :");
                default -> System.out.printf("(1|2|3) :");
            }
            final int REPONSE_DU_JOUEUR = scanner.nextInt();
            if(REPONSE_DU_JOUEUR <= batonnetsRestants && REPONSE_DU_JOUEUR > 0 && REPONSE_DU_JOUEUR < 4) {
                batonnetsRestants -= REPONSE_DU_JOUEUR;
                System.out.printf("\nSur le plateau : ");
                for(int i = 0; i < batonnetsRestants; i++){
                    System.out.printf("|");
                }
                System.out.printf("\n");
                gagne = batonnetsRestants == 0;
            } else {
                System.out.printf("Choisissez un bon nombre de bâtonnets.\n");
                continue;
            }
            if(gagne){
                continue;
            }
            int reponseDuMaitre;
            switch (batonnetsRestants) {
                case 1 -> reponseDuMaitre = 1;
                case 2 -> reponseDuMaitre = (int) ((2 * Math.random())+1);
                default -> reponseDuMaitre = (int) ((3 * Math.random())+1);
            }
            if(reponseDuMaitre == 1){
                batonnetsRestants -= 1;
                System.out.printf("Le Maître enlève 1 bâtonnet du plateau.\n");
            } else {
                batonnetsRestants -= reponseDuMaitre;
                System.out.printf("Le Maître enlève %d bâtonnets du plateau.\n", reponseDuMaitre);
            }
            System.out.printf("Sur le plateau : ");
            for(int i = 0; i < batonnetsRestants; i++){
                System.out.printf("|");
            }
            System.out.printf("\n");
        }
        if(gagne){
            System.out.printf("""
                    Bravo!
                    Grâce à votre détermination infaillible vous avez vaincu!
                    Le Maître du Jeu s’en mord les doigts avant de disparaître dans l’obscurité.
                    """);
        } else {
            System.out.printf("""
                    Vous avez échoué!
                    Une fois de plus le Maître du Jeu prouve supériorité face aux novices.
                    Retenterez-vous votre chance?
                    """);
        }
    }
}
