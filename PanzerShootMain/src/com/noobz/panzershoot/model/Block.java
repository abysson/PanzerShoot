package com.noobz.panzershoot.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created with IntelliJ IDEA.
 * User: Romain
 * Date: 20/12/12
 * Time: 20:20
 * To change this template use File | Settings | File Templates.
 */
public class Block {

    public static final float SIZE = 1f;

    Vector2 	position = new Vector2();
    Rectangle 	bounds = new Rectangle();

    public Block(Vector2 pos) {
        this.position = pos;
        this.bounds.width = SIZE;
        this.bounds.height = SIZE;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Rectangle getBounds() {
        return bounds;
    }
}
