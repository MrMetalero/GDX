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
	

		
		if(Gdx.input.isKeyPressed(Keys.W) && !patronActivo && !Gdx.input.isKeyPressed(Keys.S)) {
			Flecha.posicionActualFlechas = 0;
			patronActivo = true;
			patronFlechas = GenerarPatron.generarPatron(7);

			
		}

		if (patronActivo) {

			// comprueba si se ha cambiado a activa alguna flecha
			patronFlechas = LogicaFlecha.comprobarFlechaActiva(patronFlechas); 

			for (Flecha flecha : patronFlechas) {
				System.out.println(flecha.toString());
			}
			// dibuja cada flecha si la flecha está marcada como activa
			for (Flecha flecha : patronFlechas) {

				if (flecha.activa) {
					batch.draw(flecha.regiontextura, flecha.posX,Flecha.posY, flecha.texturaFlechas.getWidth()/2, flecha.texturaFlechas.getHeight()/2, flecha.texturaFlechas.getWidth(), flecha.texturaFlechas.getHeight(), 1, 1, flecha.rotacion);
					

				}

				
			}

		}


		if(Gdx.input.isKeyPressed(Keys.S)) { // Apaga el patron
			patronActivo = false;	
		}


		for (Flecha flecha : patronFlechas) {

			if (flecha.flechaDireccion == 1 && Gdx.input.isKeyPressed(Keys.UP) && flecha.isNext) {
				flecha.seleccionada = true;

			}


			if (flecha.flechaDireccion == 2 && Gdx.input.isKeyPressed(Keys.LEFT)&& flecha.isNext) {
				flecha.seleccionada = true;
				
			}
			
			if (flecha.flechaDireccion == 3 && Gdx.input.isKeyPressed(Keys.DOWN)&& flecha.isNext) {
				flecha.seleccionada = true;
				
			}
			
			if (flecha.flechaDireccion == 4 && Gdx.input.isKeyPressed(Keys.RIGHT)&& flecha.isNext) {
				flecha.seleccionada = true;
				
			}
			
			

			
		}
		

		
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
