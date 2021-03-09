/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra I en una matriz
 * @author uptc
 */
public class LetterI extends MyCharacter {

    public LetterI(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 2 ocasiones y el vertical en una,ademas,  da las ubicaciones de llenado
     * @returnla matriz con la letra I
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(area[0].length/2);
        return area;
    }
    
    
}
