/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;
//import  banner.MyCharacter;

/**
 *
 * @author grupo 3
 */
public class Banner {
	private String message;

	/**
	 * constructor
	 * @param message mensage a dibujar
	 */
	public Banner(String message) {
		this.message = message;
	}

	/**
	 * administra la creacion de nuevas letras
	 * @param size tamaï¿½o de la matriz
	 * @param symbol caracter con el cual se va a llenar
	 * @return
	 */
	public Matrix[] matrix () {
		char characterr = ' ';
		char[] characterAux = message.toCharArray();
		Matrix[] matrix = new Matrix[characterAux.length];
		for (int i = 0; i < characterAux.length; i++) {

			characterr = characterAux[i];
			switch (characterr) {
			case 'A':
				matrix[i] = new Matrix((new LetterA('A', new Size(9, 9), '*').generate()));
				/**char[][] aux = matrix[i].getCharacterI();
              for (int k = 0; k < matrix[i].getCharacterI().length; k++) {
                for (int j = 0; j < matrix[i].getCharacterI()[i].length; j++) {
                  System.out.print(aux[i][j]);
                }
                System.out.println("");
              }*/

				break;
			case 'B':
				matrix[i] = new Matrix(new LetterB('B', new Size(9, 9), '*').generate());
				break;
			case 'C':
				matrix[i] = new Matrix(new LetterC('C', new Size(9, 9), '*').generate());
				break;
			case 'D':
				matrix[i] = new Matrix(new LetterD('D', new Size(9, 9), '*').generate());
				break;
			case 'E':
				matrix[i] = new Matrix(new LetterE('E', new Size(9, 9), '*').generate());
				break;
			case 'F':
				matrix[i] = new Matrix(new LetterF('F', new Size(9, 9), '*').generate());
				break;
			case 'G':
				matrix[i] = new Matrix(new LetterG('G', new Size(9, 9), '*').generate());
				break;
			case 'H':
				matrix[i] = new Matrix(new LetterH('H', new Size(9, 9), '*').generate());
				break;
			case 'I':
				matrix[i] = new Matrix(new LetterI('I', new Size(9, 9), '*').generate());
				break;
			case 'J':
				matrix[i] = new Matrix(new LetterJ('J', new Size(9, 9), '*').generate());
				break;
			case 'K':
				matrix[i] = new Matrix(new LetterK('K', new Size(9, 9), '*').generate());
				break;
			case 'L':
				matrix[i] = new Matrix(new LetterL('L', new Size(9, 9), '*').generate());
				break;
			case 'M':
				matrix[i] = new Matrix(new LetterM('M', new Size(9, 9), '*').generate());
				break;
			case 'N':
				matrix[i] = new Matrix(new LetterN('N', new Size(9, 9), '*').generate());
				break;
			case 'Ñ':
				matrix[i] = new Matrix(new LetterNmasUno('Ñ', new Size(9, 9), '*').generate());
				break;
			case 'O':
				matrix[i] = new Matrix(new LetterO('O', new Size(9, 9), '*').generate());
				break;
			case 'P':
				matrix[i] = new Matrix(new LetterP('P', new Size(9, 9), '*').generate());
				break;
			case 'Q':
				matrix[i] = new Matrix(new LetterQ('Q', new Size(9, 9), '*').generate());
				break;
			case 'R':
				matrix[i] = new Matrix(new LetterR('R', new Size(9, 9), '*').generate());
				break;
			case 'S':
				matrix[i] = new Matrix(new LetterS('S', new Size(9, 9), '*').generate());
				break;
			case 'T':
				matrix[i] = new Matrix(new LetterT('T', new Size(9, 9), '*').generate());
				break;
			case 'U':
				matrix[i] = new Matrix(new LetterU('U', new Size(9, 9), '*').generate());
				break;
			case 'V':
				matrix[i] = new Matrix(new LetterV('V', new Size(9, 9), '*').generate());
				break;
			case 'W':
				matrix[i] = new Matrix(new LetterW('W', new Size(9, 9), '*').generate());
				break;
			case 'X':
				matrix[i] = new Matrix(new LetterX('X', new Size(9, 9), '*').generate());
				break;
			case 'Y':
				matrix[i] = new Matrix(new LetterY('Y', new Size(9, 9), '*').generate());
				break;
			case 'Z':
				matrix[i] = new Matrix(new LetterZ('Z', new Size(9, 9), '*').generate());
				break;
			case '1':
				matrix[i] = new Matrix(new Number1('1', new Size(9, 9), '*').generate());
				break;
			case '2':
				matrix[i] = new Matrix(new Number2('2', new Size(9, 9), '*').generate());
				break;
			case '3':
				matrix[i] = new Matrix(new Number3('3', new Size(9, 9), '*').generate());
				break;
			case '4':
				matrix[i] = new Matrix(new Number4('4', new Size(9, 9), '*').generate());
				break;
			case '5':
				matrix[i] = new Matrix(new Number5('5', new Size(9, 9), '*').generate());
				break;
			case '6':
				matrix[i] = new Matrix(new Number6('6', new Size(9, 9), '*').generate());
				break;
			case '7':
				matrix[i] = new Matrix(new Number7('7', new Size(9, 9), '*').generate());
				break;
			case '8':
				matrix[i] = new Matrix(new Number8('8', new Size(9, 9), '*').generate());
				break;
			case '9':
				matrix[i] = new Matrix(new Number9('9', new Size(9, 9), '*').generate());
				break;
			case '0':
				matrix[i] = new Matrix(new LetterH('H', new Size(9, 9), '*').generate());
			}
		}
		return matrix;
	}
}














