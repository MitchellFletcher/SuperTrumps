import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class PlayerView extends JPanel {
    Player player;
    private static Deck deck = new Deck();

    public PlayerView(Player player) throws IOException {
        super();

        JButton drawCardButton = new JButton("Draw Card!");
        add(drawCardButton);

        this.player = player;
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.BLACK);

        for (Card card : player.cards) {
            CardView cards = new CardView(card);
            add(cards);
        }
        drawCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawCard();
                MainView.aiPlayCard();
                revalidate();
            }
        });
    }

    public void drawCard() {
        Card drawnCard = deck.dealCards(1).remove(0);
        System.out.println(drawnCard);
        revalidate();
        try {
            add(new CardView(drawnCard));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
