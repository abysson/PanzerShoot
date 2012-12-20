package com.noobz.panzershoot.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created with IntelliJ IDEA.
 * User: Romain
 * Date: 20/12/12
 * Time: 20:15
 * To change this template use File | Settings | File Templates.
 */
public class Panzer {

    public enum State {
        IDLE, WALKING, JUMPING, DYING
    }

    public static final float SPEED = 4f;	// unit per second
    public static final float JUMP_VELOCITY = 4f;
    public static final float SIZE = 0.5f; // half a unit

    Vector2 position = new Vector2();
    Vector2 	acceleration = new Vector2();
    Vector2 	velocity = new Vector2();
    Rectangle bounds = new Rectangle();
    State		state = State.IDLE;
    boolean		facingLeft = true;

    public Panzer(Vector2 acceleration) {
        this.acceleration = acceleration;
        this.bounds.height = SIZE;
        this.bounds.width = SIZE;
    }

    public Vector2 getAcceleration() {
        return acceleration;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public State getState() {
        return state;
    }

    public Vector2 getPosition() {
        return position;
    }
}
