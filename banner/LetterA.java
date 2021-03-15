/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra A en una matriz
 * @author grupo 3
 */
public class LetterA extends MyCharacter {

    public LetterA(char value, Size size,char symbol) {
        super(value, size,symbol);
    }
    /**
     * llama a los metodos que crean el trazo horizontal y vertical en dos ocaciones e indica las posiciones en las cuales estos deben hacer el llenado de la matris
     * @return la matriz llena formando la letra A
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length/2);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length - 1);
        return area;
    }
    
    
}
