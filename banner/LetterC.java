/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea la letra C en una matriz
 * @author grupo 3
 */
public class LetterC extends MyCharacter {

    public LetterC(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en2 ocasiones y vertical en una ocasion dando la ubicacion  de inicio
     * @return la matriz con la letra E
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(0);
        return area;
    }
    
    
}
