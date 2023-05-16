package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batonnetsRestants = 21;
        boolean perdu = false;
        System.out.print("""
                \u001b[33m
                Taa ta ta ta ta taaaaa !

                Vous affronterez le Maître du Jeu.
                Le Maître vous présente sur la table un plateau au centre qui contient vingt-et-un bâtonnets.
                Chaqu’un votre tour vous retirerez un, deux ou trois bâtonnets du plateau.
                Qui retirera le dernier bâtonnet sera vaincu.
                Bonne chance.
                
                À vous de commencer.
                Retirez (1), (2) ou (3) bâtonnets.\u001b[0m
                """);
        while(batonnetsRestants > 0){
            switch (batonnetsRestants) {
                case 1 -> System.out.print("\u001b[33m(1) : \u001b[0m");
                case 2 -> System.out.print("\u001b[33m(1|2) : \u001b[0m");
                default -> System.out.print("\u001b[33m(1|2|3) : \u001b[0m");
            }
            final int REPONSE_DU_JOUEUR = scanner.nextInt();
            if(REPONSE_DU_JOUEUR <= batonnetsRestants && REPONSE_DU_JOUEUR > 0 && REPONSE_DU_JOUEUR < 4) {
                batonnetsRestants -= REPONSE_DU_JOUEUR;
                System.out.print("\n\u001b[33mSur le plateau : \u001b[32m");
                for(int i = 0; i < batonnetsRestants; i++){
                    System.out.print("|");
                }
                System.out.print("\u001b[0m\n");
                perdu = batonnetsRestants == 0;
            } else {
                System.out.print("\u001b[33mChoisissez un bon nombre de bâtonnets.\u001b[0m\n");
                continue;
            }
            if(perdu){
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
                System.out.print("\u001b[33mLe Maître enlève 1 bâtonnet du plateau.\u001b[0m\n");
            } else {
                batonnetsRestants -= reponseDuMaitre;
                System.out.printf("\u001b[33mLe Maître enlève %d bâtonnets du plateau.\u001b[0m\n", reponseDuMaitre);
            }
            System.out.print("\u001b[33mSur le plateau : \u001b[32m");
            for(int i = 0; i < batonnetsRestants; i++){
                System.out.print("|");
            }
            System.out.print("\u001b[0m\n");
        }
        if(perdu){
            System.out.print("""
                    
                    \u001b[33mVous avez échoué!
                    Une fois de plus le Maître du Jeu prouve supériorité face aux novices.
                    Retenterez-vous ce défi?\u001b[0m
                    """);
        } else {
            System.out.print("""
                    
                    \u001b[33mBravo!
                    Grâce à votre détermination infaillible vous avez vaincu!
                    Le Maître du Jeu s’en mord les doigts avant de disparaître dans l’obscurité.\u001b[0m
                    """);
        }
    }
}
