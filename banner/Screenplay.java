/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea el carcter '-' en una matriz
 * @author grupo 3
 */
public class Screenplay extends MyCharacter {

    public Screenplay(char value, Size size, char symbol) {
        super(value, size,symbol);
    }

    /**
     * llama la creacion de trazo horizontal en 1 ocasion
     * @return la matriz con el caracter -
     */
    @Override
    public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(area.length/2);
        return area;
    }
    
    
}
