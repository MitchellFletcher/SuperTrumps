import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private static final int NUM_CARDS_TO_DEAL = 8;
    public Player[] players;
    public Card currentCard;
    public static int numPlayers;
    public int dealerId;
    public String currentCardCategory;
    public String chosenCardCategory;

    Deck deck = new Deck();
    private int userID;

    public void setUser() {
        userID = 0;
    }

    public Player getUser() {
        return players[userID];
    }

    public int selectDealer() {
        Random rand = new Random();
        dealerId = rand.nextInt((numPlayers - 1) + 1);
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


    public void aiTakeTurn() {
        Player aiPlayer = players[Main.currentPlayer];
        int aiChoice;
        int counter = aiPlayer.cards.size();
        if (currentCardCategory == null) {
            currentCardCategory = aiPickCategory();
        }
        if (currentCard == null) {
            Random rand = new Random();
            currentCard = aiPlayer.cards.remove(rand.nextInt(aiPlayer.cards.size()));
        }
        if (aiPlayer.cards.size() == 0) {
            System.out.println("AI" + Player.playerID + " Wins");
            finishGame();
        } else {
            for (int i = 0; i < aiPlayer.cards.size(); i++) {
                aiChoice = i;

                if (aiPlayer.cards.get(aiChoice).getCardCategory(currentCardCategory) < currentCard.getCardCategory(currentCardCategory)) {
                    System.out.println("AI selecting card...");
                    counter--;
                    if (counter == 0) {
                        System.out.println("AI unable to play card");
                        Card pickedCard = deck.dealCards(1).remove(0);
                        aiPlayer.cards.add(pickedCard);
                        System.out.println("AI drew a card");
                        break;
                    }
                } else {
                    currentCard = aiPlayer.cards.remove(aiChoice);

                    System.out.println("AI picked: " + currentCard);
                    break;
                }
            }
        }
    }

    private void skipTurn() {
        System.out.println("Skipping turn!");
        drawCard();
    }

    private void drawCard() {
        Card pickedCard = deck.dealCards(1).remove(0);
        players[0].cards.add(pickedCard);
    }

    public boolean isTrumpCard(int choice) {
        return currentCard.getCardType().equals("trump");
    }

    private String aiPickCategory() {
        String[] aiCategoryChoice = {"Hardness", "Cleavage", "Specific Gravity", "Crustal Abundance", "Economic Value"};
        String aiChoiceCategory;
        System.out.println("AI selecting category");
        aiChoiceCategory = (aiCategoryChoice[new Random().nextInt(aiCategoryChoice.length)]);
        System.out.println(aiChoiceCategory);

        return aiChoiceCategory;
    }

    public String getCategory() {
        Scanner getCategory = new Scanner(System.in);
        System.out.println("Enter desired category");

        chosenCardCategory = getCategory.nextLine();
        boolean choiceError = true;
        while (choiceError) {

            choiceError = checkInputCategory(chosenCardCategory);
            if (choiceError) {
                System.out.println("Enter desired category");
                chosenCardCategory = getCategory.nextLine();
            }
        }
        return chosenCardCategory;
    }

    public void playerTakeTurn() {
        int choice;

        if (currentCardCategory == null) {
            currentCardCategory = getCategory();
        }

        Scanner userCardInput = new Scanner(System.in);
        System.out.println("\nCurrent card: " + currentCard);
        System.out.println("Current Category: " + currentCardCategory);
        System.out.println("\nSelect a card to play or type 99 to skip your turn");
        choice = userCardInput.nextInt() - 1;

        if (choice == 98) {
            drawCard();
            return;
        }
        boolean cardHasError = true;
        while (cardHasError) {
            cardHasError = checkCardError(choice);
            if (cardHasError) {
                System.out.println("Select a card to play or type 99 to skip your turn");
                choice = userCardInput.nextInt() - 1;
                if (choice == 98) {
                    drawCard();
                    return;
                }
            }
        }

        currentCard = players[0].cards.remove(choice);

        if (currentCard == null) {
            System.out.println("Pick a card");
            choice = userCardInput.nextInt() - 1;
        }
        if (currentCard != null) {
            if (isTrumpCard(choice)) {
                System.out.println("Card is a Trump");
                if (currentCard.getCardTitle().equals("The Miner")) {
                    currentCardCategory = currentCard.getChemistry();
                }
                if (currentCard.getCardTitle().equals("The Petrologist")) {
                    currentCardCategory = currentCard.getChemistry();
                }
                if (currentCard.getCardTitle().equals("The Mineralogist")) {
                    currentCardCategory = currentCard.getChemistry();
                }
                if (currentCard.getCardTitle().equals("The Geophysicist")) {
                    currentCardCategory = currentCard.getChemistry();
                }
                if (currentCard.getCardTitle().equals("The Geologist")) {
                    currentCardCategory = getCategory();
                }
            }

            if (players[0].cards.size() == 0) {
                finishGame();
            }
        }
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
        if (choice == 98) {
            skipTurn();
        } else if (players[0].cards.size() <= choice || choice < 0) {
            System.out.println("Card out of range");
            return true;
        } else if (players[userID].cards.get(choice).getCardType().equals("trump")) {
            return false;
        } else if (currentCard != null) {
            if (players[0].cards.get(choice).getCardCategory(currentCardCategory) < currentCard.getCardCategory(currentCardCategory)) {
                System.out.println("Category value too low!");
                return true;
            }
        }
        return false;
    }

    public static void setNumPlayers(int numberPlayers) {
        numPlayers = numberPlayers;
    }

    public void finishGame() {

        if (players[userID].cards.size() == 0) {
            System.out.println("YOU WON!");
        } else {
            System.out.println("YOU LOST!");
        }
        Main.gameIsOn = false;
    }
}