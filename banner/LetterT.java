/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra T en una matrz
 * @author grupo 3
 */
public class LetterT extends MyCharacter {

    public LetterT(char value, Size size,char symbol) {
        super(value, size,symbol);
    }
    /**
     * llama a los metodos que crean el trazo horizontal y vertical e indica las posiciones en las cuales estos deben hacer el llenado de la matris
     * @return la matriz llena formando la letra T
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0);
        new VerticalStroke(area,symbol).generate(area[0].length/2);
        return area;
    }
    
    
}
