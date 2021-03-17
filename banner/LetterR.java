package banner;

/**
 * crea la letra R en una matriz
 * @author grupo 3
 *
 */
public class LetterR extends MyCharacter {

	public LetterR(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos horizontales en la primera linea y en la mitad
	 * asi mismo llama los metodos para crear trazos verticales en los extremos y un metodo diagonal desde la mitad hasta el final
	 * @return la matriz llena formando la letra R
	 */
	@Override
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generateVertical((area.length/2), area[0].length-1, area.length-1);
		new DiagonalStroke(area, symbol).generate(area.length/2,area.length/2);
		return area;
	}

}
