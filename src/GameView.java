import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameView extends JFrame {

    public PlayerView playerView;
    public TableView tableView = new TableView();

    public GameView(Player[] players) throws IOException {

        super("Super Trumps");
        setVisible(true);
        setLayout(new BorderLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setSize(1366, 768);
//        setLocationRelativeTo(null);


        playerView = new PlayerView(players[0]);
        JScrollPane playerViewScroll = new JScrollPane(playerView,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(playerViewScroll, BorderLayout.SOUTH);
        add(playerViewScroll, BorderLayout.CENTER);
        add(tableView, BorderLayout.NORTH);
    }
}
