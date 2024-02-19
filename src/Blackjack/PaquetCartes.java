package Blackjack;

import java.util.Random;

public class PaquetCartes {
    private Random random = new Random();
    private String[] typeArr = {"Cœur", "Pique", "Carreau", "Trèfle"};
    private String[] valueArr = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",  "JACK", "KING", "QUEEN"};

    private int totalValuePlayer;

    public PaquetCartes() {

        totalValuePlayer = 0;
    }

    public String melanger() {
        int typeRandom = random.nextInt(typeArr.length);
        int valueRandom = random.nextInt(valueArr.length);

        int cardValue = getValueAsNumber(valueArr[valueRandom]);

        totalValuePlayer += cardValue;

        return typeArr[typeRandom] + " " + valueArr[valueRandom] + " (Value: " + cardValue + ")";
    }

    public int getTotalValuePlayer() {
        return totalValuePlayer;
    }

    public int getValueAsNumber(String value) {
        if (value.equals("Ace")) {
            if (totalValuePlayer > 21) {
                return 1;
            } else {
                return 11;
            }
        } else if (value.equals("JACK") || value.equals("KING") || value.equals("QUEEN")) {
            return 10;
        } else {
            return Integer.parseInt(value);
        }
    }


}
