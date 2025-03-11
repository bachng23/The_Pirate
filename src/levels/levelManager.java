package src.levels;

import src.main.Game;
import src.utilz.loadSave;

import java.awt.*;
import java.awt.image.BufferedImage;

public class levelManager {
    private Game game;
    private BufferedImage[] levelSprite;

    public levelManager(Game game) {
            this.game = game;
//            levelSprite = loadSave.GetSpriteAtlas(loadSave.LEVEL_ATLAS);
            importOutsideSprites();
    }

    private void importOutsideSprites() {
        BufferedImage img = loadSave.GetSpriteAtlas(loadSave.LEVEL_ATLAS);
        levelSprite = new BufferedImage[48];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                int index = i * 12 + j;
                levelSprite[index] = img.getSubimage(j * 32, i * 32, 32, 32);
            }
        }
    }

    public void draw(Graphics g) {
        g.drawImage(levelSprite[2], 0, 0, null);
    }

    public void update() {

    }

}
