import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PlayerView extends JPanel {
    Player player;

    public PlayerView(Player player) throws IOException {
        super();

        this.player = player;
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.BLACK);

//        int sizePlayerHand = player.cards.size();

        for (Card card : player.cards) {
            CardView cards = new CardView(card);
            add(cards);
        }
    }

//        game.printCards(game.players[0]); this is how you print players cards
//        for (int i = 0; i < cards; i++){
//        JButton playerCards = new JButton("Card " + i);
//        add(playerCards);
//    }
}