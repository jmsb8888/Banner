/**
 * 
 */
package banner;

/**
 * crea la letra U en una matriz
 * @author grupo 3
 *
 */
public class LetterU extends MyCharacter{

	public LetterU(char value, Size size,char symbol) {
		super(value, size,symbol);
	}

	/**
	 * llama a los metodos que crean los trazos verticales de los extremos
	 * llama al metodo que genera un trazo horizontal al final de la matriz
	 * @return
	 */
	@Override
	public char[][] generate() {
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new HorizontalStroke(area, symbol).generate(area.length-1);
		return area;
	}
}
