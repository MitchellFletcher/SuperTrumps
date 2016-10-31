import javax.swing.*;
import java.awt.*;

public class TableView extends JPanel {
    static JLabel currentCardView;
    String currentCardCategoryView;

    public TableView() {

        super();

        setLayout(new FlowLayout(FlowLayout.CENTER, 200, 0));
        setVisible(true);

        setBackground(Color.GRAY);
        currentCardView = new JLabel("");
        JLabel currentCardCategoryView = new JLabel("Current category: " + SelectCategoryView.getCurrentCategory());


        add(currentCardView);
        add(currentCardCategoryView);

    }
}
