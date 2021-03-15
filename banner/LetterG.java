/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra G en una matriz
 * @author grupo 3
 */
public class LetterG extends MyCharacter {

    public LetterG(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 3 ocasiones y el vertical en dos, ademas, llena las pociciones determinadas en espacio y da las ubicaciones de llenado
     * @returnla matriz con la letra G
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length/2).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
        new EmptyPoints(area,' ' ).generate3((area.length/2),1, (area[area.length/2].length/2-1));
        new EmptyPoints(area, ' ').generate4(1, area[0].length-1, (area.length/2)-1);
        return area;
    }
    
    
}
