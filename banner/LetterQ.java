/**
 * 
 */
package banner;

/**crea la letra Q en una matriz
 * @author Grupo 3
 *
 */
public class LetterQ extends MyCharacter{

	/**
	 * @param value 
	 * @param size 
	 * @param symbol 
	 * 
	 */
	public LetterQ(char value, Size size, char symbol) {
		super(value, size,symbol);
	}

	public char[][] generate() {
        new VerticalStroke(area,symbol).generate(0).generate(area[0].length-1);
        new HorizontalStroke(area,' ').generate(area.length-1).generate(area.length-2);
		new HorizontalStroke(area,symbol).generate(0).generate(area.length-3);
      	new DiagonalStroke(area, symbol).generate(area.length/2, area.length/2);
		new EmptyPoints(area, ' ').generate(0).generate(area.length-3);
		new EmptyPoints(area,' ').generate1(0).generate1(6);
        return area;
    }
}
