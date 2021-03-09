/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra E en una matriz
 * @author uptc
 */
public class LetterE extends MyCharacter {

    public LetterE(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 3 ocasiones y el vertical una vez ademas, da las ubicaciones de llenado
     * @returnla matriz con la letra E
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length/2).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(0);
        return area;
    }
    
    
}
