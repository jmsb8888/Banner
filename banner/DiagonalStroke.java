/**
 * 
 */
package banner;
import banner.Size;

/**crea trazos diagonales
 * @author grupo 3
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
		for (int i = pos; i < area.length; i++) {
			for (int j = pos; j <area[0].length; j++) {
				if(i==j)
				area[i][j] = symbol;
			}
			
		}
		return this;
	}
	public DiagonalStroke generate(int pos1, int pos2) {
		for (int i = pos1, j=pos2;  i < area.length; i++, j++) {
			area[i][j] = symbol;
		}
		
		return this;
	}


}
