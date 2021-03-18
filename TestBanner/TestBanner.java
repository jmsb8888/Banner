/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestBanner;

import banner.*;

/**muestra el baner 
 *
 * @author grupo 3 
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
    public void showMatrizz(Matrix[] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
           char[][] aux = matrix[i].getCharacterI();
        for (int k = 0; k < matrix[i].getCharacterI().length; k++) {
            for (int j = 0; j < matrix[i].getCharacterI()[i].length; j++) {
                System.out.print(aux[k][j]);
            }
            System.out.println("");
        } System.out.println("");
    }
        }

        public void showMatrix(int row, char[][] matrix){
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[row][i]);
            }
        }
    public void showMatrixHorizontal(Matrix[] matrix) {
        int rows = matrix[0].getCharacterI().length;
        for (int l = 0; l < rows; l++) {
            for (int j = 0; j < matrix.length; j++) {
                this.showMatrix(l, matrix[j].getCharacterI());
                System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        TestBanner tb = new TestBanner();
        tb.showMatriz(new LetterA('A', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterB('B', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterC('C', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterD('D', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterE('E', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterF('F', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterG('G', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterH('H', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterI('I', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterJ('J', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterK('K', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterL('L', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterM('M', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterN('N', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterNmasUno('~', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterO('O', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterP('P', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterQ('Q', new Size(9, 9),'*').generate());
        System.out.println("");
        tb.showMatriz(new LetterR('R', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterS('S', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterT('T', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterU('U', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterV('V', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterW('W', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterX('X', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterY('Y', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new LetterZ('Z', new Size(9, 9), '*').generate());
        System.out.println("");
        System.out.println("Numbers");
        System.out.println("");
        tb.showMatriz(new Number0('0', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number1('1', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number2('2', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number3('3', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number4('4', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number5('5', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number6('6', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number7('7', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number8('8', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Number9('9', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Space(' ', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Screenplay('-', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Underscore('_', new Size(9, 9), '*').generate());
        System.out.println("");
        tb.showMatriz(new Slash('/', new Size(9, 9), '*').generate());
        System.out.println("");
        //tb.showMatrizz(new Banner("HOLA").matrix(new Size(8,8), '*'));
        tb.showMatrixHorizontal(new Banner("HOLA MUNDO").matrix(new Size(9,9), '*'));
        //tb.showMatriz(new Banner("Hola Mundo").generate(new Size(8,8), '*'));
    }
}
