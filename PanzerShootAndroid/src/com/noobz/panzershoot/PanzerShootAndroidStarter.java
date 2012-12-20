package com.noobz.panzershoot;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: Romain
 * Date: 20/12/12
 * Time: 19:18
 * To change this template use File | Settings | File Templates.
 */
public class PanzerShootAndroidStarter extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useAccelerometer = false;
        cfg.useCompass = false;
        cfg.useWakelock = true;
        cfg.useGL20 = true;
        initialize(new PanzerShootGame(), cfg);
    }
}
