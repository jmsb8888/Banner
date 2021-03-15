package banner;

/**Crea la letra K en una matriz
 * @author grupo 3
 *
 */
public class LetterK extends MyCharacter {

	public LetterK(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 *llama la creacion de trazos diagonales desde la mitad a los extremos superior e inferior, junto con un trazo vertical 
	 *@return la matriz con la letra K
	 */
	@Override
	public char[][] generate() {
		new VerticalStroke(area,symbol).generate(0);
		new DiagonalStroke(area,symbol).generate(area.length/2,2);
		new TransversalStroke(area,symbol).generate(area.length/2,2,0);
		return area;
	}

}
