package Blackjack;

import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("╔═══════════════════════════╗");
        System.out.println("║        Cool Menu          ║");
        System.out.println("╠═══════════════════════════╣");
        System.out.println("║  1. Option 1              ║");
        System.out.println("║  2. Option 2              ║");
        System.out.println("║  3. Option 3              ║");
        System.out.println("║  4. Exit                  ║");
        System.out.println("╚═══════════════════════════╝");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
    }
}
