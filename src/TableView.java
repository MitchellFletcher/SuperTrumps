import javax.swing.*;
import java.awt.*;

public class TableView extends JPanel {
    String currentCardCategoryView;

    public TableView(){

        super();

        setLayout(new FlowLayout (FlowLayout.CENTER, 200, 150));
        setVisible(true);

        setBackground(Color.GRAY);
        JLabel currentCardView = new JLabel("Current card in play");
        JLabel currentCardCategoryView = new JLabel("Current category\n");
        JButton drawCardButton = new JButton("Draw Card!");

        add(currentCardView);
        add(currentCardCategoryView);
        add(drawCardButton);
    }
}
