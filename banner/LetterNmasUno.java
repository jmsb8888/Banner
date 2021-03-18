package banner;

/**
 * crea la letra "N~" en una matriz
 * @author grupo 3
 *
 */
public class LetterNmasUno extends MyCharacter {

	public LetterNmasUno(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama dos metodos que trazan lineas verticales en los extremos
	 * a su vez llama un metodo para trazar una linea diagonal entre las dos verticales anteriores
	 * tambien llama un metodo que traza una linea horizontal encima de todos los trazos anteriores
	 * @return la matriz llena formando la letra NmasUno(�)
	 */
	@Override
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(0);
		new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
		new HorizontalStroke(area,' ').generate(1).generate(2);
		new EmptyPoints(area,symbol).generateVertical(2,0,2).generateVertical(2,area[0].length-1,2);
		new HorizontalStroke(area,symbol).generate(0);
		return area;
	}

}
