package banner;

/**
 * crea el numero 5 en una matriz
 * @author grupo 3
 *
 */
public class Number5 extends MyCharacter{

	public Number5(char value, Size size,char symbol) {
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
		new EmptyPoints(area, ' ').generateVertical(1, area.length-1, (area.length/2)-1).generateVertical((area.length/2)+1, 0, area.length-2);
		return area;
	}
}
