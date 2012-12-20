package com.noobz.panzershoot.screens;

import com.noobz.panzershoot.model.World;
import com.noobz.panzershoot.view.*;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;

public class GameScreen implements Screen {

	private World 			world;
	private WorldRenderer 	renderer;
	
	private int width, height;
	
	@Override
	public void show() {
		world = new World();
		renderer = new WorldRenderer(world);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.1f, 0.1f, 0.1f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		renderer.render();
	}
	
	@Override
	public void resize(int width, int height) {
		//renderer.setSize(width, height);
		this.width = width;
		this.height = height;
	}

	@Override
	public void hide() {
		Gdx.input.setInputProcessor(null);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		Gdx.input.setInputProcessor(null);
	}
}
