package banner;

/**
 * crea la letra V en una matriz
 * @author grupo 3
 * 
 */
public class LetterV extends MyCharacter {

	public LetterV(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que crean trazos verticales en los extremos, llama a los metodos que crean trazos diagonales del centro inferior a los medios extremos
	 * se llama a los metodos que borran lineas para recortar los trazos verticales
	 * @return la matriz llena formando la letra V
	 */
	@Override
	public char[][] generate() {
		new DiagonalStroke(area,symbol).generate(area.length/2,0);
		new TransversalStroke(area,symbol).generate(area.length-2, area.length/2+1, area.length/2);
		new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
		new EmptyPoints(area, ' ').generateVertical(area.length/2+1, 0, area.length-1).generateVertical(area.length/2+1,area[0].length-1, area.length-1);
		return area;
	}

}
