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
		batch.draw(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, true);;
		batch.draw(flechaAbajo.spriteTextura, 60, 0, flechaAbajo.spriteTextura.getWidth() / 2, flechaAbajo.spriteTextura.getHeight() / 2, flechaAbajo.spriteTextura.getWidth(), flechaAbajo.spriteTextura.getHeight(), 1, 1, flechaAbajo.spriteTextura.getRotation(), 0, 0, flechaAbajo.spriteTextura.getWidth(), flechaAbajo.spriteTextura.getHeight(), false, false);
		batch.draw(flechaIzquierda.spriteTextura, 120, 0, flechaIzquierda.spriteTextura.getWidth() / 2, flechaIzquierda.spriteTextura.getHeight() / 2, flechaIzquierda.spriteTextura.getWidth(), flechaIzquierda.spriteTextura.getHeight(), 1, 1, flechaIzquierda.spriteTextura.getRotation(), 0, 0, flechaIzquierda.spriteTextura.getWidth(), flechaIzquierda.spriteTextura.getHeight(), false, false);
		batch.draw(flechaDerecha.spriteTextura, 180, 0, flechaDerecha.spriteTextura.getWidth() / 2, flechaDerecha.spriteTextura.getHeight() / 2, flechaDerecha.spriteTextura.getWidth(), flechaDerecha.spriteTextura.getHeight(), 1, 1, flechaDerecha.spriteTextura.getRotation(), 0, 0, flechaDerecha.spriteTextura.getWidth(), flechaDerecha.spriteTextura.getHeight(), false, false);

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
