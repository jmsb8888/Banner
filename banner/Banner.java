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
	 * @param size tama�o de la matriz
	 * @param symbol caracter con el cual se va a llenar
	 * @return
	 */
	public Matrix[] matrix (Size size, char symbol) {
		char character = ' ';
		char[] characterAux = message.toCharArray();		
		Matrix[] matrix = new Matrix[characterAux.length];
		for (int i = 0; i < characterAux.length; i++) {
			character = characterAux[i];
			switch (character) {
			case ' ':
				matrix[i]= new Matrix(new Space(' ', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'A':
				matrix[i] = new Matrix((new LetterA('A', new Size(size.getHeight(), size.getWidth()), symbol).generate()));
				break;
			case 'B':
				matrix[i] = new Matrix(new LetterB('B', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'C':
				matrix[i] = new Matrix(new LetterC('C', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'D':
				matrix[i] = new Matrix(new LetterD('D', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'E':
				matrix[i] = new Matrix(new LetterE('E', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'F':
				matrix[i] = new Matrix(new LetterF('F', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'G':
				matrix[i] = new Matrix(new LetterG('G', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'H':
				matrix[i] = new Matrix(new LetterH('H', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'I':
				matrix[i] = new Matrix(new LetterI('I', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'J':
				matrix[i] = new Matrix(new LetterJ('J', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'K':
				matrix[i] = new Matrix(new LetterK('K', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'L':
				matrix[i] = new Matrix(new LetterL('L', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'M':
				matrix[i] = new Matrix(new LetterM('M', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'N':
				matrix[i] = new Matrix(new LetterN('N', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '�':
				matrix[i] = new Matrix(new LetterNmasUno('�', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'O':
				matrix[i] = new Matrix(new LetterO('O', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'P':
				matrix[i] = new Matrix(new LetterP('P', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'Q':
				matrix[i] = new Matrix(new LetterQ('Q', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'R':
				matrix[i] = new Matrix(new LetterR('R', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'S':
				matrix[i] = new Matrix(new LetterS('S', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'T':
				matrix[i] = new Matrix(new LetterT('T', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'U':
				matrix[i] = new Matrix(new LetterU('U', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'V':
				matrix[i] = new Matrix(new LetterV('V', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'W':
				matrix[i] = new Matrix(new LetterW('W', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'X':
				matrix[i] = new Matrix(new LetterX('X', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'Y':
				matrix[i] = new Matrix(new LetterY('Y', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case 'Z':
				matrix[i] = new Matrix(new LetterZ('Z', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '1':
				matrix[i] = new Matrix(new Number1('1', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '2':
				matrix[i] = new Matrix(new Number2('2', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '3':
				matrix[i] = new Matrix(new Number3('3', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '4':
				matrix[i] = new Matrix(new Number4('4', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '5':
				matrix[i] = new Matrix(new Number5('5', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '6':
				matrix[i] = new Matrix(new Number6('6', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '7':
				matrix[i] = new Matrix(new Number7('7', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '8':
				matrix[i] = new Matrix(new Number8('8', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '9':
				matrix[i] = new Matrix(new Number9('9', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '0':
				matrix[i] = new Matrix(new Number0('0', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '-':
				matrix[i] = new Matrix(new Screenplay('0', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '_':
				matrix[i] = new Matrix(new Underscore('0', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
			case '/':
				matrix[i] = new Matrix(new Slash('0', new Size(size.getHeight(), size.getWidth()), symbol).generate());
				break;
				
				default:
					System.out.println("Existe un caracter invalido en el mensage");
					System.exit(0);
			}

		}
		return matrix;
	}
}














