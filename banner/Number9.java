package banner;

/**
 * crea el numero 9 en una matriz
 * @author grupo 3
 *
 */
public class Number9 extends MyCharacter{

	public Number9(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos verticales en los extremos de la matriz y los horizontales en la mitad y extremos de la matriz
	 * llama al metodo que borra trazos en la segunda mitad del extremo izquierdo
	 * @return la matriz llena formando el numero 9
	 */
	@Override
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length-1).generate(area.length/2);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generateVertical((area.length/2)+1, 0, area.length-2);
		return area;
	}
}
