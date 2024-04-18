package com.proyectodelta.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Flecha{

    static Texture texturaFlechas = new Texture("flecha.png");

   

    Sprite spriteTextura = new Sprite(texturaFlechas, texturaFlechas.getWidth(), texturaFlechas.getHeight());
    boolean flechaEstado = false;
    int flechaDireccion = 0;
    

    Flecha(){

    }

    Flecha(int flechaDir){
        flechaDireccion = flechaDir;
    switch (flechaDireccion) {
        case 1:
        spriteTextura.setRotation(0);
            
        break;
            
            
        case 2:
        spriteTextura.setRotation(180);
        break;


        case 3:
        spriteTextura.setRotation(-90);
        break;

        case 4:
        spriteTextura.setRotation(90);
        break;

        default:
        spriteTextura.setRotation(0);
            break;
    }




    }

    public void dispose() {
        texturaFlechas.dispose();
        
    }




}