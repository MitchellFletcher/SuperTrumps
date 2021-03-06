import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

public class MainView {
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JButton instructionsButton;
    private JButton playGameButton;
    private JComboBox setNumAI;
    public static Game game = new Game();

    public MainView() {
        mainFrame = new JFrame("Super Trumps");

        mainFrame.setVisible(true);
        mainFrame.setSize(600, 480);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBackground(Color.GRAY);

        playGameButton = new JButton("Play Game");
        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.selectDealer();
                game.dealRandomCards();
                game.setUser();
                try {
                    new GameView(game.players);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        instructionsButton = new JButton("Instructions");
        instructionsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame instructionsFrame = new JFrame("Instructions");
                instructionsFrame.setVisible(true);
                instructionsFrame.setSize(700, 700);
                instructionsFrame.setLocationRelativeTo(null);

                JPanel instructionsPanel = new JPanel();
                instructionsPanel.setBackground(Color.GRAY);
                instructionsPanel.setVisible(true);

                JTextArea instructionsArea = new JTextArea();
                instructionsArea.setEditable(false);
                instructionsArea.append(Main.instructions());
                instructionsPanel.add(instructionsArea);
                instructionsFrame.add(instructionsPanel);
            }
        });

        setNumAI = new JComboBox();
        setNumAI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numAIsString = setNumAI.getSelectedItem().toString();
                int numAIs = Integer.parseInt(numAIsString);
                Game.setNumPlayers(numAIs);
            }
        });
        setNumAI.addItem(2);
        setNumAI.addItem(3);
        setNumAI.addItem(4);

        JLabel setNumberAIsLabel = new JLabel("Set the number of opponents:");

        mainPanel.add(playGameButton);
        mainPanel.add(instructionsButton);
        mainPanel.add(setNumberAIsLabel);
        mainPanel.add(setNumAI);
        mainFrame.add(mainPanel);
        mainFrame.revalidate();
    }

    public static void aiPlayCard() {

        JOptionPane.showMessageDialog(null, "AI picking card");

        Random rand = new Random();
        Card aiCard = game.players[1].cards.remove(rand.nextInt(game.players[1].cards.size()));
        System.out.println("AI played:\n" + aiCard);
        JOptionPane.showMessageDialog(null, "AI played a card!");
//        JOptionPane.showMessageDialog(null, "AI played " + aiCard + "!");

        try {
            CardView aiCardView = new CardView(aiCard);

            TableView.currentCardView.setIcon(new ImageIcon(aiCardView.cardImage));

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        if (MainView.game.players[1].cards.size() == 0) {
            JOptionPane.showMessageDialog(null, "COMPUTER WINS!");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        new MainView();
    }
}


