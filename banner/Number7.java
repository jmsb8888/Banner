package banner;

/**
 * crea el numero 7 en una matriz
 * @author grupo 3
 *
 */
public class Number7 extends MyCharacter{

	public Number7(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	/**
	 * llama al metodo que crea trazos verticales en el extremo derecho
	 * llama al metodo que crea trazos horizontales en laa primera linea de la matriz
	 * @return
	 */
	@Override
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0);
		new VerticalStroke(area, symbol).generate(area.length-1);
		return area;
	}
}
