/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *esta clase determina las propiedas de los diferentes trazos
 * @author uptc
 */
public abstract class Stroke {
    protected char[][] area;
    protected char symbol;

    /**
     * constructor
     * @param area matris a llenar
     * @param symbol caracter con el cual se va a llenar
     */
    public Stroke(char[][] area, char symbol) {
        this.area = area;
        this.symbol = symbol;
    }

    /**
     * metodo abstracto de super clase que generara un trazo
     * @param pos posicion de filas o culmnas a llenar
     * @return
     */
    public abstract Stroke generate(int pos);
}
