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
//        new HorizontalStroke(area,symbol).generate(0).generate(area.length-(area.length/2));
//        new VerticalStroke(area,symbol).generate(0);
//        new EmptyPoints(area, '').generate3();
      new DiagonalStroke(area, symbol).generate(0);
        return area;
    }
}
