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
public class VerticalStroke extends Stroke{

    public VerticalStroke(char[][] area, char symbol) {
        super(area, symbol);
    }

    @Override
    public VerticalStroke generate(int pos) {
        for (int i = 0; i < area.length; i++) {
            area[i][pos] = symbol;
        }
        return this;
    }
    
}
