import java.util.ArrayList;


public class Player {

    public ArrayList<Card> cards;
    private String playerId;

    public Player(String playerId){
        this.playerId = playerId;
    }

    public void setCards(ArrayList<Card> cards){
        this.cards = cards;

    }
    @Override
    public String toString(){
        return "Player ID=" + playerId;
    }

}
