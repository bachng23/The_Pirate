package src.levels;

import src.main.Game;
import src.utilz.loadSave;

import java.awt.*;
import java.awt.image.BufferedImage;

import static src.main.Game.TILE_SIZE;

public class levelManager {
    private Game game;
    private BufferedImage[] levelSprite;
    private Level levelOne;

    public levelManager(Game game) {
            this.game = game;
//            levelSprite = loadSave.GetSpriteAtlas(loadSave.LEVEL_ATLAS);
            importOutsideSprites();
            levelOne = new Level(loadSave.GetLevelData());
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
        for (int i = 0; i < Game.TILE_IN_HEIGHT; i++) {
            for (int j = 0; j < Game.TILE_IN_WIDTH; j++) {
                int index = levelOne.getSpriteIndex(j, i);
                g.drawImage(levelSprite[index], j*TILE_SIZE, i*TILE_SIZE, TILE_SIZE, TILE_SIZE, null);
            }
        }
    }

    public void update() {

    }

    public Level getCurrentLevel() {
        return levelOne;
    }
}
