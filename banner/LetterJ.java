/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra J en una matriz
 * @author grupo 3
 */
public class LetterJ extends MyCharacter {

    public LetterJ(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 2 ocasiones y el vertical en una, luego invoca un arreglo de espacio, y da las ubicaciones de llenado
     * @return la matriz con la letra J
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(area[0].length/2);
        new EmptyPoints(area,' ').generateHorizontal(area.length-1, area[0].length/2+1, area[0].length-1);
        return area;
    }
    
    
}
