/**
 * 
 */
package banner;

/**crea trazos diagonales
 * @author Usuario
 *
 */
public class TransversalStroke extends Stroke{

	/**
	 * @param area
	 * @param symbol
	 *
	 */
	public TransversalStroke(char[][] area, char symbol) {
		super(area, symbol);
	}
	
	public TransversalStroke generate(int pos) {
		for (int i = 0, j = pos; j >= 0; i++, j--) {
			area[i][j] = symbol;
		}
		return this;
	}
	public TransversalStroke generate(int pos1, int pos2, int pos3){
		for (int i = pos1, j=pos2;  i>=pos3; i--, j++) {
			area[i][j] = symbol;
		}
		return this;
	}
}
