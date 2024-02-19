package Blackjack;

import java.util.Scanner;

public class La_main {

    public void Distribuer_cartes(){
        PaquetCartes paquet1 = new PaquetCartes();
        // Tirer plusieurs cartes et afficher les résultats
        System.out.println("================les cartes de croupier :================");
        for (int i = 0; i < 2; i++) {
            String card = paquet1.melanger();
            System.out.println("Carte tirée : " + card);
        }
        System.out.println("Total Value: " + paquet1.getTotalValuePlayer());
        PaquetCartes paquet2 = new PaquetCartes();
        System.out.println("================Vos cartes :================");
        for (int i = 0; i < 2; i++) {
            String card = paquet2.melanger();
            System.out.println("Carte tirée : " + card);
        }
        System.out.println("Total Value: " + paquet2.getTotalValuePlayer());

        if (paquet2.getTotalValuePlayer() < 21){
            Scanner scanner = new Scanner(System.in);

            System.out.println("================1 pour STAND================");
            System.out.println("================2 pour HIT================");


            int choix;
            choix = scanner.nextInt();
            switch (choix) {

                // STAND !!
                case 1 :
                    System.out.println("Le tour du croupier");
                    while (paquet1.getTotalValuePlayer() < 17){
                        String card = paquet1.melanger();
                        System.out.println("Carte tirée : " + card);
                        System.out.println("Total Value: " + paquet1.getTotalValuePlayer());
                    }

                    break;

                // HIT !!
                case 2 :
                String card = paquet2.melanger();
                System.out.println("Carte tirée : " + card);
                System.out.println("Total Value: " + paquet2.getTotalValuePlayer());
                break;
                default:
                    System.out.println("Choisit 1 ou 2 !!");
            }
        }
        else if (paquet2.getTotalValuePlayer() > 21){
            System.out.println("YOU LOST!");
        }
        else
        {
            int choix;
            Scanner scan = new Scanner(System.in);
            while (paquet2.getTotalValuePlayer() < 21) {
            System.out.println("================1 pour STAND================");
            System.out.println("================2 pour HIT================");
            choix = scan.nextInt();
                String card = paquet2.melanger();
                System.out.println("Carte tirée : " + card);
                System.out.println("Total Value: " + paquet2.getTotalValuePlayer());
            }
            if (paquet2.getTotalValuePlayer() > 21){
                System.out.println("YOU LOST!");
            } else if (paquet2.getTotalValuePlayer() == 21) {
                System.out.println("********YOU WIN********");
            }
        }
    }
}
