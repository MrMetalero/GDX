package com.proyectodelta.game;

import com.badlogic.gdx.utils.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
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

        Iterator<Flecha> iterator = patronFlechas.iterator();

        while (iterator.hasNext()) {
            Flecha flechaTemp = iterator.next();
            //Se comprueba solo si se ha seleccionado la flecha
            if (flechaTemp.seleccionada == true) {

                
                flechaTemp.texturaFlechas = texturaActiva; // cambia la textura a textura activa
                flechaTemp.regiontextura = regionTexturaTemp;
                System.out.println("CAMBIADA TEXTURA");

                //Deja de marcar la flecha seleccionada como la siguiente
                flechaTemp.isNext = false;

                //Elimina la flecha del patrón (Es posible que isNext no sea necesario)
                

                patronFlechas.get(patronFlechas.lastIndexOf(flechaTemp)+1).isNext = true;
                patronFlechas.remove(flechaTemp);
            }
            flechasActualizadas.add(flechaTemp); // añade las flechas al array de salida

        }

        return flechasActualizadas;

        
    }







}
