package com.proyectodelta.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class ProyectoDelta extends ApplicationAdapter {
	SpriteBatch batch;
	Flecha flechaArriba;
	Flecha flechaAbajo;
	Flecha flechaIzquierda;
	Flecha flechaDerecha;

	@Override
	public void create () {
		batch = new SpriteBatch();
		flechaArriba = new Flecha(1);
		flechaAbajo = new Flecha(2);
		flechaIzquierda = new Flecha(3);
		flechaDerecha = new Flecha(4);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		batch.draw(flechaArriba.spriteTextura, 0, 0);
		batch.draw(flechaAbajo.spriteTextura, 60, 0);
		batch.draw(flechaIzquierda.spriteTextura, 120, 0);
		batch.draw(flechaDerecha.spriteTextura, 180, 0);
		int a = 1;
		System.out.println(a = a+a);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		flechaArriba.dispose();
	}
}
