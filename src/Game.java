import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final int NUM_CARDS_TO_DEAL = 8;
    public String currentCardCategory;
    public Card playedCard;
    public int numPlayers;
    public int dealerId;
    public Player[] players;
    private int humanPlayerID;
    private static Card currentCard;

    Deck deck = new Deck();

    public int selectDealer() {
        Random rand = new Random();
        dealerId = rand.nextInt((numPlayers - 1) + 1);
        System.out.println("Dealer ID = " + dealerId);
        return dealerId;

    }

    public void dealRandomCards() {
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player("Player ID =" + i);
        }

        for (Player player : players) {
            ArrayList<Card> cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
        }
    }

    public void setHumanPlayer() {
        humanPlayerID = 0;
    }

    public Player getHumanPlayer() {
        return players[humanPlayerID];
    }

    public String aiTakeTurn() {
        String playTurn = "AI taking turn";
        return playTurn;
    }

    public int playerTakeTurn() {

        int choice;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Human select a Card to play");
        if (currentCard != null) {
            System.out.println(currentCard);
            System.out.println("Human Select a card to play");
        }
        choice = userInput.nextInt() - 1;
        boolean cardHasError = true;
        while (cardHasError) {
            cardHasError = checkCardError(choice);
            if (cardHasError) {
                System.out.println("Out of range");
                System.out.println("Human select a Card to play");
                choice = userInput.nextInt() - 1;
            }
        }
        currentCard = players[0].cards.remove(choice);//removes users card they just played

        if (players[0].cards.size() == 0) {// if player has 0 cards, the game is finished and the player wins
            finishGame();
        }

        // TODO: 26/09/2016 Make method to error check input range and if the card selected can be played

        return choice;
    }

    public boolean checkCardError(int choice) {
        if (players[0].cards.size() < choice || choice < 0) {
            return true;
        }
        if (currentCard.getCardCategory(currentCardCategory) < playedCard.getCardCategory(currentCardCategory)) {
            return true;
        }
        return false;
    }


    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void finishGame() {
        System.out.println("You Won!");
        System.exit(1);
    }
}


