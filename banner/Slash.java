package banner;

/**
 * crea el caracter '/' en una matriz
 * @author grupo 3
 *
 */
public class Slash extends MyCharacter {

	public Slash(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama el metodo de trazo diagonal por la mitad de la matriz
	 * @return la matriz llena con el caracter /
	 */
	public char[][] generate() {
		new TransversalStroke(area,symbol).generate(area[0].length-1);
		return area;
	}

}
