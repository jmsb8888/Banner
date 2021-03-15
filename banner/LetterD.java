/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra D en una matriz
 * @author grupo 3
 */
public class LetterD extends MyCharacter {

    public LetterD(char value, Size size, char symbol) {
        super(value, size,symbol);
    }
    /**
     * llama a los metodos que crean el trazo horizontal y vertical en dos ocaciones ademas del punto en blanco
     * e indica las posiciones en las cuales estos deben hacer el llenado de la matriz
     * @return la matriz llena formando la letra D
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length - 1);
        new EmptyPoints(area, ' ').generate4(0, area[0].length-1, 0).generate4(area.length-1, area[0].length-1, area.length-1);
        return area;
    }
    
    
}
