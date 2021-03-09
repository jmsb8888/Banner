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
public abstract class MyCharacter {
    private char value;
    protected Size size;
    protected char symbol;
    protected char[][] area;

    public MyCharacter(char value, Size size, char symbol) {
        this.value = value;
        this.size = size;
        this.symbol = symbol;
        this.area = new char[size.getWidth()][size.getHeight()];
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {
                area[i][j] = ' ';
            }
        } 
    }

   
    public abstract char[][] generate();
}
