package banner;

/**
 * crea el numero 2 en una matriz
 * @author grupo 3
 *
 */
public class Number2 extends MyCharacter{

	public Number2(char value, Size size,char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos verticales en los extremos y trazos horizontales, en los extremos y el medio
	 * llama al metodo que borra trazos para los trazos verticales
	 * @return la matriz llena formando el numero 2
	 */
	@Override
	public char [][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2).generate(area.length-1);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generateVertical(1, 0,(area.length/2)-1).generateVertical((area.length/2)+1, area[0].length-1, area.length-2);
		return area;
	}
}
