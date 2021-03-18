package banner;

/**
 * crea el numero 3 en una matriz
 * @author grupo 3
 */
public class Number3 extends MyCharacter {

	public Number3(char value, Size size, char symbol) {
		super(value, size, symbol);
	}
	
	/**
	 * llama los metodos que crean trazos horizontales en los extremos y el medio de la matriz
	 * llama al metodo que crea un trazo vertical en el extremo derecho de la matriz
	 * @return la matriz llena formando el numero 3
	 */
	@Override
	public char[][] generate() {
		new HorizontalStroke(area,symbol).generate(0).generate(area.length/2).generate(area.length-1);
        new VerticalStroke(area,symbol).generate(area.length-1);
		return area;
	}
}
