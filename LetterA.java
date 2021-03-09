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
public class LetterA extends MyCharacter {

    public LetterA(char value, Size size,char symbol) {
        super(value, size,symbol);
    }

    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length/2);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length - 1);
        return area;
    }
    
    
}
