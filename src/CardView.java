import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CardView extends JPanel {

    JLabel currentCardView = TableView.currentCardView;

    BufferedImage cardImage;
    String workingDirectory = System.getProperty("user.dir");
    JButton viewCard;

    public CardView(Card card) throws IOException {


        try {
            cardImage = ImageIO.read(new File(workingDirectory + "/res/" + card.fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        cardImage = cardResize(cardImage, 235, 325, BufferedImage.TYPE_INT_ARGB);
        viewCard = new JButton(new ImageIcon(cardImage));
        add(viewCard);
        revalidate();
        viewCard.addActionListener(e -> {
            if (MainView.game.players[0].cards.size() == 1) {
                JOptionPane.showMessageDialog(null, "CONGRATULATIONS YOU WON!");
                System.exit(1);
            }

            currentCardView.setIcon(new ImageIcon(cardImage));
            remove(viewCard);
            MainView.game.players[0].cards.remove(card);
            revalidate();
            MainView.aiPlayCard();
            revalidate();
        });
    }

    private BufferedImage cardResize(BufferedImage cardImage, int i, int i1, int typeIntArgb) {
        BufferedImage cardResized = new BufferedImage(i, i1, typeIntArgb);
        Graphics2D g = cardResized.createGraphics();
        g.drawImage(cardImage, 0, 0, i, i1, null);
        g.dispose();
        return cardResized;
    }


}
