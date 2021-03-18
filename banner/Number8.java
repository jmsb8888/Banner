package banner;

/**
 * crea el numero 8 en una matriz
 * @author grupo 3
 *
 */
public class Number8 extends MyCharacter{

	public Number8(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos verticales en los extremos de la matriz y los horizontales en la mitad y extremos de la matriz
	 * @return la matriz llena formando el numero 8
	 */
	@Override
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length-1).generate(area.length/2);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		return area;
	}
}
