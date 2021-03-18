/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 * crea el caracter ' ' en una matriz
 * @author grupo 3
 */
public class Space extends MyCharacter {

    public Space(char value, Size size, char symbol) {
        super(value, size,symbol);
    }
    /**
     * retorna la matriz sin hacer trazos
     * @return la matriz llena con el caracter ' '
     */
    @Override
    public char[][] generate() {
        return area;
    }
    
    
}
