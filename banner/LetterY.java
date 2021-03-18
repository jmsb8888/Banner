package banner;

/**
 * crea la letra Y en una matriz
 * @author grupo 3
 *
 */
public class LetterY extends MyCharacter {

	public LetterY(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos diagonales desde las esquinas superiores hasta la mitad de la matriz y al metodo de trazos verticales en el centro de la matriz
	 * llamando los metodos empty borra los trazos sobrantes en la mitad superior y la diagonales siguientes de la mitad de la matriz
	 * @return la matriz llena formando la letra Y
	 */
	@Override
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(0);
		new DiagonalStroke(area, ' ').generate(area.length/2,area[0].length/2);
		new TransversalStroke(area,symbol).generate((area.length/2)-1,((area[0].length/2)+1),0);
		new VerticalStroke(area,symbol).generate(area.length/2);
		new EmptyPoints(area, ' ').generateVertical(0,area[0].length/2,(area.length/2)-1);
		return area;
	}

}
