package com.proyectodelta.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;

public abstract class LogicaFlecha {
    




    public static boolean flechaNextFocus(Flecha flechaInput){
        boolean flechaActivada = false;

            if (flechaInput.isNext) {
                

            }


            



        return flechaActivada;
    }


    public static ArrayList<Flecha> comprobarFlechaActiva(ArrayList<Flecha> patronFlechas){
        ArrayList<Flecha> flechasActualizadas = new ArrayList<>();
        Texture texturaActiva = new Texture("flechaActiva.png");

            for (Flecha flecha : patronFlechas) {
                if (flecha.seleccionada == true) {
                    flecha.texturaFlechas = texturaActiva; // cambia la textura a textura activa
                }

                flechasActualizadas.add(flecha); // añade las flechas al array de salida
            }


            

            return flechasActualizadas;

        
    }







}
