/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *crea un trazo vertical
 * @author uptc
 */
public class VerticalStroke extends Stroke{
    /**
     * constructor heredado de la clase Stroke
     * @param area matriz a llenar
     * @param symbol caracter con el cual se va a llenar la matriz
     */
    public VerticalStroke(char[][] area, char symbol) {
        super(area, symbol);
    }

    /**
     *llena el trazo indicado segun la posicion que se le indique
     * @param pos posicion de las columnas a  llenar
     * @return
     */
    @Override
    public VerticalStroke generate(int pos) {
        for (int i = 0; i < area.length; i++) {
            area[i][pos] = symbol;
        }
        return this;
    }
    
}
