package banner;

/**
 * crea el numero 6 en una matriz
 * @author grupo 3
 *
 */
public class Number6 extends MyCharacter{

	public Number6(char value, Size size, char symbol) {
		super(value, size, symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos verticales en los extremos de la matriz y los horizontales en la mitad y extremos de la matriz
	 * llama el metodo que elimina trazos en la mitad inferior izquierda
	 * @return la matriz llena formando el numero 6
	 */
	@Override
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generateVertical(1, area.length-1, (area.length/2)-1);
		return area;
	}
}
