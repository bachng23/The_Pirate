package src.main;

import src.inputs.KeyBoardInputs;
import src.inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static src.main.Game.GAME_HEIGHT;
import static src.main.Game.GAME_WIDTH;
import static src.utilz.Constants.PlayerConstants.*;
import static src.utilz.Constants.Directions.*;

public class GamePanel extends JPanel {

    private Game game;
    public GamePanel(Game game) {
        addKeyListener(new KeyBoardInputs(this));
        MouseInputs mouseInputs = new MouseInputs(this);
        this.game = game;
        setPanelSize();
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    private void setPanelSize() {
        Dimension size = new Dimension(GAME_WIDTH, GAME_HEIGHT);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
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
