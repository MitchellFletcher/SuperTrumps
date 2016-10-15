import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JButton instructionsButton;
    private JButton playGameButton;
    private JComboBox setNumComs;

    public MainView() {
        mainFrame = new JFrame("Super Trumps");

        mainFrame.setVisible(true);
        mainFrame.setSize(1280, 720);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
        mainPanel.setBackground(Color.GRAY);

        playGameButton = new JButton("Play Game");
        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame playGameFrame = new JFrame("Super Trumps");
                playGameFrame.setVisible(true);
                playGameFrame.setSize(1280, 720);
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

        setNumComs = new JComboBox();
        setNumComs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numComsString = setNumComs.getSelectedItem().toString();
                int numComs = Integer.parseInt(numComsString);
                Game.setNumPlayers(numComs);
            }
        });
        setNumComs.addItem(2);
        setNumComs.addItem(3);
        setNumComs.addItem(4);

        JLabel setNumberComsLabel = new JLabel("Set the number of opponents:");

        mainPanel.add(playGameButton);
        mainPanel.add(instructionsButton);
        mainPanel.add(setNumberComsLabel);
        mainPanel.add(setNumComs);
        mainFrame.add(mainPanel);
        mainFrame.revalidate();
    }

    public static void main(String[] args) {
        new MainView();
    }
}

