/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *
 * @author uptc
 */
public abstract class Stroke {
    protected char[][] area;
    protected char symbol;

    public Stroke(char[][] area, char symbol) {
        this.area = area;
        this.symbol = symbol;
    }
            
    
    public abstract Stroke generate(int pos);
}
