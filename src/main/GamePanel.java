package src.main;

import src.inputs.KeyBoardInputs;
import src.inputs.MouseInputs;
import javax.swing.JPanel;
import java.awt.*;
import static src.main.Game.GAME_HEIGHT;
import static src.main.Game.GAME_WIDTH;

public class GamePanel extends JPanel {

    private Game game;
    public GamePanel(Game game) {
        MouseInputs mouseInputs = new MouseInputs(this);
        this.game = game;
        setPanelSize();
        addKeyListener(new KeyBoardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    private void setPanelSize() {
        Dimension size = new Dimension(GAME_WIDTH, GAME_HEIGHT);
        setPreferredSize(size);
    }

    public void updateGame() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.render(g);
    }

    public Game getGame() {
        return game;
    }

}
