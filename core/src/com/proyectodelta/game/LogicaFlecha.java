package com.proyectodelta.game;

import com.badlogic.gdx.utils.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.TimerTask;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.TimeUtils;
import com.badlogic.gdx.utils.Timer.Task;

public abstract class LogicaFlecha {
    




    public static boolean flechaNextFocus(Flecha flechaInput){
        boolean flechaActivada = false;

            if (flechaInput.isNext) {
                

            }


            



        return flechaActivada;
    }



    public static ArrayList<Flecha> comprobarFlechaActiva(ArrayList<Flecha> patronFlechas){
        ArrayList<Flecha> flechasActualizadas = new ArrayList<>();
        Texture texturaActiva = new Texture("assets/flechaActiva.png");
        TextureRegion regionTexturaTemp = new TextureRegion(texturaActiva);

            for (Flecha flecha : patronFlechas) {
                if (flecha.seleccionada == true) {


                    flecha.texturaFlechas = texturaActiva; // cambia la textura a textura activa
                    flecha.regiontextura = regionTexturaTemp;
                    System.out.println("CAMBIADA TEXTURA");

                    TimerTask nueva = new TimerTask() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            throw new UnsupportedOperationException("Unimplemented method 'run'");
                        }
                        
                    };

                    Timer.schedule(nueva, 1);
                   
                    
                }
                flechasActualizadas.add(flecha); // añade las flechas al array de salida
            }


            

            return flechasActualizadas;

        
    }







}
