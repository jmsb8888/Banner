/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra F en una matriz
 * @author uptc
 */
public class LetterF extends MyCharacter {

    public LetterF(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 2 ocasiones y el vertical en una ademas, da las ubicaciones de llenado
     * @returnla matriz con la letra F
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length/2);
        new VerticalStroke(area,symbol).generate(0);
        return area;
    }
    
    
}
