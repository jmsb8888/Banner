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
public class HorizontalStroke extends Stroke{

    public HorizontalStroke(char[][] area, char symbol) {
        super(area, symbol);
    }

    @Override
    public HorizontalStroke generate(int pos) {
        for (int i = 0; i < area[pos].length; i++) {
            area[pos][i] = symbol;
        }
        return this;
    }
    
}
