package banner;

/**
 * crea el numero 0 en una matriz
 * @author grupo 3
 */
public class Number0 extends MyCharacter {

	public Number0(char value, Size size, char symbol) {
		super(value, size, symbol);
	}
	
	/**
	 * llama a los metodos que generan trazos horizontales en los extremos
	 * llama a los metodos que crean trazos verticales en los extremos de la matriz
	 * @return la matriz llena formando el numero 0
	 */
	@Override
	public char[][] generate() {
        new HorizontalStroke(area,symbol).generate(0).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(0).generate(area.length-1);
        return area;
    }
}
