package banner;

/**
 * crea la letra N en una matriz
 * @author grupo 3 
 *
 */
public class LetterN extends MyCharacter {

	public LetterN(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crea dos trazos verticales en los extremos 
	 * asi mismo un trazo diagonal del extremo izquierdo de arriba al extremo derecho bajo
	 * @return
	 */
	@Override
	public char[][] generate() {
		new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
		new DiagonalStroke(area,symbol).generate(0);
		return area;
	}

}
