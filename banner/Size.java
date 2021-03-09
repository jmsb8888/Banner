/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *la clase contiene los objetos que dan el valor al ancho y alto de la columna
 * @author uptc
 */
public class Size {
    private int  width;
    private int height;

    /**
     * constructor
     * @param width ancho de la matriz
     * @param height alto de la matriz
     */
    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * extrae el ancho de la matriz poara usarlo en otra clase+
     * @return ancho de la matriz
     */
    public int getWidth(){
       return width;
    }

    /**
     * extrae el altor de la matriz para usarlo fuera de la clase
     * @return el alto de la matriz
     */
    public int getHeight() {
        return height;
    }

        
}
