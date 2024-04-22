package com.proyectodelta.game;

import java.util.ArrayList;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class ProyectoDelta extends ApplicationAdapter {
	SpriteBatch batch;
	ArrayList<Flecha> patronFlechas = new ArrayList<>();
	boolean patronActivo = false;

	@Override
	public void create () {
		batch = new SpriteBatch();


	}



	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
	

		if(Gdx.input.isKeyPressed(Keys.W)) {
			Flecha.posicionActualFlechas = 0;
			patronActivo = true;
			patronFlechas = GenerarPatron.generarPatron(7);

			
		}

		if (patronActivo) {
			for (Flecha flecha : patronFlechas) {

				if (flecha.activa) {
					batch.draw(flecha.regiontextura, flecha.posX,Flecha.posY, flecha.texturaFlechas.getWidth()/2, flecha.texturaFlechas.getHeight()/2, flecha.texturaFlechas.getWidth(), flecha.texturaFlechas.getHeight(), 1, 1, flecha.rotacion);
			
				}

				
			}



		}

		if(Gdx.input.isKeyPressed(Keys.S)) { // Apaga el patron
			patronActivo = false;	
		}




		

		
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
