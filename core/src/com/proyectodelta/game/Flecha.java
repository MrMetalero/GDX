package com.proyectodelta.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Flecha{

    /**Texturas */
    Texture texturaFlechas = new Texture("flecha.png");
    TextureRegion regiontextura = new TextureRegion(texturaFlechas);

    /**Estado */
    boolean shouldDraw; // comprueba si debe printearse
    boolean seleccionada; // comprueba si se ha pulsado la tecla correspondiente a esa flecha
    boolean isNext = false; // comprueba si es la flecha activa ahora mismo (La que se debe presionar)

    /**Direccion */
    int flechaDireccion = 0; // 1- 0 arriba      2- 90 izquierda      3- 180 abajo    4- 270 -derecha
    int rotacion = 0;
    static int posY = 50;
    static int posicionActualFlechas = 50;
    int posX;
    


    Flecha(){

    }

    Flecha(int flechaDir){

        this.flechaDireccion = flechaDir;
        shouldDraw = true;

        switch (flechaDireccion) {
            case 1:
                this.rotacion = 0;
                posX = posicionActualFlechas;
                posicionActualFlechas += 55;
            break;
                
                
            case 2:
                this.rotacion = 90;
                posX = posicionActualFlechas;
                posicionActualFlechas += 55;
            break;


            case 3:
                this.rotacion = 180;
                posX = posicionActualFlechas;
                posicionActualFlechas += 55;
            break;

            case 4:
                this.rotacion = 270;
                posX = posicionActualFlechas;
                posicionActualFlechas += 55;
            break;

            default:
                this.rotacion = 0;
                posX = posicionActualFlechas;
                posicionActualFlechas += 55;
                break;
        }




    }

    public void dispose() {
        texturaFlechas.dispose();
        
    }

    @Override
    public String toString() {
        return "Flecha [texturaFlechas=" + texturaFlechas + ", regiontextura=" + regiontextura + ", shouldDraw=" + shouldDraw
                + ", seleccionada=" + seleccionada + ", isNext=" + isNext + ", flechaDireccion=" + flechaDireccion
                + ", rotacion=" + rotacion + ", posX=" + posX + "]\n\n";
    }




}