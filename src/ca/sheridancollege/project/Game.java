import java.util.ArrayList;
import java.util.Scanner;

class Game {

    private static Scanner scanner = new Scanner(System.in);

    private static int currentPlayer = 1;

    private static boolean isLying = false;

    Player player = new Player();

    private ArrayList<String> player1 = player.cardsToPlayerOne();
    private ArrayList<String> player2 = player.cardsToPlayerTwo();

    public Game() {
    }

    public void playGame() {

        while (player1.size() != 0 && player2.size() != 0) {
            System.out.println("Player " + currentPlayer + "'s turn");
            System.out.println("Your hand: " + getHand());

            String cards;
            String[] cardArray;

            do {

                cards = getCards();

                cardArray = cards.split("  ");

                if (cardArray.length != 2) {
                    System.out.println("You didn't Enter a Space between Cards Enter again");

                }
            } while (cardArray.length != 2);

            if (!isLying) {
                System.out.println("Player " + currentPlayer + " is telling the truth. The cards are " + cards);
            } else {
                System.out.println("Player " + currentPlayer + " is lying. The cards are not " + cards);
            }
            boolean guess = getGuess();
            if (guess == isLying) {
                if (currentPlayer == 1) {
                    System.out.println("Player 2 guessed correctly. Player 1 takes the cards back.");
                    player1.addAll(cardArrayToList(cardArray));
                } else {
                    System.out.println("Player 1 guessed correctly. Player 2 takes the cards back.");
                    player2.addAll(cardArrayToList(cardArray));
                }
                isLying = false;
            } else {
                if (currentPlayer == 1) {
                    System.out.println("Player 2 guessed incorrectly. Player 2 takes the cards.");
                    player2.addAll(cardArrayToList(cardArray));

                    player1.remove(player1.indexOf(cardArray[0]));
                    player1.remove(player1.indexOf(cardArray[1]));

                } else {
                    System.out.println("Player 1 guessed incorrectly. Player 1 takes the cards.");
                    player1.addAll(cardArrayToList(cardArray));

                    System.out.println(cardArray[0]);
                    player2.remove(player2.indexOf(cardArray[0]));
                    player2.remove(player2.indexOf(cardArray[1]));
                }
                isLying = true;
            }
            // Switch players
            if (currentPlayer == 1) {
                currentPlayer = 2;
            } else {
                currentPlayer = 1;
            }
        }
        // Declare the winner
        if (player1.size() == 0) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    // Method to get the player's

    public String getHand() {
        String hand = "";
        if (currentPlayer == 1) {
            for (String card : player1) {
                hand += card + " ";
            }
        } else {
            for (String card : player2) {
                hand += card + " ";
            }
        }
        return hand;
    }

    // Method to get the cards from the player
    public String getCards() {
        System.out.println("Enter the two cards you want to put down (separated by Two spaces): ");
        String cards = scanner.nextLine();
        return cards;
    }

    // Method to get the other player's guess
    public static boolean getGuess() {
        System.out.println("Does the other player think you're lying? (y/n)");
        String guess = scanner.nextLine();
        if (guess.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    // Method to convert an array of cards to an ArrayList
    public ArrayList<String> cardArrayToList(String[] cards) {
        ArrayList<String> cardList = new ArrayList<String>();
        for (String card : cards) {
            cardList.add(card);
        }
        return cardList;
    }

}
