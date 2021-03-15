package banner;

/**
 * crea la letra M en una matriz
 * @author grupo 3
 *
 */
public class LetterM extends MyCharacter {

	public LetterM(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos verticales a los extremos y dos trazos diagonales de extremos a mitad
	 * @return la matriz llena formando la letra M
	 */
	@Override
	public char[][] generate() {
		new VerticalStroke(area,symbol).generate(0).generate(area.length-1);
		new DiagonalStroke(area,symbol).generate(0,0);
		new DiagonalStroke(area, ' ').generate(area.length/2,(area[0].length/2));
		//new TransversalStroke(area,symbol).generate(8);
		new TransversalStroke(area,symbol).generate((area.length)/2,area[0].length/2,0);
		new EmptyPoints(area, symbol).generate(area.length-1);
		
		return area;
	}

}
