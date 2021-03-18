package banner;

/**
 * crea el numero 1 en una matriz
 * @author grupo 3
 *
 */
public class Number1 extends MyCharacter{

	public Number1(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama los metodos que crean trazos verticales en la mitad de la matriz y los metodos que crean trazos horizontales en los extremos de la matriz
	 * llama al metodo que elimina trazos en la mitad superior de la matriz
	 * @return la matriz llena formando el numero 1
	 */
	@Override
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(area.length/2);
		new EmptyPoints(area, ' ').generateHorizontal(0, (area.length/2)+1, area.length-1);
		return area;
	}
}
