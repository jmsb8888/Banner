/**
 * 
 */
package banner;

/**
 * @author Usuario
 *
 */
public class LetterU extends MyCharacter{

	/**
	 * 
	 */
	public LetterU(char value, Size size,char symbol) {
		super(value, size,symbol);
	}

	public char[][] generate() {
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new HorizontalStroke(area, symbol).generate(area.length-1);
		return area;
	}
}
