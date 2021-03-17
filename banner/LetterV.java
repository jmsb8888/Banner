package banner;

/**
 * @author grupo 3
 *
 */
public class LetterV extends MyCharacter {

	public LetterV(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * 
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
