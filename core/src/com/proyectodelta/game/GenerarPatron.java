package com.proyectodelta.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import java.util.*;

public class GenerarPatron {

    static int upperBound = 4;
    static int lowerBound = 1;

    // upperBound inclusive
    static int range = (upperBound - lowerBound) + 1;
    static int random;

    
    public static ArrayList<Flecha> generarPatron(int numeroFlechas){
        ArrayList<Flecha> patronFlechas = new ArrayList<>();
        
        for (int i = 0; i < numeroFlechas; i++) {

            random = (int)(Math.random() * range) + lowerBound; // genera un numero para la dirección de la flecha
            Flecha flechaNueva = new Flecha(random); // Genera una flecha con una dirección random

            if (i == 0) {
                flechaNueva.isNext = true; // la primera flecha generada le pone el focus
            }
            





            patronFlechas.add(flechaNueva); // Añade las flechas nuevas a un Arraylist que devolverá la función
            

        }
        
        
        
        
        return patronFlechas;

    }



}