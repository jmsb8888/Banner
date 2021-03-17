/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra B en una matriz
 * @author grupo 3
 */
public class LetterB extends MyCharacter {

    public LetterB(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 3 ocasiones, el vertical en dos y el punto placo en 3 y da las ubicaciones de llenado
     * @return la matriz con la letra B
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length/2).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
        new EmptyPoints(area, ' ').generateVertical(0, area[0].length-1, 0).generateVertical(area.length-1, area[0].length-1, area.length-1);
        return area;
    }
    
    
}
