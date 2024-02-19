package Blackjack;

import java.util.Scanner;

public class BlackJack {
    static La_main laMain = new La_main();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("  BIENVENUE AU BLACKJACK   ");
        System.out.println("  1. Commencer             ");
        System.out.println("  2. Exit                  ");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                laMain.Distribuer_cartes();
                break;
            case 2 :

                break;
            default:
                System.out.println("Entrer 1 ou 2");
        }
    }
}
