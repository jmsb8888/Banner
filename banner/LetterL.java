/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra L en una matriz
 * @author uptc
 */
public class LetterL extends MyCharacter {

    public LetterL(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 1 ocasion y el vertical en una,ademas,  da las ubicaciones de llenado
     * @returnla matriz con la letra L
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(0);
        return area;
    }
    
    
}
