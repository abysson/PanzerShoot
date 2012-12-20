package com.noobz.panzershoot.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/**
 * Created with IntelliJ IDEA.
 * User: Romain
 * Date: 20/12/12
 * Time: 20:18
 * To change this template use File | Settings | File Templates.
 */
public class World {

    Array<Block> blocks = new Array<Block>();
    Panzer panzer;

    public Array<Block> getBlocks() {
        return blocks;
    }

    public Panzer getPanzer() {
        return panzer;
    }

    public World() {
        createDemoWorld();
    }

    private void createDemoWorld() {
        panzer = new Panzer(new Vector2(7, 2));

        for (int i = 0; i < 10; i++) {
            blocks.add(new Block(new Vector2(i, 0)));
            blocks.add(new Block(new Vector2(i, 6)));
            if (i > 2)
                blocks.add(new Block(new Vector2(i, 1)));
        }
        blocks.add(new Block(new Vector2(9, 2)));
        blocks.add(new Block(new Vector2(9, 3)));
        blocks.add(new Block(new Vector2(9, 4)));
        blocks.add(new Block(new Vector2(9, 5)));

        blocks.add(new Block(new Vector2(6, 3)));
        blocks.add(new Block(new Vector2(6, 4)));
        blocks.add(new Block(new Vector2(6, 5)));
    }
}
