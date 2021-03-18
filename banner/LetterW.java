package banner;

/**
 * crea la letra W en una matriz
 * @author grupo 3
 */
public class LetterW extends MyCharacter {

	public LetterW(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos verticales en los extremos de la matriz 
	 * llama a los metodos que crean trazos diagonales desde los extremos inferiores a la mitad de la matriz
	 * @return la matriz llena formando la letra W
	 */
	@Override
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(4,4);
		new TransversalStroke(area,symbol).generate(7,1,4);
		new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
		return area;
	}

}
