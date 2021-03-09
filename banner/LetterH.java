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
public class LetterH extends MyCharacter {

    public LetterH(char value, Size size,char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama a los metodos que crean el trazo horizontal y vertical e indica las posiciones en las cuales estos deben hacer el llenado de la matris
     * @return la matriz llena formando la letra A
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(area.length/2);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
        return area;
    }
    
    
}
