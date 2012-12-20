package com.noobz.panzershoot;

import com.badlogic.gdx.Game;
import com.noobz.panzershoot.screens.GameScreen;

public class PanzerShootGame extends Game {
    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
