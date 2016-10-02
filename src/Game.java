import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final int NUM_CARDS_TO_DEAL = 8;
    public Player[] players;
    public Card currentCard;
    public int numPlayers;
    public int dealerId;
    public String currentCardCategory;
    public String chosenCategory;

    Deck deck = new Deck();
    private int humanPlayerID;

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

    public void aiTakeTurn() {
        Player aiPlayer = players[Main.currentPlayer];
        int aiChoice;
        int counter = aiPlayer.cards.size();
        if (currentCardCategory == null) {
            currentCardCategory = comPickCategory();
        }
        if (currentCard == null) {
            Random rand = new Random();
            currentCard = aiPlayer.cards.remove(rand.nextInt(aiPlayer.cards.size()));
        }
        if (aiPlayer.cards.size() == 0) {
            System.out.println("Computer Wins");
            finishGame();
        } else {
            for (int i = 0; i < aiPlayer.cards.size(); i++) {
                aiChoice = i;

                if (aiPlayer.cards.get(aiChoice).getCardCategory(currentCardCategory) < currentCard.getCardCategory(currentCardCategory)) {
                    System.out.println("Com selecting card");
                    counter--;
                    if(counter == 0){
                        System.out.println("Com unable to play card");
                        skipTurn();
                    }
                } else {
                    currentCard = aiPlayer.cards.remove(aiChoice);
                    System.out.println("Com selecting card\n");
                    System.out.println("Com picked: " + currentCard);
                    break;
                }
            }
        }
    }

    private void skipTurn() {
        if ()
    }

    public boolean isTrumpCard(int choice){
        Card card = players[0].cards.get(choice);
        return card.getCardType().equals("trump");
    }

    private String comPickCategory() {
        String[] aiCategoryChoice = {"Hardness", "Cleavage", "Specific Gravity", "Crustal Abundance", "Economic Value"};
        String aiChoiceCat;
        System.out.println("Com selecting category");
        aiChoiceCat = (aiCategoryChoice[new Random().nextInt(aiCategoryChoice.length)]);
        System.out.println(aiChoiceCat);

        return aiChoiceCat;
    }

    public int playerTakeTurn() {

        int choice = 0;
        System.out.println("Current Category: " + currentCardCategory);

        if (currentCardCategory == null) {
            Scanner getCategory = new Scanner(System.in);
            System.out.println("Enter desired category");

            chosenCategory = getCategory.nextLine();
            boolean choiceError = true;
            while (choiceError) {

                choiceError = checkInputCategory(chosenCategory);
                if (choiceError) {
                    System.out.println("Enter card category");
                    chosenCategory = getCategory.nextLine();
                }

            }
            currentCardCategory = chosenCategory;
        }

        Scanner userInput = new Scanner(System.in);
        System.out.println("Select a card to play");

        if (currentCard == null) {
            System.out.println("Pick a card");
            choice = userInput.nextInt() - 1;
        }
        if (currentCard != null) {
            System.out.println("\nCurrent card: ");
            System.out.println(currentCard);
            System.out.println("Select a card to play");
            choice = userInput.nextInt() - 1;


            boolean cardHasError = true;
            while (cardHasError) {
                cardHasError = checkCardError(choice);
                if (cardHasError) {
                    System.out.println("Select a card to play");
                    choice = userInput.nextInt() - 1;
                }
            }
        }
        currentCard = players[0].cards.remove(choice);//removes users card they just played

        if (players[0].cards.size() == 0) {// if player has 0 cards, the game is finished and the player wins
            finishGame();
        }

        return choice;
    }

    public boolean checkInputCategory(String inputCategory) {
        if (inputCategory.equals("Hardness") || (inputCategory.equals("Specific Gravity") ||
                (inputCategory.equals("Cleavage") || (inputCategory.equals("Crustal Abundance") || (inputCategory.equals("Economic Value")))))) {
            return false;
        }
        System.out.println("Please select a valid category");
        return true;
    }

    public boolean checkCardError(int choice) {

        if (players[0].cards.size() <= choice || choice < 0) {
            System.out.println("Card out of range");
            return true;
        }
        if (players[0].cards.get(choice).getCardCategory(currentCardCategory) < currentCard.getCardCategory(currentCardCategory)) {
            System.out.println("Value too low!");
            return true;
        }
        return false;
    }


    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void finishGame() {

        if (players[humanPlayerID].cards.size() == 0) {
            System.out.println("You won!");
        } else {
            System.out.println("YOU LOST SCRUB!");
        }
        Main.gameIsOn = false;
    }
}


