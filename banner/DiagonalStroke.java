/**
 * 
 */
package banner;

/**crea trazos diagonales
 * @author Usuario
 *
 */
public class DiagonalStroke extends Stroke{

	/**
	 * @param area 
	 * @param symbol 
	 * 
	 */
	public DiagonalStroke(char[][] area, char symbol) {
		super(area, symbol);
	}
	
	public DiagonalStroke generate(int pos) {
		for (int i = pos; i < area[pos].length; i++) {
			area[i][0] = symbol;
		}
		for (int j = pos; j < area.length; j++) {
			area[0][j] = symbol;
		}
		return this;
	}

}
