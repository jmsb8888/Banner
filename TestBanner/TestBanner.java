/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestBanner;

import banner.LetterA;
import banner.LetterH;
import banner.LetterT;
import banner.Size;

/**
 *
 * @author uptc
 */
public class TestBanner {
    public void showMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        TestBanner tb = new TestBanner();
        tb.showMatriz(new LetterA('A', new Size(19, 19),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterH('H', new Size(19, 19),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterT('T', new Size(19, 19),'*').generate());

        //tb.showMatriz(new Banner("Hola Mundo").generate(new Size(8,8), '*'));
        
    }
}
