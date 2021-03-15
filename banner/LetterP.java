package banner;

/**
 * crea la letra P en una matriz 
 * @author grupo 3
 *
 */
public class LetterP extends MyCharacter{

	public LetterP(char value, Size size, char symbol) {
		super(value, size,symbol);
	}
	
	/**
	 * llama a los metodos que trazan lineas verticales en los extremos y un metodo que elimina trazos quitando la mitad de la linea derecha
	 * llama a otros metodos que trazan lineas horizontales en la primera linea y en la linea media
	 * @return la matriz llena formando la letra P
	 */
	@Override
	public char[][] generate() {
		new HorizontalStroke(area, symbol).generate(0).generate(area.length/2);
		new VerticalStroke(area, symbol).generate(0).generate(area.length-1);
		new EmptyPoints(area, ' ').generate4((area.length/2), area[0].length-1, area.length-1);
		return area;
	}
}