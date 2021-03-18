package banner;

/**
 * crea la letra  X en una matriz
 * @author grupo 3
 */
public class LetterX extends MyCharacter {

	public LetterX(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que generan trazos diagonales en las puntas superiores de la matriz   
	 * @return la matriz llena formando la letra X
	 */
	@Override
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(0);
		new TransversalStroke(area,symbol).generate(area[0].length-1);
		return area;
	}

}
