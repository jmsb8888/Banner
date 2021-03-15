/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *crea trazos horizontales 
 * @author grupo 3
 */
public class HorizontalStroke extends Stroke{

    /**constructor heredado de la clase stroke
     * @param area
     * @param symbol
     */
    public HorizontalStroke(char[][] area, char symbol) {
        super(area, symbol);
    }

    /**
     * llena el  las pociciones de la matriz inidcadas con el simbolo escogido
     * @param pos posicion de las filas a llenar
     * @return
     */
    @Override
    public HorizontalStroke generate(int pos) {
        for (int i = 0; i < area[pos].length; i++) {
            area[pos][i] = symbol;
        }
        return this;
    }
    
}
