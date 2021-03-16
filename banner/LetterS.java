package banner;

/**
 * crea la letra S en una matriz
 * @author grupo 3
 *
 */
public class LetterS extends MyCharacter {

	public LetterS(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama los metodos para crear los trazos horizontales en la primera, en la mitad de la matriz y al extremo final
	 * asi llama al otro metodo que crea trazos verticales en los extremos y llama a los metodos que borran para dejar la mitad de los trazos verticales en los extremos
	 * @return la matriz llena formando la letra S
	 */
	@Override
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generate4(1, area[0].length-1,area.length/2).generate4((area.length/2)+1, 0, area.length-2);
		return area;
	}
}
