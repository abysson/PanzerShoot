package com.noobz.panzershoot;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: Romain
 * Date: 20/12/12
 * Time: 19:15
 * To change this template use File | Settings | File Templates.
 */
public class PanzerShootDesktopStarter {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "PanzerShoot";
        cfg.useGL20 = true;
        cfg.width = 800;
        cfg.height = 480;
        new LwjglApplication(new PanzerShootGame(), cfg);
    }
}
