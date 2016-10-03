import java.util.ArrayList;


public class Player {

    public ArrayList<Card> cards;
    public static String playerID;

    public Player(String playerID) {
        this.playerID = playerID;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;

    }

    @Override
    public String toString() {
        return "";
    }
}
